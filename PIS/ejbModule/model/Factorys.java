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
@Table(name = "Factorys")
public class Factorys implements Serializable {
	
	@Id
	@Column(name = "FactoryID")
	private int factoryID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "LocationID")
	private int locationID;
	
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "AddressID")
	private int addressID;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "StaffID")
	private int staffID;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Factory_ID", referencedColumnName = "Factory_ID")
	private Collection<Buildings> allBuildings;

	public int getFactoryID() {
		return factoryID;
	}

	public void setFactoryID(int factoryID) {
		this.factoryID = factoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
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
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	
	public Collection<Buildings> getAllBuildings() {
		return allBuildings;
	}

	public void setAllBuildings(Collection<Buildings> allBuildings) {
		this.allBuildings = allBuildings;
	}

	@Override
	public String toString() {
		return "Factorys [factoryID=" + factoryID + ", name=" + name + ", locationID=" + locationID + ", surfaceID="
				+ surfaceID + ", addressID=" + addressID + ", permissionID=" + permissionID + ", staffID=" + staffID
				+ ", allBuildings=" + allBuildings + "]";
	}

	public Factorys(int factoryID, String name, int locationID, int surfaceID, int addressID, int permissionID,
			int staffID, Collection<Buildings> allBuildings) {
		super();
		this.factoryID = factoryID;
		this.name = name;
		this.locationID = locationID;
		this.surfaceID = surfaceID;
		this.addressID = addressID;
		this.permissionID = permissionID;
		this.staffID = staffID;
		this.allBuildings = allBuildings;
	}

	public Factorys() {

	}
}
