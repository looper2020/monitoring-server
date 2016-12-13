package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "MachineMasterData")
public class MachineMasterData implements Serializable {
	
	@Id
	@Column(name = "MachineID")
	private int machineID;
	
	@Column(name = "RoomID")
	private int roomID;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "StaffID")
	private int staffID;
	
	@Column(name = "IpAddress")
	private String ipAddress;

	public int getMachineID() {
		return machineID;
	}

	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
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

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "MachineMasterData [machineID=" + machineID + ", roomID=" + roomID + ", permissionID=" + permissionID
				+ ", staffID=" + staffID + ", ipAddress=" + ipAddress + "]";
	}

	public MachineMasterData(int machineID, int roomID, int permissionID, int staffID, String ipAddress) {
		super();
		this.machineID = machineID;
		this.roomID = roomID;
		this.permissionID = permissionID;
		this.staffID = staffID;
		this.ipAddress = ipAddress;
	}

	public MachineMasterData() {

	}
}
