package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Staff")
public class Staff implements Serializable {

	@Id
	@Column(name = "StaffID")
	private int staffID;
	
	@Column(name = "Lastname")
	private String lastName;
	
	@Column(name = "Firstname")
	private String firstName;
	
	@Column(name = "LocationHierarchy")
	private int locationHierarchy;
	
	@Column(name = "Phonenumber")
	private String phonenumber;
	
	@Column(name = "Mailaddress")
	private String mailaddress;

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getLocationHierarchy() {
		return locationHierarchy;
	}

	public void setLocationHierarchy(int locationHierarchy) {
		this.locationHierarchy = locationHierarchy;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	@Override
	public String toString() {
		return "Staff [staffID=" + staffID + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", locationHierarchy=" + locationHierarchy + ", phonenumber=" + phonenumber + ", mailaddress="
				+ mailaddress + "]";
	}

	public Staff(int staffID, String lastName, String firstName, int locationHierarchy, String phonenumber,
			String mailaddress) {
		super();
		this.staffID = staffID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.locationHierarchy = locationHierarchy;
		this.phonenumber = phonenumber;
		this.mailaddress = mailaddress;
	}

	public Staff() {

	}	
}
