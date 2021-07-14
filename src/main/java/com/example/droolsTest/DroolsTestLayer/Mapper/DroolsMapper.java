package com.example.droolsTest.DroolsTestLayer.Mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Mapper
public interface DroolsMapper {
	int insertInvestPlan(@Param("param") JSONObject param);
	
	int insertInvestPackage(@Param("param") JSONArray param);
	
	double selectInvestPackageMax(String packageId);
	
	int insertInvestPackageSingle(@Param("param") JSONObject param);
	
	String selectInvestPlanTenantId(String planId);
}
