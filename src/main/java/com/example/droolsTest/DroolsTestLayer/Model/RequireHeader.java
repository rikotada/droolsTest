package com.example.droolsTest.DroolsTestLayer.Model;

public class RequireHeader {
	public String transNo;//交易流水号
	public String transTime;//交易日期和时间，格式为yyyy-MM-dd hh:mm:ss
	public String trModuleCode;//交易模块编号
	public String trCode;//交易编号
	public String token;//token
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getTrModuleCode() {
		return trModuleCode;
	}
	public void setTrModuleCode(String trModuleCode) {
		this.trModuleCode = trModuleCode;
	}
	public String getTrCode() {
		return trCode;
	}
	public void setTrCode(String trCode) {
		this.trCode = trCode;
	}
	public String getToken() {return token;}
	public void setToken(String token) {this.token = token;}
}
