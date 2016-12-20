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
@Table(name = "Rooms")
public class Rooms implements Serializable{
	
	@Id
	@Column(name = "RoomID")
	private int roomID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "BuildingID")
	private int buildingID;
	
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "AddressID")
	private int addressID;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "StaffID")
	private int staffID;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Room_ID", referencedColumnName = "Room_ID")
	private Collection<MachineMasterData> allMachines;

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuildingID() {
		return buildingID;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
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

	@Override
	public String toString() {
		return "Rooms [roomID=" + roomID + ", name=" + name + ", buildingID=" + buildingID + ", surfaceID=" + surfaceID
				+ ", addressID=" + addressID + ", permissionID=" + permissionID + ", staffID=" + staffID
				+ ", allMachines=" + allMachines + "]";
	}

	public Rooms(int roomID, String name, int buildingID, int surfaceID, int addressID, int permissionID, int staffID,
			Collection<MachineMasterData> allMachines) {
		super();
		this.roomID = roomID;
		this.name = name;
		this.buildingID = buildingID;
		this.surfaceID = surfaceID;
		this.addressID = addressID;
		this.permissionID = permissionID;
		this.staffID = staffID;
		this.allMachines = allMachines;
	}

	public Rooms() {

	}
}
