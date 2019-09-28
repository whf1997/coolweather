package com.coolweather.android.db;

import org.litepal.exceptions.DataSupportException;

public class Province extends DataSupportException {

    private  int id;

    private String provinceName;

    private int provinceCode;

    public Province(String errorMessage) {
        super(errorMessage);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
