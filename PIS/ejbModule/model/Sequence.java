package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Sequences")
public class Sequence implements Serializable {

	@Id
	@Column(name = "Sequence")
	private int sequence;
	
	@Column(name = "Description")
	private String description;
	
    public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Sequence [sequence=" + sequence + ", description=" + description + "]";
	}

	public Sequence(int sequence, String description) {
		super();
		this.sequence = sequence;
		this.description = description;
	}

    public Sequence() {
    	
    }
}
