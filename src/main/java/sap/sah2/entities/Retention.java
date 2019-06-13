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
@Table(name = "\"sah.curatedViews::materialized.Retention\"")
public class Retention implements SAHBean {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RetentionKey RetentionKey;
	
	@Column 
	private String CohortTermID;

	@Column 
	private String CohortTermName;

	@Column 
	private String CohortTermIsMajor;

	@Column 
	private String CohortYear;

	@Column 
	private String HasProgressed1Term;

	@Column 
	private String HasProgressed2Terms;

	@Column 
	private String HasProgressed3Terms;

	@Column 
	private Integer ProgressedAllTermsCount;

	@Column 
	private String HasProgressed1Year;

	@Column 
	private String HasProgressed2Years;

	@Column 
	private String HasProgressed3Years;

	@Column 
	private String HasProgressed4Years;

	@Column 
	private String IsGraduated3Years;

	@Column 
	private String IsGraduated4Years;

	@Column 
	private String IsGraduated5Years;

	@Column 
	private String IsGraduated6Years;

	@Column 
	private String IsGraduated7Years;

	@Column 
	private String IsRetained1Term;

	@Column 
	private String IsRetained2Terms;

	@Column 
	private Integer ProgressedMajorTermsCount;

	@Column 
	private Integer RetainedTermCount;

	@Column 
	private String IsRetained1Year;

	@Column 
	private String IsRetained2Years;

	@Column 
	private String IsRetained3Years;

	@Column 
	private String IsRetained4Years;

	@Column 
	private String IsRetained5Years;

	@ManyToOne
	private Demographics demographics;

	@OneToOne
	private RetentionDetails retentionDetails;

	@OneToOne(mappedBy = "retention")
	private Enrollment enrollment;

	
	
	public RetentionKey getRetentionKey() {
		return RetentionKey;
	}

	public void setRetentionKey(RetentionKey retentionKey) {
		RetentionKey = retentionKey;
	}

	public String getCohortTermID() {
		return CohortTermID;
	}

	public void setCohortTermID(String cohortTermID) {
		CohortTermID = cohortTermID;
	}

	public String getCohortTermName() {
		return CohortTermName;
	}

	public void setCohortTermName(String cohortTermName) {
		CohortTermName = cohortTermName;
	}

	public String getCohortTermIsMajor() {
		return CohortTermIsMajor;
	}

	public void setCohortTermIsMajor(String cohortTermIsMajor) {
		CohortTermIsMajor = cohortTermIsMajor;
	}

	public String getCohortYear() {
		return CohortYear;
	}

	public void setCohortYear(String cohortYear) {
		CohortYear = cohortYear;
	}

	public String getHasProgressed1Term() {
		return HasProgressed1Term;
	}

	public void setHasProgressed1Term(String hasProgressed1Term) {
		HasProgressed1Term = hasProgressed1Term;
	}

	public String getHasProgressed2Terms() {
		return HasProgressed2Terms;
	}

	public void setHasProgressed2Terms(String hasProgressed2Terms) {
		HasProgressed2Terms = hasProgressed2Terms;
	}

	public String getHasProgressed3Terms() {
		return HasProgressed3Terms;
	}

	public void setHasProgressed3Terms(String hasProgressed3Terms) {
		HasProgressed3Terms = hasProgressed3Terms;
	}

	public Integer getProgressedAllTermsCount() {
		return ProgressedAllTermsCount;
	}

	public void setProgressedAllTermsCount(Integer progressedAllTermsCount) {
		ProgressedAllTermsCount = progressedAllTermsCount;
	}

	public String getHasProgressed1Year() {
		return HasProgressed1Year;
	}

	public void setHasProgressed1Year(String hasProgressed1Year) {
		HasProgressed1Year = hasProgressed1Year;
	}

	public String getHasProgressed2Years() {
		return HasProgressed2Years;
	}

	public void setHasProgressed2Years(String hasProgressed2Years) {
		HasProgressed2Years = hasProgressed2Years;
	}

	public String getHasProgressed3Years() {
		return HasProgressed3Years;
	}

	public void setHasProgressed3Years(String hasProgressed3Years) {
		HasProgressed3Years = hasProgressed3Years;
	}

	public String getHasProgressed4Years() {
		return HasProgressed4Years;
	}

	public void setHasProgressed4Years(String hasProgressed4Years) {
		HasProgressed4Years = hasProgressed4Years;
	}

	public String getIsGraduated3Years() {
		return IsGraduated3Years;
	}

	public void setIsGraduated3Years(String isGraduated3Years) {
		IsGraduated3Years = isGraduated3Years;
	}

	public String getIsGraduated4Years() {
		return IsGraduated4Years;
	}

	public void setIsGraduated4Years(String isGraduated4Years) {
		IsGraduated4Years = isGraduated4Years;
	}

	public String getIsGraduated5Years() {
		return IsGraduated5Years;
	}

	public void setIsGraduated5Years(String isGraduated5Years) {
		IsGraduated5Years = isGraduated5Years;
	}

	public String getIsGraduated6Years() {
		return IsGraduated6Years;
	}

	public void setIsGraduated6Years(String isGraduated6Years) {
		IsGraduated6Years = isGraduated6Years;
	}

	public String getIsGraduated7Years() {
		return IsGraduated7Years;
	}

	public void setIsGraduated7Years(String isGraduated7Years) {
		IsGraduated7Years = isGraduated7Years;
	}

	public String getIsRetained1Term() {
		return IsRetained1Term;
	}

	public void setIsRetained1Term(String isRetained1Term) {
		IsRetained1Term = isRetained1Term;
	}

	public String getIsRetained2Terms() {
		return IsRetained2Terms;
	}

	public void setIsRetained2Terms(String isRetained2Terms) {
		IsRetained2Terms = isRetained2Terms;
	}

	public Integer getProgressedMajorTermsCount() {
		return ProgressedMajorTermsCount;
	}

	public void setProgressedMajorTermsCount(Integer progressedMajorTermsCount) {
		ProgressedMajorTermsCount = progressedMajorTermsCount;
	}

	public Integer getRetainedTermCount() {
		return RetainedTermCount;
	}

	public void setRetainedTermCount(Integer retainedTermCount) {
		RetainedTermCount = retainedTermCount;
	}

	public String getIsRetained1Year() {
		return IsRetained1Year;
	}

	public void setIsRetained1Year(String isRetained1Year) {
		IsRetained1Year = isRetained1Year;
	}

	public String getIsRetained2Years() {
		return IsRetained2Years;
	}

	public void setIsRetained2Years(String isRetained2Years) {
		IsRetained2Years = isRetained2Years;
	}

	public String getIsRetained3Years() {
		return IsRetained3Years;
	}

	public void setIsRetained3Years(String isRetained3Years) {
		IsRetained3Years = isRetained3Years;
	}

	public String getIsRetained4Years() {
		return IsRetained4Years;
	}

	public void setIsRetained4Years(String isRetained4Years) {
		IsRetained4Years = isRetained4Years;
	}

	public String getIsRetained5Years() {
		return IsRetained5Years;
	}

	public void setIsRetained5Years(String isRetained5Years) {
		IsRetained5Years = isRetained5Years;
	}

	public Demographics getDemographics() {
	    return demographics;
	}

	public void setDemographics(Demographics param) {
	    this.demographics = param;
	}

	public RetentionDetails getRetentionDetails() {
	    return retentionDetails;
	}

	public void setRetentionDetails(RetentionDetails param) {
	    this.retentionDetails = param;
	}

	public Enrollment getEnrollment() {
	    return enrollment;
	}

	public void setEnrollment(Enrollment param) {
	    this.enrollment = param;
	}
	
	

}
*/