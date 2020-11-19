package com.example.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRIYATHAMGALISETTY")
public class PriyathamGalisetty  implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name = "ID")
	long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "FIRST_NAME")
	String firstName;
	@Column(name = "LAST_NAME")
	String lastName;
	
	public PriyathamGalisetty() {}
	
	public PriyathamGalisetty(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "PriyathamGalisetty [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
