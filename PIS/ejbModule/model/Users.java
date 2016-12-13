package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Users")
public class Users implements Serializable {

	@Id
	@Column(name = "UserID")
	private int userID;
	
	@Column(name = "Lastname")
	private String lastname;
	
	@Column(name = "Firstname")
	private String firstname;
	
	@Column(name = "PermissionID")
	private int permissionID;
	
	@Column(name = "LocationID")
	private int locationID;
	
	@Column(name = "Password")
	private String password;
		    
		   
  	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", Lastname=" + lastname + ", Firstname=" + firstname + ", permissionID="
				+ permissionID + ", locationID=" + locationID + "]";
	}
	
	public Users(int userID, String lastname, String firstname, int permissionID, int locationID) {
		super();
		this.userID = userID;
		this.lastname = lastname;
		this.firstname = firstname;
		this.permissionID = permissionID;
		this.locationID = locationID;
	}

    public Users() {
 
    }

}
