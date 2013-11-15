package com.edu.telescopio.repository.vo;

/**
 * @author andres
 * 
 */
public class Coordinate {

	private float latitude;
	private float longitude;

	public Coordinate() { }

	public Coordinate(float latitude, float longitude) {

		this.latitude = latitude;
		this.longitude = longitude;

	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Coordinate [latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}

}
