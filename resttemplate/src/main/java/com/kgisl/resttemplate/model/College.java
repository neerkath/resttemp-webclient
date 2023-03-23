package com.kgisl.resttemplate.model;

public class College {
    private int collegeid;
    private String collegename;
   
    private String address;
    
    public int getCollegeid() {
        return collegeid;
    }
    
    public void setCollegeid(int collegeid) {
        this.collegeid = collegeid;
    }
    public String getCollegename() {
        return collegename;
    }
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "College [collegeid=" + collegeid + ", collegename=" + collegename + ", address=" + address + "]";
    }

    public College() {
    }
}
