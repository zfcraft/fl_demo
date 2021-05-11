package com.fulan.server.controller;

import com.fulan.server.model.Car;
import com.fulan.server.model.Insure;
import com.fulan.server.service.CarServiceImp;
import com.fulan.server.service.InsureServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chen
 * 2020/3/13.
 */
@RestController
@RequestMapping("/insure")
public class InsureController {
    @Resource
    InsureServiceImp insureServiceImp;


    @RequestMapping("/add")
    public Object add(@RequestBody Insure insure) {
        ModelAndView mv = new ModelAndView();
        String date;
        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        int count = insureServiceImp.findInsureByvehicleNumCount(insure);
        if (count > 0) {
            int updateCount = insureServiceImp.updateInsureByvehicleNum(insure);

            if (updateCount > 0) {
                System.out.println("updateCount = " + updateCount);

                mv.setViewName("insureInfo");
                mv.addObject("insure", insure);
//                System.out.println("vehicleNum = " + vehicleNum);
                return insure;
            }
        } else {

            int insertCount = insureServiceImp.addInsure(insure);
            if (insertCount > 0) {
                mv.setViewName("insureInfo");
//            mv.addObject("vehicleNum", vehicleNum);
                return insure;
            }
        }

        mv.setViewName("error");
        return insure;


    }
}
