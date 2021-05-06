package com.fulan.server.model;


import java.io.Serializable;

/**
 * Demo实体
 * @author acer
 *
 */
public class Insure implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;

	/**
	 *车架号
	 */
	private String vehicleNum;

	/**
	 *投保人名称
	 */

	private String userName;
	/**
	 *证件类型
	 */

	private String certType;

	/**
	 *证件号码
	 */

	private String certId;
	/**
	 *移动电话
	 */

	private String phoneNum;

	/**
	 *地址
	 */
	private String address;

	/**
	 *邮箱
	 */

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertId() {
		return certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}