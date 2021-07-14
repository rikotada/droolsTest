package com.example.droolsTest.DroolsTestLayer.Model;

public class ResponseHeader {
	public String sysTransNo;//系统交易流水号
	public String systemTime;//系统日期和时间，格式为yyyy-MM-dd hh:mm:ss
	public Integer code;//返回码，0是成功，-99是没有登录
	public String msg;//提示信息
	public String getSysTransNo() {
		return sysTransNo;
	}
	public void setSysTransNo(String sysTransNo) {
		this.sysTransNo = sysTransNo;
	}
	public String getSystemTime() {
		return systemTime;
	}
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
