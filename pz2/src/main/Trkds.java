package main;

import main.City;

import java.nio.channels.WritePendingException;

public class Trkds extends City {
    private String name;
    public Trkds(String name, String region, String country, int res, int index, int phone) {
        super(name, region, country, res, index, phone);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public  String toString() {
        return super.toString()+ " "+ name;
    }
}