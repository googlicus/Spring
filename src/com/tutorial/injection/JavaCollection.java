package com.tutorial.injection;

import java.util.List;
import java.util.Map;

public class JavaCollection {
    private List addressList;
    private Map addressMap;
    private String nullAddress;

    public List getAddressList() {
        System.out.println("get address list:" + addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Map getAddressMap() {
        System.out.println("get address map: " + addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public String getNullAddress() {
        return nullAddress;
    }

    public void setNullAddress(String nullAddress) {
        this.nullAddress = nullAddress;
    }
}
