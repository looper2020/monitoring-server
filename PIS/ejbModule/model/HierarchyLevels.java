package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "HierarchyLevels")
public class HierarchyLevels implements Serializable {

	@Id
	@Column(name = "LocationHierarchy")
	private int locationHierarchy;
	
	@Column(name = "TableName")
	private String tableName;
	
	@Column(name = "Description")
	private String description;
	
    public int getLocationHierarchy() {
		return locationHierarchy;
	}

	public void setLocationHierarchy(int locationHierarchy) {
		this.locationHierarchy = locationHierarchy;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "HierarchyLevels [locationHierarchy=" + locationHierarchy + ", tableName=" + tableName + ", description="
				+ description + "]";
	}

	public HierarchyLevels(int locationHierarchy, String tableName, String description) {
		super();
		this.locationHierarchy = locationHierarchy;
		this.tableName = tableName;
		this.description = description;
	}

    public HierarchyLevels() {
    	
    }
}
