package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Addresses")
public class Addresses implements Serializable {

	@Id
	@Column(name = "AddressID")
	private int addressID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Street")
	private String street;
	
	@Column(name = "StreetNumber")
	private String streetNumber;
	
	@Column(name = "ZipCode")
	private String zipCode;
	
	@Column(name = "Place")
	private String place;
	
	@Column(name = "Country")
	private String country;

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Addresses(int addressID, String name, String street, String streetNumber, String zipCode, String place,
			String country) {
		super();
		this.addressID = addressID;
		this.name = name;
		this.street = street;
		this.streetNumber = streetNumber;
		this.zipCode = zipCode;
		this.place = place;
		this.country = country;
	}

	public Addresses() {

	}
}
