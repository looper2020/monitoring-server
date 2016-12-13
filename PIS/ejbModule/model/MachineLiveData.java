package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Staff")
public class MachineLiveData implements Serializable {
	
	@Id
	@Column(name = "DatasetID")
	private int datasetID;
	
	@Column(name = "Timestamp")
	private LocalDate timestamp;
	
	@Column(name = "MachineID")
	private int machineID;
	
	@Column(name = "Service")
	private int service;
	
	@Column(name = "MaintenanceInterval")
	private float maintenanceInterval;
	
	@Column(name = "TemperatureSensor")
	private float temperatureSensor;

	public int getDatasetID() {
		return datasetID;
	}

	public void setDatasetID(int datasetID) {
		this.datasetID = datasetID;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public int getMachineID() {
		return machineID;
	}

	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

	public float getMaintenanceInterval() {
		return maintenanceInterval;
	}

	public void setMaintenanceInterval(float maintenanceInterval) {
		this.maintenanceInterval = maintenanceInterval;
	}

	public float getTemperatureSensor() {
		return temperatureSensor;
	}

	public void setTemperatureSensor(float temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}

	@Override
	public String toString() {
		return "MachineLiveData [datasetID=" + datasetID + ", timestamp=" + timestamp + ", machineID=" + machineID
				+ ", service=" + service + ", maintenanceInterval=" + maintenanceInterval + ", temperatureSensor="
				+ temperatureSensor + "]";
	}

	public MachineLiveData(int datasetID, LocalDate timestamp, int machineID, int service, float maintenanceInterval,
			float temperatureSensor) {
		super();
		this.datasetID = datasetID;
		this.timestamp = timestamp;
		this.machineID = machineID;
		this.service = service;
		this.maintenanceInterval = maintenanceInterval;
		this.temperatureSensor = temperatureSensor;
	}

	public MachineLiveData() {

	}
}
