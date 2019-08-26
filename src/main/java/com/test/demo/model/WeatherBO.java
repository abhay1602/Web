package com.test.demo.model;

import java.util.Date;

public class WeatherBO {

    Date date;
    String city;
    double tempreture;
    String precipitation;

    public WeatherBO(Date date,String city, double tempreture, String precipitation){
        this.date=date;
        this.city=city;
        this.tempreture=tempreture;
        this.precipitation= precipitation;

    }
    public void setDate(Date date) {
        this.date = date;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTempreture(long tempreture) {
        this.tempreture = tempreture;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public double getTempreture() {
        return tempreture;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    @Override
    public String toString() {
        return "Weather [date=" + date + ", city=" + city
                + ", tempreture=" + tempreture + ", precipatation=" + precipitation + "]";
    }
}
