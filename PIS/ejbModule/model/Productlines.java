package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productlines")
public class Productlines implements Serializable {
	
	@Id
	@Column(name = "ProductlineID")
	private int productlineID;
	
	@Column(name = "Name")
	private String name;
	
	//TODO
	@Column(name = "MachineID")
	private int machineID;
	
	@Column(name = "Sequence")
	private int sequence;
	
	@Column(name = "StaffID")
	private int staffID;

	public int getProductlineID() {
		return productlineID;
	}

	public void setProductlineID(int productlineID) {
		this.productlineID = productlineID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMachineID() {
		return machineID;
	}

	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	@Override
	public String toString() {
		return "Productlines [productlineID=" + productlineID + ", name=" + name + ", machineID=" + machineID
				+ ", sequence=" + sequence + ", staffID=" + staffID + "]";
	}

	public Productlines(int productlineID, String name, int machineID, int sequence, int staffID) {
		super();
		this.productlineID = productlineID;
		this.name = name;
		this.machineID = machineID;
		this.sequence = sequence;
		this.staffID = staffID;
	}

	public Productlines() {

	}
}
