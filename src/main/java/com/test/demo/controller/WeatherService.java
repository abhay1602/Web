package com.test.demo.controller;

import com.test.demo.model.WeatherBO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    public List<WeatherBO> getWeatherList() {
        List<WeatherBO> weatherList = new ArrayList<WeatherBO>();
        WeatherBO ca = new WeatherBO(new Date(), "Campbell,CA", 23.5, "20%");
        WeatherBO om = new WeatherBO(new Date(), "Omaha, NE", 24.5, "22%");
        WeatherBO au = new WeatherBO(new Date(), "Austin, TX", 25.5, "24%");
        WeatherBO ni = new WeatherBO(new Date(), "Niseko, Japan", 26.5, "26%");
        WeatherBO na = new WeatherBO(new Date(), "Nara, Japan", 27.5, "28%");
        WeatherBO ja = new WeatherBO(new Date(), "Jakarta, Indonesia", 28.5, "29%");
        weatherList.add(ca);
        weatherList.add(om);
        weatherList.add(au);
        weatherList.add(ni);
        weatherList.add(na);
        weatherList.add(ca);
        weatherList.add(ja);

        return weatherList;
    }

}
