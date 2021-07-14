package com.example.droolsTest.DroolsTestLayer.Model;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class ResponseData {
	private ResponseHeader header;
	private JSONObject body;
	public ResponseData(){
		this.setHeader();
	}
	public ResponseData(String success){
		this.setHeader(success);
	}
	public ResponseData(Integer errcode,String errinfo){
		this.setHeader(errcode,errinfo);
	}
	public ResponseData(JSONObject info){
		this.setHeader();
		this.body = info;
	}
	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	@SuppressWarnings("deprecation")
	public void setHeader() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		ResponseHeader resH = new ResponseHeader();
		resH.setCode(0);
		resH.setSystemTime(new Date().toLocaleString());
		resH.setSysTransNo((String)request.getAttribute("sysTransNo"));
		resH.setMsg("交易成功");
		this.header = resH;
	}
	@SuppressWarnings("deprecation")
	public void setHeader(String success) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		ResponseHeader resH = new ResponseHeader();
		resH.setCode(0);
		resH.setSystemTime(new Date().toLocaleString());
		resH.setSysTransNo((String)request.getAttribute("sysTransNo"));
		resH.setMsg(success);
		this.header = resH;
	}
	@SuppressWarnings("deprecation")
	public void setHeader(Integer errcode,String errinfo) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		ResponseHeader resH = new ResponseHeader();
		resH.setCode(errcode);
		resH.setSystemTime(new Date().toLocaleString());
		resH.setSysTransNo((String)request.getAttribute("sysTransNo"));
		resH.setMsg(errinfo);
		this.header = resH;
	}

	public JSONObject getBody() {
		return body;
	}

	public void setBody(JSONObject body) {
		this.body = body;
	}
}
