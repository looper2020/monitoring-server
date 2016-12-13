package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Polygons")
public class Polygons implements Serializable {

	@Id
	@Column(name = "SurfaceID")
	private int surfaceID;
	
	@Column(name = "Description")
	private String description;
	
    public int getSurfaceID() {
		return surfaceID;
	}

	public void setSurfaceID(int surfaceID) {
		this.surfaceID = surfaceID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Polygons [surfaceID=" + surfaceID + ", description=" + description + "]";
	}

    public Polygons() {

    }

	public Polygons(int surfaceID, String description) {
		super();
		this.surfaceID = surfaceID;
		this.description = description;
	}
}
