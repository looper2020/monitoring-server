package model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	private int staffID;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Location_ID", referencedColumnName = "Location_ID")
	private Collection<Factorys> allFactorys;

	public Collection<Factorys> getAllFactorys() {
		return allFactorys;
	}

	public void setAllFactorys(Collection<Factorys> allFactorys) {
		this.allFactorys = allFactorys;
	}
	
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

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	@Override
	public String toString() {
		return "Locations [locationID=" + locationID + ", name=" + name + ", country=" + country + ", surfaceID="
				+ surfaceID + ", addressID=" + addressID + ", permissionID=" + permissionID + ", staffID=" + staffID
				+ ", allFactorys=" + allFactorys + "]";
	}

	public Locations(int locationID, String name, String country, int surfaceID, int addressID, int permissionID,
			int staffID, Collection<Factorys> allFactorys) {
		super();
		this.locationID = locationID;
		this.name = name;
		this.country = country;
		this.surfaceID = surfaceID;
		this.addressID = addressID;
		this.permissionID = permissionID;
		this.staffID = staffID;
		this.allFactorys = allFactorys;
	}

	public Locations() {
    	
    }
}
