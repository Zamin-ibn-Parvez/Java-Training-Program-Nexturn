package One2One;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Passport {
	@Id
	private String passportNo;
	@Column(columnDefinition = "date")
	private Date dateIssued;
	@Column(columnDefinition = "date")
	private Date dateExpiry;
	
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "personId")
	private Person person;


	public String getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}


	public Date getDateIssued() {
		return dateIssued;
	}


	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}


	public Date getDateExpiry() {
		return dateExpiry;
	}


	public void setDateExpiry(Date dateExpiry) {
		this.dateExpiry = dateExpiry;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
