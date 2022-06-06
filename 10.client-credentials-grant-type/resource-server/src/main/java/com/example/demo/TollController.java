package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TollController {
    private List<TollData> tollData;

    public TollController(){
        tollData = new ArrayList<>();
        tollData.add(new TollData("900", "MH 31 AR 1111", "2022-05-05T08:00:00"));
        tollData.add(new TollData("900", "MH 31 AR 2222", "2022-06-06T06:00:00"));
        tollData.add(new TollData("900", "MH 31 AR 2222", "2022-07-07T07:00:00"));
    }

    @RequestMapping("/api/tolldata")
    public List<TollData> tollData(){
        return tollData;
    }
}
