package com.test.demo.controller;

import com.test.demo.model.WeatherBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherReportController {

    @Autowired
    WeatherService weatherService;

    @RequestMapping("/weather")
    public List<WeatherBO> getWeatherReport(){
        List<WeatherBO> weatherList = weatherService.getWeatherList();
        return weatherList;
    }
}
