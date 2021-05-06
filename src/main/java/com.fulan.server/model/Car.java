package com.fulan.server.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Demo实体
 * @author acer
 *
 */
public class Car implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;

	/**
	 *车牌号码
	 */
	private String plateNum;
	/**
	 *车架号
	 */
	private String vehicleNum;
	/**
	 *发动号
	 */
	private String engineNum;

	/**
	 *初登日期
	 */
	private Date firstDate;
	/**
	 *购车价值
	 */
	private String carValue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlateNum() {
		return plateNum;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

	public Date getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(Date firstDate) {
		this.firstDate = firstDate;
	}

	public String getCarValue() {
		return carValue;
	}

	public void setCarValue(String carValue) {
		this.carValue = carValue;
	}
}