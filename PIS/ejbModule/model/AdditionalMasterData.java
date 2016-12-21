package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

//@SuppressWarnings("serial")
@Entity
@Table(name = "AdditionalMasterData")
public class AdditionalMasterData implements Serializable {
	
	@Id
	@Column(name = "DataID")
	private int dataID;
	
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "PermissionID")
	private int permissionID;

	public int getDataID() {
		return dataID;
	}

	public void setDataID(int dataID) {
		this.dataID = dataID;
	}

	public int getSurfaceID() {
		return surfaceID;
	}

	public void setSurfaceID(int surfaceID) {
		this.surfaceID = surfaceID;
	}

	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	@Override
	public String toString() {
		return "AdditionalMasterData [dataID=" + dataID + ", surfaceID=" + surfaceID + ", permissionID=" + permissionID
				+ "]";
	}

	public AdditionalMasterData(int dataID, int surfaceID, int permissionID) {
		super();
		this.dataID = dataID;
		this.surfaceID = surfaceID;
		this.permissionID = permissionID;
	}

	public AdditionalMasterData() {

	}
}
