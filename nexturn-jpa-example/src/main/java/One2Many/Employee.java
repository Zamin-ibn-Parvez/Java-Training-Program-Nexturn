package One2Many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.SwingContainer;

@Entity
public class Employee {
	
	@Id 
	private int empcode;
	@Column(length = 40)
	private String empname;
	
	@OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL)
	List<Vehicle> vehicles;

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
	
	
	

}
