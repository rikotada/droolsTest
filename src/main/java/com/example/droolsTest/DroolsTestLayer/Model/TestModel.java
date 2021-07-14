package com.example.droolsTest.DroolsTestLayer.Model;

public class TestModel {
     private String textPrint;
     
     private int intPrint;

	public int getIntPrint() {
		System.out.println("-------------loaded");
		return intPrint;
	}

	public void setIntPrint(int intPrint) {
		this.intPrint = intPrint;
	}

	public String getTextPrint() {
		System.out.println("-------------loaded");
		return textPrint;
	}

	public void setTextPrint(String textPrint) {
		this.textPrint = textPrint;
	}
}
