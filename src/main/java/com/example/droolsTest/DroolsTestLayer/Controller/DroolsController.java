package com.example.droolsTest.DroolsTestLayer.Controller;

import java.util.ArrayList;
import java.util.List;

import org.drools.core.base.RuleNameStartsWithAgendaFilter;
import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.droolsTest.DroolsTestLayer.Model.BusinessException;
import com.example.droolsTest.DroolsTestLayer.Model.Packages;
import com.example.droolsTest.DroolsTestLayer.Model.ResponseData;
import com.example.droolsTest.DroolsTestLayer.Model.Variable;
import com.example.droolsTest.DroolsTestLayer.Service.DroolsService;


@RestController
public class DroolsController extends BaseController{
    @Autowired
    private DroolsService drService;
    
	
	
	@RequestMapping(value = "/insertPackages1" , method = { RequestMethod.POST })
    public ResponseData insertPackages1(@RequestBody JSONObject param ) throws Exception{
		Variable  variable = new Variable();
		variable.setSum(0);
		String me = "新增成功";
//		TestModel test = new TestModel();
//		test.setIntPrint(5);
		JSONArray a = param.getJSONArray("packageInfo");
        String error = "";
        Boolean stop = false;
		int size = a.size();
		for(Integer i = 0; i < size; i++) {
			double max = drService.selectInvestPackageMax(a.getJSONObject(i).getString("packageId"));
			a.getJSONObject(i).put("max", max);
		}
		param.replace("packageInfo", a);
//		KieSession kieSession = KieUtils.getKieSession();

		KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession kieSession = kc.newKieSession("packagesKS");
        FactHandle f = kieSession.insert(variable);
        kieSession.insert(param);
        kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter("GroupA"));
        if(variable.getAhhh() != null && variable.getAhhh() != "") {
        	me = variable.getAhhh();
        }
//        StatelessKieSession kSession = kc.newStatelessKieSession();
//        List<Object> facts = new ArrayList<Object>();
//        facts.add(variable);
//        facts.add(param);
//        facts.add(new FireAllRulesCommand(new RuleNameStartsWithAgendaFilter("GroupA"))); 
//        kSession.execute(facts);
//        if(variable.getAhhh() != null && variable.getAhhh() != "") {
//        	me = variable.getAhhh();
//        }
//        kieSession.insert(variable);
//        kieSession.insert(param);
        kieSession.delete(f);
        variable.setStop(false);
        kieSession.insert(variable);
        kieSession.insert(drService);
        kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter("GroupB"));

//	    JSONObject input1 = new JSONObject();
//	    input1.put("planId", param.getString("planId"));
//	    input1.put("planName", param.getString("planName"));
//	    input1.put("totalAmount", param.getDouble("totalAmount"));
//	    int c = drService.insertPlan(input1);
//	    int b = drService.insertInvestPackage(param.getJSONArray("packageInfo"));
		return new ResponseData(me);
	}
	
	@RequestMapping(value = "/getPreBuyInfo" , method = { RequestMethod.POST })
    public ResponseData getPreBuyInfo(@RequestBody JSONObject param ) throws Exception{
		String me = "新增成功";
		
		Variable  variable = new Variable();
		KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession kieSession = kc.newKieSession("packagesKS");
//        FactHandle f_variable = kieSession.insert(variable);
        FactHandle f_variable = kieSession.insert(variable);
        FactHandle f_initialParam = kieSession.insert(param);
        kieSession.insert(drService);
        kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter("getPreBuyInfo GroupA"));
        Integer a = 1;
        param.put("cou", a);
        param.put("isDisabled", false);
        
//        kieSession.delete(f_initialParam);
//        FactHandle f_secondParam = kieSession.insert(param);
        KieSession kieSession2 = kc.newKieSession("packagesKS2");
        kieSession2.insert(variable);
        kieSession2.insert(param);
        kieSession2.fireAllRules(new RuleNameStartsWithAgendaFilter("getPreBuyInfo GroupB"));
        System.out.println("0101010101010101------------"+param.getBoolean("isDisabled"));
        if(variable.getAhhh() != null && !variable.getAhhh().equals("")) {
        	me = variable.getAhhh();
        }
		return new ResponseData(me);
	}
	
	
}
