package main;

import java.security.PrivilegedAction;

public class City {
    private String name;
    private int res;
    private String region;
    private String country;
    private int index;
    private int phone;

    public City(String name, String region, String country, int res, int index, int phone) {
        this.name = name;
        this.res = res;
        this.region = region;
        this.country = country;
        this.index = index;
        this.phone = phone;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPhone() {
        return phone;

    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", region=" + region +
                "country='" + country + '\'' +
                ", res=" + res +
                "index='" + index + '\'' +
                ", phone=" + phone +
                '}';
    }
}