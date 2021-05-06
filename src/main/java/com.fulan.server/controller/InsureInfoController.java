package com.fulan.server.controller;

import com.fulan.server.model.Car;
import com.fulan.server.model.Insure;
import com.fulan.server.model.InsureVo;
import com.fulan.server.service.CarServiceImp;
import com.fulan.server.service.InsureServiceImp;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by chen
 * 2020/3/13.
 */
//@Slf4j
@Controller
@RequestMapping("/insureInfo")
public class InsureInfoController {
    @Resource
    InsureServiceImp insureServiceImp;

    @Resource
    CarServiceImp carServiceImp;

    @RequestMapping("/search")
    @ResponseBody
    public ModelAndView selectALlInsureInfo(@RequestParam(required = false, defaultValue = "2", value = "pageNum") Integer pageNum,
                                            @RequestParam(defaultValue = "1", value = "pageSize") Integer pageSize) {
        ModelAndView mv = new ModelAndView();
//        InsureVo insureVo = new InsureVo();
        PageInfo<InsureVo> insureVos = insureServiceImp.selectALlInsureInfo(pageNum,pageSize);
        System.out.println("insureVos = " + insureVos);


        mv.setViewName("insureInfo");
        mv.addObject("pageInfo", insureVos);
        return mv;

    }


    @RequestMapping("/delete/{vehicleNum}")
    public String deleteInsureByVehicleNum(@PathVariable("vehicleNum") String vehicleNum) {
        ModelAndView mv = new ModelAndView();

        String date;
        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        Car car = new Car();
        Insure insure = new Insure();

        car.setVehicleNum(vehicleNum);
        insure.setVehicleNum(vehicleNum);

        insureServiceImp.deleteInsureByVehicleNum(insure);
        carServiceImp.deleteCarByVehicleNum(car);

//        List<InsureVo> insureVos = insureServiceImp.selectALlInsureInfo(Integer pageNum,Integer pageSize);
//        System.out.println("insureVos = " + insureVos);
//
//
//        mv.setViewName("insureInfo");
//        mv.addObject("insureVos", insureVos);
//        return mv;
        return "redirect:/insureInfo/search";

    }
}
