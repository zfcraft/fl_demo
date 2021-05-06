package com.fulan.server.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Demo实体
 * @author acer
 *
 */
public class InsureVo implements Serializable {

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
	 *投保人名称
	 */

	private String userName;


	/**
	 *移动电话
	 */

	private String phoneNum;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "InsureVo{" +
				"id=" + id +
				", plateNum='" + plateNum + '\'' +
				", vehicleNum='" + vehicleNum + '\'' +
				", engineNum='" + engineNum + '\'' +
				", firstDate=" + firstDate +
				", userName='" + userName + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				'}';
	}
}