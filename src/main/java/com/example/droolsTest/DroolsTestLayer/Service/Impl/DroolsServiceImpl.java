package com.example.droolsTest.DroolsTestLayer.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.droolsTest.DroolsTestLayer.Mapper.DroolsMapper;
import com.example.droolsTest.DroolsTestLayer.Service.DroolsService;
@Service
public class DroolsServiceImpl implements DroolsService{
   
	@Autowired
	private DroolsMapper drmapper;

	@Override
	public int insertPlan(JSONObject param) {
		return drmapper.insertInvestPlan(param);
	}

	@Override
	public int insertInvestPackage(JSONArray param) {
		return drmapper.insertInvestPackage(param);
	}

	@Override
	public double selectInvestPackageMax(String packageId) {
		return drmapper.selectInvestPackageMax(packageId);
	}

	@Override
	public int insertInvestPackageSingle(JSONObject param) {
		return drmapper.insertInvestPackageSingle(param);
	}

	@Override
	public String selectInvestPlanTenantId(String planId) {
		return drmapper.selectInvestPlanTenantId(planId);
	}
	
	
}
