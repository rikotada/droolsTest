package com.example.droolsTest.DroolsTestLayer.Model;


import com.alibaba.fastjson.JSONObject;

public class RequireParam {
	private RequireHeader header;
	private JSONObject body;
	public RequireHeader getHeader() {
		return header;
	}
	public void setHeader(RequireHeader header) {
		this.header = header;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(JSONObject body) {
		this.body = body;
	}
}
