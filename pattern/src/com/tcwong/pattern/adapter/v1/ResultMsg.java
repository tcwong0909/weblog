package com.tcwong.pattern.adapter.v1;

public class ResultMsg {
    private Integer code;
    private String massage;

    public ResultMsg() {
    }

    public ResultMsg(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", massage='" + massage + '\'' +
                '}';
    }
}
