/*package com.sah.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;

import com.sah.foundation.SAHBean;

@Entity
@Table(name = "\"sah.curatedViews::materialized.RetentionDetails\"")
public class RetentionDetails implements SAHBean{

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RetentionDetailsKey RetentionDetailsKey;
	
	@Column 
	private String CohortTermID;

	@Column 
	private String CohortTermIsMajor;

	@Column 
	private String CohortTermName;

	@Column 
	private String CohortYear;

	@Column 
	private String AcademicTermID;

	@Column 
	private String AcademicTermIsMajor;

	@Column 
	private String AcademicTermName;

	@Column 
	private String AcademicYear;

	@Column 
	private Integer ClassesEnrolled;

	@Column 
	private Double UnitsEnrolled;

	@Column 
	private Double CumUnits;

	@Column 
	private Double EnrolledTermCount;

	@Column 
	private String IsEnrolled;

	@Column 
	private String HasProgressed;

	@Column 
	private String IsGraduated;

	@Column 
	private String IsRetained;

	@Column 
	private Double StudentTermNumber;

	@Column 
	private Double StudentYearNumber;

	@Column 
	private Double RowNumber;

	@ManyToOne
	private Demographics demographics;

	@OneToOne(mappedBy = "retentionDetails")
	private Retention retention;

	@OneToOne(mappedBy = "retentionDetails")
	private Enrollment enrollment;

	public RetentionDetailsKey getRetentionDetailsKey() {
		return RetentionDetailsKey;
	}

	public void setRetentionDetailsKey(RetentionDetailsKey retentionDetailsKey) {
		RetentionDetailsKey = retentionDetailsKey;
	}

	public String getCohortTermID() {
		return CohortTermID;
	}

	public void setCohortTermID(String cohortTermID) {
		CohortTermID = cohortTermID;
	}

	public String getCohortTermIsMajor() {
		return CohortTermIsMajor;
	}

	public void setCohortTermIsMajor(String cohortTermIsMajor) {
		CohortTermIsMajor = cohortTermIsMajor;
	}

	public String getCohortTermName() {
		return CohortTermName;
	}

	public void setCohortTermName(String cohortTermName) {
		CohortTermName = cohortTermName;
	}

	public String getCohortYear() {
		return CohortYear;
	}

	public void setCohortYear(String cohortYear) {
		CohortYear = cohortYear;
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

	public String getAcademicYear() {
		return AcademicYear;
	}

	public void setAcademicYear(String academicYear) {
		AcademicYear = academicYear;
	}

	public Integer getClassesEnrolled() {
		return ClassesEnrolled;
	}

	public void setClassesEnrolled(Integer classesEnrolled) {
		ClassesEnrolled = classesEnrolled;
	}

	public Double getUnitsEnrolled() {
		return UnitsEnrolled;
	}

	public void setUnitsEnrolled(Double unitsEnrolled) {
		UnitsEnrolled = unitsEnrolled;
	}

	public Double getCumUnits() {
		return CumUnits;
	}

	public void setCumUnits(Double cumUnits) {
		CumUnits = cumUnits;
	}

	public Double getEnrolledTermCount() {
		return EnrolledTermCount;
	}

	public void setEnrolledTermCount(Double enrolledTermCount) {
		EnrolledTermCount = enrolledTermCount;
	}

	public String getIsEnrolled() {
		return IsEnrolled;
	}

	public void setIsEnrolled(String isEnrolled) {
		IsEnrolled = isEnrolled;
	}

	public String getHasProgressed() {
		return HasProgressed;
	}

	public void setHasProgressed(String hasProgressed) {
		HasProgressed = hasProgressed;
	}

	public String getIsGraduated() {
		return IsGraduated;
	}

	public void setIsGraduated(String isGraduated) {
		IsGraduated = isGraduated;
	}

	public String getIsRetained() {
		return IsRetained;
	}

	public void setIsRetained(String isRetained) {
		IsRetained = isRetained;
	}

	public Double getStudentTermNumber() {
		return StudentTermNumber;
	}

	public void setStudentTermNumber(Double studentTermNumber) {
		StudentTermNumber = studentTermNumber;
	}

	public Double getStudentYearNumber() {
		return StudentYearNumber;
	}

	public void setStudentYearNumber(Double studentYearNumber) {
		StudentYearNumber = studentYearNumber;
	}

	public Double getRowNumber() {
		return RowNumber;
	}

	public void setRowNumber(Double rowNumber) {
		RowNumber = rowNumber;
	}

	public Demographics getDemographics() {
	    return demographics;
	}

	public void setDemographics(Demographics param) {
	    this.demographics = param;
	}

	public Retention getRetention() {
	    return retention;
	}

	public void setRetention(Retention param) {
	    this.retention = param;
	}

	public Enrollment getEnrollment() {
	    return enrollment;
	}

	public void setEnrollment(Enrollment param) {
	    this.enrollment = param;
	}

}
*/