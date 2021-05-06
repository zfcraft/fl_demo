package com.fulan.server.service;

import com.fulan.server.dao.CarMapper;
import com.fulan.server.dao.DemoDao;
import com.fulan.server.model.Car;
import com.fulan.server.model.DemoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo服务层实现
 * @author foodoo
 *
 */
@Service
public class CarServiceImp{

	@Resource
	private CarMapper carMapper;



	public Integer addCar(Car car) { return carMapper.addCar(car); }

	public Integer findCarByengineNumCount(Car car) {
		return carMapper.findCarByengineNumCount(car);
	}

	public Car findCarInfoByengineNum(Car car) {
		return carMapper.findCarInfoByengineNum(car);
	}

	public int updateCarInfoByvehicleNum(Car car) {
		return carMapper.updateCarInfoByvehicleNum(car);
	}

	public int deleteCarByVehicleNum(Car car) {
		return carMapper.deleteCarByVehicleNum(car);
	}
}