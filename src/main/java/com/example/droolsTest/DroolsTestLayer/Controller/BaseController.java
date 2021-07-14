package com.example.droolsTest.DroolsTestLayer.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.droolsTest.DroolsTestLayer.Model.BusinessException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;

public class BaseController {
	@Autowired
	protected HttpSession session;

	//异常处理
	@ExceptionHandler
	public JSONObject exceptionHandle(Exception e, WebRequest request)
			throws Exception {

		if (e instanceof BusinessException) {
			System.out.println("this is a BusinessException");
			JSONObject ret = new JSONObject();
			ret.put("header", ((BusinessException) e).getHeader());
			return ret;
		} else{
			System.out.println("this is a normalException");
			e.printStackTrace();
			BusinessException be = new BusinessException(-1000,e.getMessage());
			JSONObject ret = new JSONObject();
			ret.put("header", be.getHeader());
			return ret;
		}
	}
	/**
	 * 获取登陆用户信息
	 * @return
	 */
	protected JSONObject getUserInfo() throws BusinessException {
		JSONObject user = (JSONObject)session.getAttribute("loginInfo");
		if(user==null){
			throw new BusinessException(50014,"用户没有登陆");
//			user=new JSONObject();
//			user.put("tenantId","tenant-000001");
//			user.put("userId","user-000001");
//			return user;
		}
		else{
			System.out.println(user);
		}
		return user;
	}

	/**
	 * 设置登陆用户信息
	 * @return
	 */
	protected void setUserInfo(JSONObject loginInfo) throws BusinessException {
		session.setAttribute("loginInfo", loginInfo);
	}
	/**
	 * 删除登陆用户信息
	 * @return
	 */
	protected void removeUserInfo() throws BusinessException {
		session.removeAttribute("loginInfo");
	}
}
