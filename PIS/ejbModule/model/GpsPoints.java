package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "GpsPoints")
public class GpsPoints implements Serializable {

	@Id
	@Column(name = "GpsPoint")
	public int gpsPoint;
	
	@Column(name = "Longitude")
	public float longitude;
	
	@Column(name = "Latitude")
	public float latitude;
	
	@Column(name = "Altitude")
	public float altitude;
	
    public int getGpsPoint() {
		return gpsPoint;
	}

	public void setGpsPoint(int gpsPoint) {
		this.gpsPoint = gpsPoint;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getAltitude() {
		return altitude;
	}

	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "gpsPoints [gpsPoint=" + gpsPoint + ", longitude=" + longitude + ", latitude=" + latitude + ", altitude="
				+ altitude + "]";
	}

	public GpsPoints(int gpsPoint, float longitude, float latitude, float altitude) {
		super();
		this.gpsPoint = gpsPoint;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}

    public GpsPoints() {
    	
    }
}
