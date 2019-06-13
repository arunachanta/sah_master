/**
 * 
 *//*
package com.sah.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sah.foundation.SAHBean;


*//**
 * @author I077942
 *
 *//*
@Entity
public class Person implements SAHBean{
	private static final long serialVersionUID = 1L;

	public Person() {
	}

	@Id
	@GeneratedValue
	private Integer personId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	public Integer getStudentId() {
		return personId;
	}

	public void setId(Integer personId) {
		this.personId = personId;
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

}
*/