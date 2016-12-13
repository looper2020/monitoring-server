package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Locations")
public class Locations implements Serializable {

	@Id
	@Column(name = "LocationID")
	private int locationID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "AddressID")
	private int addressID;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "StaffID")
	private int StaffID;
	
  	public int getLocationID() {
		return locationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSurfaceID() {
		return surfaceID;
	}

	public void setSurfaceID(int surfaceID) {
		this.surfaceID = surfaceID;
	}
	
	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	public int getStaffID() {
		return StaffID;
	}

	public void setStaffID(int staffID) {
		StaffID = staffID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
	public Locations(int locationID, String name, String country, int surfaceID, int addressID, int permissionID,
			int staffID) {
		super();
		this.locationID = locationID;
		this.name = name;
		this.country = country;
		this.surfaceID = surfaceID;
		this.addressID = addressID;
		this.permissionID = permissionID;
		StaffID = staffID;
	}

	@Override
	public String toString() {
		return "Locations [locationID=" + locationID + ", name=" + name + ", country=" + country + ", surfaceID="
				+ surfaceID + ", addressID=" + addressID + ", permissionID=" + permissionID + ", StaffID=" + StaffID
				+ "]";
	}

    public Locations() {
    	
    }
}
