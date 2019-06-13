/*package com.sah.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sah.foundation.SAHBean;

@Embeddable
public class RetentionDetailsKey implements SAHBean{

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	@Column
	private String StudentID;

	@Column
	private String CohortGroup;

	@Column
	private String CohortTerm;
	
	@Column
	private String AcademicTerm;

	@Column
	private String CohortCategory;
	
	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getCohortGroup() {
		return CohortGroup;
	}

	public void setCohortGroup(String cohortGroup) {
		CohortGroup = cohortGroup;
	}

	public String getCohortTerm() {
		return CohortTerm;
	}

	public void setCohortTerm(String cohortTerm) {
		CohortTerm = cohortTerm;
	}

	public String getAcademicTerm() {
		return AcademicTerm;
	}

	public void setAcademicTerm(String academicTerm) {
		AcademicTerm = academicTerm;
	}

	public String getCohortCategory() {
		return CohortCategory;
	}

	public void setCohortCategory(String cohortCategory) {
		CohortCategory = cohortCategory;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AcademicTerm == null) ? 0 : AcademicTerm.hashCode());
		result = prime * result + ((CohortCategory == null) ? 0 : CohortCategory.hashCode());
		result = prime * result + ((CohortGroup == null) ? 0 : CohortGroup.hashCode());
		result = prime * result + ((CohortTerm == null) ? 0 : CohortTerm.hashCode());
		result = prime * result + ((StudentID == null) ? 0 : StudentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetentionDetailsKey other = (RetentionDetailsKey) obj;
		if (AcademicTerm == null) {
			if (other.AcademicTerm != null)
				return false;
		} else if (!AcademicTerm.equals(other.AcademicTerm))
			return false;
		if (CohortCategory == null) {
			if (other.CohortCategory != null)
				return false;
		} else if (!CohortCategory.equals(other.CohortCategory))
			return false;
		if (CohortGroup == null) {
			if (other.CohortGroup != null)
				return false;
		} else if (!CohortGroup.equals(other.CohortGroup))
			return false;
		if (CohortTerm == null) {
			if (other.CohortTerm != null)
				return false;
		} else if (!CohortTerm.equals(other.CohortTerm))
			return false;
		if (StudentID == null) {
			if (other.StudentID != null)
				return false;
		} else if (!StudentID.equals(other.StudentID))
			return false;
		return true;
	}
}
*/