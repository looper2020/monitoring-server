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
@Table(name = "Buildings")
public class Buildings implements Serializable {
	
	@Id
	@Column(name = "BuildingID")
	private int buildingID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "FactoryID")
	private int factoryID;
	
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "AddressID")
	private int addressID;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "StaffID")
	private int staffID;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Building_ID", referencedColumnName = "Building_ID")
	private Collection<Rooms> allRooms;

	public int getBuildingID() {
		return buildingID;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFactoryID() {
		return factoryID;
	}

	public void setFactoryID(int factoryID) {
		this.factoryID = factoryID;
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

	public Collection<Rooms> getAllRooms() {
		return allRooms;
	}

	public void setAllRooms(Collection<Rooms> allRooms) {
		this.allRooms = allRooms;
	}

	@Override
	public String toString() {
		return "Buildings [buildingID=" + buildingID + ", name=" + name + ", factoryID=" + factoryID + ", surfaceID="
				+ surfaceID + ", addressID=" + addressID + ", permissionID=" + permissionID + ", staffID=" + staffID
				+ ", allRooms=" + allRooms + "]";
	}
	
	public Buildings(int buildingID, String name, int factoryID, int surfaceID, int addressID, int permissionID,
			int staffID, Collection<Rooms> allRooms) {
		super();
		this.buildingID = buildingID;
		this.name = name;
		this.factoryID = factoryID;
		this.surfaceID = surfaceID;
		this.addressID = addressID;
		this.permissionID = permissionID;
		this.staffID = staffID;
		this.allRooms = allRooms;
	}

	public Buildings() {

	}
}
