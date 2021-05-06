package com.fulan.server.controller;

import com.fulan.server.model.Car;
import com.fulan.server.service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chen
 * 2020/3/13.
 */
@Controller()
@RequestMapping("/car")
public class CarController {
    @Resource
    CarServiceImp carServiceImp;


    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "plateNum") String plateNum,
                            @RequestParam(value = "vehicleNum") String vehicleNum,
                            @RequestParam(value = "engineNum") String engineNum,
                            @RequestParam(value = "carValue") String carValue) {
        ModelAndView mv = new ModelAndView();

        System.out.println("plateNum = " + plateNum);
        String date;
        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        Car car = new Car();
        car.setPlateNum(plateNum);
        car.setVehicleNum(vehicleNum);
        car.setEngineNum(engineNum);
        car.setCarValue(carValue);
        car.setFirstDate(new Date());
        int count = carServiceImp.findCarByengineNumCount(car);
        if (count > 0) {

            int updateCount = carServiceImp.updateCarInfoByvehicleNum(car);
            if (updateCount > 0) {

                mv.setViewName("insure");
                mv.addObject("vehicleNum", vehicleNum);
                System.out.println("vehicleNum = " + vehicleNum);
                return mv;
            }

        } else {

            int insertCount = carServiceImp.addCar(car);
            if (insertCount > 0) {
                mv.setViewName("insure");
                mv.addObject("vehicleNum", vehicleNum);
                return mv;
            }
        }


        mv.setViewName("error");
        return mv;

    }

    @RequestMapping("/update/{vehicleNum}")
    public ModelAndView update(@PathVariable String vehicleNum) {
        Car car = new Car();
        ModelAndView mv = new ModelAndView();
        car.setVehicleNum(vehicleNum);
        Car resultCar = carServiceImp.findCarInfoByengineNum(car);
        mv.setViewName("car");
        mv.addObject("plateNum", resultCar.getPlateNum());
        mv.addObject("vehicleNum", resultCar.getVehicleNum());
        mv.addObject("engineNum", resultCar.getEngineNum());
//        mv.addObject("firstDate", resultCar.getPlateNum());
        mv.addObject("carValue", resultCar.getCarValue());

        return mv;
    }

}
