package com.kgisl.resttemplate.model;




public class Student {
    private int Studentid;
    private String Studentname;
    private String address;
    private int collegeId;
    


    public int getStudentid() {
        return Studentid;
    }
    
    public void setStudentid(int studentid) {
        Studentid = studentid;
    }
    public String getStudentname() {
        return Studentname;
    }
    public void setStudentname(String studentname) {
        Studentname = studentname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Student() {
    }
   

    @Override
    public String toString() {
        return "Student [Studentid=" + Studentid + ", Studentname=" + Studentname + ", address=" + address
                + ", collegeId=" + collegeId + "]";
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    

   
}
