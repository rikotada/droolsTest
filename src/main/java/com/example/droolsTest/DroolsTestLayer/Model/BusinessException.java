package com.example.droolsTest.DroolsTestLayer.Model;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;

/**
 * 自定义业务异常类，业务逻辑校验抛出此类异常
 */
public class BusinessException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3624897132554786327L;

	private JSONObject header;

	@SuppressWarnings("deprecation")
	public BusinessException(Integer code, String message)
    {   
		//super(message);
		header = new JSONObject();
		header.put("code",code);
		header.put("msg",message);
		header.put("sysTransNo","0");
		header.put("systemTime",new Date().toLocaleString());
		this.setHeader(header);
    }

	public JSONObject getHeader() {
		return header;
	}

	public void setHeader(JSONObject header) {
		this.header = header;
	}
}
