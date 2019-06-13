package sap.sah2.entities;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.couchbase.core.query.View;

//import com.sah.foundation.SAHBean;

@Entity
//@Table(name = "\"sah.curatedViews::Demo_Enr\"")
public class Demo_Enr implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//demographics
	@Id
	@Column(name = "\"StudentID\"")

	private String StudentID;

	@Column(name = "\"GenderAtBirth\"")
	private String GenderAtBirth;

	@Column(name = "\"AcademicYear\"")
	private String AcademicYear;
	
	@Column(name = "\"COUNT_STUDENTS\"")
	private Integer Count_Student;

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getGenderAtBirth() {
		return GenderAtBirth;
	}

	public void setGenderAtBirth(String genderAtBirth) {
		GenderAtBirth = genderAtBirth;
	}

	public String getAcademicYear() {
		return AcademicYear;
	}

	public void setAcademicYear(String academicYear) {
		AcademicYear = academicYear;
	}

	public Integer getCount_Student() {
		return Count_Student;
	}

	public void setCount_Student(Integer count_Student) {
		Count_Student = count_Student;
	}


	}
