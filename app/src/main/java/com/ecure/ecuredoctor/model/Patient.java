package com.ecure.ecuredoctor.model;

public class Patient {
    String name ,age,pid,mobile,net,date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Patient(String name, String age, String pid, String mobile, String net, String date) {
        this.name = name;
        this.age = age;
        this.pid = pid;
        this.mobile = mobile;
        this.net = net;
        this.date = date;
    }
}
