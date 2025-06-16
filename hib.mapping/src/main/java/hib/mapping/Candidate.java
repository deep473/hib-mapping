package hib.mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Candidate {
	@Id
	int cId;
	String name;
	@ManyToMany
	List<Interview> intList;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int cId, String name, List<Interview> intList) {
		super();
		this.cId = cId;
		this.name = name;
		this.intList = intList;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Interview> getIntList() {
		return intList;
	}
	public void setIntList(List<Interview> intList) {
		this.intList = intList;
	}
	@Override
	public String toString() {
		return "Candidate [cId=" + cId + ", name=" + name + ", intList=" + intList + "]";
	}
	
}
