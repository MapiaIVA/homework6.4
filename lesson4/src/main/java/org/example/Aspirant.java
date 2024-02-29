package main.java.org.example;

import java.nio.channels.WritePendingException;

public class Aspirant extends Student {
    private String workName;
    public Aspirant(String workName, String fullName, int age) {
        super(fullName, age);
        this.workName = workName;
    }
    public String getWorkName() {
        return workName;
    }
    public void setWorkName(String workName) {
        this.workName = workName;
    }
    @Override
    public  String toString() {
        return super.toString()+ " "+ workName;
    }
}
