package com.fulan.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chen
 * 2020/3/13.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String Index(){
        return "car";
    }

    @RequestMapping("/insure")
    public String insure(){
        return "insure";
    }


    @RequestMapping("/search")
    public String search(){
        return "insureInfo";
    }
}
