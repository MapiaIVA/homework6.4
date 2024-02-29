package main.Country;

public class Country {
    private String name;
    private int res;
    private String capital;
    private String place;
    private int phone;
    private String city;

    public Country(String name, String place, String capital, String city, int res, int phone) {
        this.name = name;
        this.res = res;
        this.place = place;
        this.capital = capital;
        this.phone = phone;
        this.city = city;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getCapital() {
        return capital;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", place=" + place +
                "city='" + city + '\'' +
                ", res=" + res + '\'' +
                ", phone=" + phone +
                '}';
    }
}