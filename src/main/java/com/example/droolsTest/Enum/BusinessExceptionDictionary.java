package com.example.droolsTest.Enum;



public enum BusinessExceptionDictionary {
	
	PACKAGE_SUM_FAILURE(1002,"跟投包总和超过方案上限"),
	PACKAGE_MAX_FAILURE(1003,"跟投名单上限超过跟投包上限");

	
	private Integer code;
    private String desc;

    BusinessExceptionDictionary(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public static String getDescByCode(Integer code){
        if(code == null){
            return "";
        }
        for (BusinessExceptionDictionary businessException:values()){
            if(businessException.getCode().equals(code)){
                return businessException.getDesc();
            }
        }
        return "";
    }

}
