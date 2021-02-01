package com.example.schoolapp.utils;

import java.util.Date;

public class DeviceDetail {

    public DeviceDetail(String name, int modelNum, Date manufactDate) {

    }

    public DeviceDetail getDeviceDetail() {
        return new DeviceDetail("", 3, new Date());
    }

}
