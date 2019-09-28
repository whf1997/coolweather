package com.coolweather.android.db;

import org.litepal.exceptions.DataSupportException;

public class City extends DataSupportException {

    private  int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public City(String errorMessage) {
        super(errorMessage);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
