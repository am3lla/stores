package com.edu.telescopio.repository.vo;

import java.util.Arrays;

import com.edu.telescopio.repository.enums.SaleStoreEnum;

/**
 * @author andres
 * 
 */
public class SaleStore {

	private SaleStoreEnum id;
	private String storeName;
	private String address;
	private String phone;
	private String webSite;
	private String email;
	private String imgFileName;
	private Coordinate coordinates;
	private String[] publicOpeningTime;

	public SaleStoreEnum getId() {
		return id;
	}

	public void setId(SaleStoreEnum id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public Coordinate getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinate coordinates) {
		this.coordinates = coordinates;
	}

	public String[] getPublicOpeningTime() {		
		return this.publicOpeningTime;		
	}
	
	public void  setPublicOpeningTime(String[] publicOpeningTime) {
		this.publicOpeningTime = publicOpeningTime;		
	}

	@Override
	public String toString() {
		return "SaleStore [id=" + id + ", storeName=" + storeName
				+ ", address=" + address + ", phone=" + phone + ", webSite="
				+ webSite + ", email=" + email + ", imgFileName=" + imgFileName
				+ ", coordinates=" + coordinates + ", publicOpeningTime="
				+ Arrays.toString(publicOpeningTime) + "]";
	}
	
}
