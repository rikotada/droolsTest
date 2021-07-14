package com.example.droolsTest.DroolsTestLayer.Model;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class Packages {
    
    private double totalAmount;
    
    private String planId;
    
    private String planName;
    
    private JSONArray packageInfo;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public JSONArray getPackageInfo() {
		return packageInfo;
	}

	public void setPackageInfo(JSONArray packageInfo) {
		this.packageInfo = packageInfo;
	}
    
    
    
    
}
