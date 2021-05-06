package com.fulan.server.dao;

import com.fulan.server.model.Car;
import org.apache.ibatis.annotations.Delete;


/**
 * Demo服务层接口
 * @author acer
 *
 */

public interface CarMapper {


    Integer addCar(Car car);

    Integer findCarByengineNumCount(Car car);

    Car findCarInfoByengineNum(Car car);

    int updateCarInfoByvehicleNum(Car car);

    @Delete("delete from car where vehicleNum = #{vehicleNum}")
    int deleteCarByVehicleNum(Car car);
}
