package com.example.schoolapp.utils;

import java.util.Date;

public class DeviceDetail {

    String name;
    int modelNum;
    Date manufactDate;

    public DeviceDetail(String name, int modelNum, Date manufactDate) {
        this.name = name;
        this.modelNum = modelNum;
        this.manufactDate = manufactDate;
    }

    public DeviceDetail getDeviceDetail() {
        return new DeviceDetail(name, modelNum, manufactDate);
    }

}
