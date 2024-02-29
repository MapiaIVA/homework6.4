package main.Country;

import java.nio.channels.WritePendingException;

public class QWERTY extends Country {
    private String name;
    public QWERTY(String name, String place, String capital, String city, int res, int phone) {
        super(name, place, capital, city, res, phone);
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