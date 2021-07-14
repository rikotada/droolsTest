package com.example.droolsTest.DroolsTestLayer.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface DroolsService {
    int insertPlan(JSONObject param);
    
    int insertInvestPackage(JSONArray param);
    
    double selectInvestPackageMax(String packageId);
    
    int insertInvestPackageSingle(JSONObject param);
    
    String selectInvestPlanTenantId(String planId);
}
