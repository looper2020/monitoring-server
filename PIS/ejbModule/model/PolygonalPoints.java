package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "PolygonalPoints")
public class PolygonalPoints implements Serializable {

	@Id
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "Sequence")
	private int sequence;
	
	@Column(name = "GpsPoint")
	private int gpsPoint;
	
	@Column(name = "LocationHierarchy")
	private int locationHierarchy;
	
    public int getSurfaceID() {
		return surfaceID;
	}

	public void setSurfaceID(int surfaceID) {
		this.surfaceID = surfaceID;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getGpsPoint() {
		return gpsPoint;
	}

	public void setGpsPoint(int gpsPoint) {
		this.gpsPoint = gpsPoint;
	}

	public int getLocationHierarchy() {
		return locationHierarchy;
	}

	public void setLocationHierarchy(int locationHierarchy) {
		this.locationHierarchy = locationHierarchy;
	}

	@Override
	public String toString() {
		return "PolygonalPoints [surfaceID=" + surfaceID + ", sequence=" + sequence + ", gpsPoint=" + gpsPoint
				+ ", locationHierarchy=" + locationHierarchy + "]";
	}

	public PolygonalPoints(int surfaceID, int sequence, int gpsPoint, int locationHierarchy) {
		super();
		this.surfaceID = surfaceID;
		this.sequence = sequence;
		this.gpsPoint = gpsPoint;
		this.locationHierarchy = locationHierarchy;
	}

    public PolygonalPoints() {
    	
    }
}
