package com.ecure.ecuredoctor.model;

public class Details {
    String detailsName;

    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    String number;

    public Details(String detailsName, String number) {
        this.detailsName = detailsName;
        this.number = number;
    }
}
