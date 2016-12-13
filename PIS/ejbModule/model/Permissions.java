package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Permissions")
public class Permissions implements Serializable {

	@Id
	@Column(name = "PermissionID")
	private int permissionsID;
	
	@Column(name = "Description")
	private String description;
	
    public int getPermissionsID() {
		return permissionsID;
	}

	public void setPermissionsID(int permissionsID) {
		this.permissionsID = permissionsID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Permissions [permissionsID=" + permissionsID + ", description=" + description + "]";
	}

	public Permissions(int permissionsID, String description) {
		super();
		this.permissionsID = permissionsID;
		this.description = description;
	}

    public Permissions() {
        
    }
}
