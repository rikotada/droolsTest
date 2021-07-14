package com.example.droolsTest.DroolsTestLayer.Model;

import com.alibaba.fastjson.JSONObject;

public class Variable {
     private double sum;
     
     private boolean maxOver = false;
     
     private String error;
     
     private String ahhh;
     
     private boolean stop = false;
     
     private JSONObject pass;
     
     public JSONObject getPass() {
		return pass;
	}

	public void setPass(JSONObject pass) {
		this.pass = pass;
	}

	public String getAhhh() {
		return ahhh;
	}

	public void setAhhh(String ahhh) {
		this.ahhh = ahhh;
	}

	

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isMaxOver() {
		return maxOver;
	}

	public void setMaxOver(boolean maxOver) {
		this.maxOver = maxOver;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
}
