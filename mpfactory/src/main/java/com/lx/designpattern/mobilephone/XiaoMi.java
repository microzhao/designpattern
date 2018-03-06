package com.lx.designpattern.mobilephone;

public class XiaoMi implements Phone{

    public XiaoMi(){

    }

    private String origin;

    public XiaoMi(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return "XIAOMI";
    }

    @Override
    public String getOrigin() {
        return origin;
    }
}
