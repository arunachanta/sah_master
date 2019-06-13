/*package com.sah.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;

import com.sah.foundation.SAHBean;

@Entity
@Table(name = "\"sah.curatedViews::materialized.MajorsMinorsDetails\"")
public class MajorsMinorsDetails implements SAHBean {
	
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MajorsMinorsDetailsKey MajorsMinorsDetailsKey;
	
	@Column 
	private String ToProgramPriority;

	@Column 
	private String AcademicTermID;

	@Column 
	private String AcademicTermIsMajor;

	@Column 
	private String AcademicTermName;

	@Column 
	private Integer AcademicYear;

	@Column 
	private Date ActivityDate;

	@Column 
	private String FromProgramID;

	@Column 
	private String FromProgramName;

	@Column 
	private String FromProgramShortName;

	@Column 
	private String FromProgramPriority;

	@Column 
	private String FromDegreeTypeID;

	@Column 
	private String FromProgramDepartmentID;

	@Column 
	private String FromProgramDepartmentName;

	@Column 
	private String FromProgramSchoolDivisionID;

	@Column 
	private String FromProgramSchoolDivisionName;

	@Column 
	private String FromProgramCipCode;

	@Column 
	private String ToProgramID;

	@Column 
	private String ToProgramName;

	@Column 
	private String ToProgramShortName;

	@Column 
	private String ToDegreeTypeID;

	@Column 
	private String ToProgramDepartmentID;

	@Column 
	private String ToProgramDepartmentName;

	@Column 
	private String ToProgramSchoolDivisionID;

	@Column 
	private String ToProgramSchoolDivisionName;

	@Column 
	private String ToProgramCipCode;

	@Column 
	private String ActivityCode;

	@Column 
	private String ActivityID;

	@Column 
	private String ActivityStatus;

	@ManyToOne
	private Demographics demographics;

	@ManyToMany(mappedBy = "majorsMinorsDetails")
	private Collection<Enrollment> enrollment;

	public MajorsMinorsDetailsKey getMajorsMinorsDetailsKey() {
		return MajorsMinorsDetailsKey;
	}

	public void setMajorsMinorsDetailsKey(MajorsMinorsDetailsKey majorsMinorsDetailsKey) {
		MajorsMinorsDetailsKey = majorsMinorsDetailsKey;
	}

	public String getToProgramPriority() {
		return ToProgramPriority;
	}

	public void setToProgramPriority(String toProgramPriority) {
		ToProgramPriority = toProgramPriority;
	}

	public String getAcademicTermID() {
		return AcademicTermID;
	}

	public void setAcademicTermID(String academicTermID) {
		AcademicTermID = academicTermID;
	}

	public String getAcademicTermIsMajor() {
		return AcademicTermIsMajor;
	}

	public void setAcademicTermIsMajor(String academicTermIsMajor) {
		AcademicTermIsMajor = academicTermIsMajor;
	}

	public String getAcademicTermName() {
		return AcademicTermName;
	}

	public void setAcademicTermName(String academicTermName) {
		AcademicTermName = academicTermName;
	}

	public Integer getAcademicYear() {
		return AcademicYear;
	}

	public void setAcademicYear(Integer academicYear) {
		AcademicYear = academicYear;
	}

	public Date getActivityDate() {
		return ActivityDate;
	}

	public void setActivityDate(Date activityDate) {
		ActivityDate = activityDate;
	}

	public String getFromProgramID() {
		return FromProgramID;
	}

	public void setFromProgramID(String fromProgramID) {
		FromProgramID = fromProgramID;
	}

	public String getFromProgramName() {
		return FromProgramName;
	}

	public void setFromProgramName(String fromProgramName) {
		FromProgramName = fromProgramName;
	}

	public String getFromProgramShortName() {
		return FromProgramShortName;
	}

	public void setFromProgramShortName(String fromProgramShortName) {
		FromProgramShortName = fromProgramShortName;
	}

	public String getFromProgramPriority() {
		return FromProgramPriority;
	}

	public void setFromProgramPriority(String fromProgramPriority) {
		FromProgramPriority = fromProgramPriority;
	}

	public String getFromDegreeTypeID() {
		return FromDegreeTypeID;
	}

	public void setFromDegreeTypeID(String fromDegreeTypeID) {
		FromDegreeTypeID = fromDegreeTypeID;
	}

	public String getFromProgramDepartmentID() {
		return FromProgramDepartmentID;
	}

	public void setFromProgramDepartmentID(String fromProgramDepartmentID) {
		FromProgramDepartmentID = fromProgramDepartmentID;
	}

	public String getFromProgramDepartmentName() {
		return FromProgramDepartmentName;
	}

	public void setFromProgramDepartmentName(String fromProgramDepartmentName) {
		FromProgramDepartmentName = fromProgramDepartmentName;
	}

	public String getFromProgramSchoolDivisionID() {
		return FromProgramSchoolDivisionID;
	}

	public void setFromProgramSchoolDivisionID(String fromProgramSchoolDivisionID) {
		FromProgramSchoolDivisionID = fromProgramSchoolDivisionID;
	}

	public String getFromProgramSchoolDivisionName() {
		return FromProgramSchoolDivisionName;
	}

	public void setFromProgramSchoolDivisionName(String fromProgramSchoolDivisionName) {
		FromProgramSchoolDivisionName = fromProgramSchoolDivisionName;
	}

	public String getFromProgramCipCode() {
		return FromProgramCipCode;
	}

	public void setFromProgramCipCode(String fromProgramCipCode) {
		FromProgramCipCode = fromProgramCipCode;
	}

	public String getToProgramID() {
		return ToProgramID;
	}

	public void setToProgramID(String toProgramID) {
		ToProgramID = toProgramID;
	}

	public String getToProgramName() {
		return ToProgramName;
	}

	public void setToProgramName(String toProgramName) {
		ToProgramName = toProgramName;
	}

	public String getToProgramShortName() {
		return ToProgramShortName;
	}

	public void setToProgramShortName(String toProgramShortName) {
		ToProgramShortName = toProgramShortName;
	}

	public String getToDegreeTypeID() {
		return ToDegreeTypeID;
	}

	public void setToDegreeTypeID(String toDegreeTypeID) {
		ToDegreeTypeID = toDegreeTypeID;
	}

	public String getToProgramDepartmentID() {
		return ToProgramDepartmentID;
	}

	public void setToProgramDepartmentID(String toProgramDepartmentID) {
		ToProgramDepartmentID = toProgramDepartmentID;
	}

	public String getToProgramDepartmentName() {
		return ToProgramDepartmentName;
	}

	public void setToProgramDepartmentName(String toProgramDepartmentName) {
		ToProgramDepartmentName = toProgramDepartmentName;
	}

	public String getToProgramSchoolDivisionID() {
		return ToProgramSchoolDivisionID;
	}

	public void setToProgramSchoolDivisionID(String toProgramSchoolDivisionID) {
		ToProgramSchoolDivisionID = toProgramSchoolDivisionID;
	}

	public String getToProgramSchoolDivisionName() {
		return ToProgramSchoolDivisionName;
	}

	public void setToProgramSchoolDivisionName(String toProgramSchoolDivisionName) {
		ToProgramSchoolDivisionName = toProgramSchoolDivisionName;
	}

	public String getToProgramCipCode() {
		return ToProgramCipCode;
	}

	public void setToProgramCipCode(String toProgramCipCode) {
		ToProgramCipCode = toProgramCipCode;
	}

	public String getActivityCode() {
		return ActivityCode;
	}

	public void setActivityCode(String activityCode) {
		ActivityCode = activityCode;
	}

	public String getActivityID() {
		return ActivityID;
	}

	public void setActivityID(String activityID) {
		ActivityID = activityID;
	}

	public String getActivityStatus() {
		return ActivityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		ActivityStatus = activityStatus;
	}

	public Demographics getDemographics() {
	    return demographics;
	}

	public void setDemographics(Demographics param) {
	    this.demographics = param;
	}

	public Collection<Enrollment> getEnrollment() {
	    return enrollment;
	}

	public void setEnrollment(Collection<Enrollment> param) {
	    this.enrollment = param;
	}

	
}
*/