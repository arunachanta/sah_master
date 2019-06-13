package sap.sah2.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import sap.sah2.annotations.SAPLineItem;
import sap.sah2.annotations.Sap;

@Entity

@Table(name = "\"sah.curatedViews::materialized.Demographics\"")
public class Demographics implements Serializable {

	private static final long serialVersionUID = 1L;
	@Sap(filterable=true, sortable=true)
	public Demographics() {

	}

	@Id
	@Column(name = "\"StudentID\"")
	private String StudentID;
	@SAPLineItem
	@Column(name = "\"AcademicStatusCurrent\"")
	private String AcademicStatusCurrent;

	@Column(name = "\"AcademicTermIDLastEnrolled\"")
	private String AcademicTermIDLastEnrolled;

	@Column(name = "\"AcademicTermLastEnrolled\"")
	private String AcademicTermLastEnrolled;

	@Column(name = "\"AcademicTermNameLastEnrolled\"")
	private String AcademicTermNameLastEnrolled;

	@Column(name = "\"AcademicTermLastEnrolledIsMajor\"")
	private String AcademicTermLastEnrolledIsMajor;

	@Column(name = "\"AcademicYearLastEnrolled\"")
	private String AcademicYearLastEnrolled;
	

	@Sap(filterable=true, sortable=true)
	@Column(name = "\"ACT\"")
	private Double ACT;

	@Column(name = "\"ACTEnglish\"")
	private Double ACTEnglish;

	@Column(name = "\"ACTMath\"")
	private Double ACTMath;

	@Column(name = "\"ACTReading\"")
	private Double ACTReading;

	@Column(name = "\"ACTScience\"")
	private Double ACTScience;

	@Column(name = "\"ActiveHoldsAcademicCurrent\"")
	private Double ActiveHoldsAcademicCurrent;

	@Column(name = "\"ActiveHoldsAdministrativeCurrent\"")
	private Double ActiveHoldsAdministrativeCurrent;

	@Column(name = "\"ActiveHoldsFinancialCurrent\"")
	private Double ActiveHoldsFinancialCurrent;

	@Column(name = "\"AgeCurrent\"")
	private Integer AgeCurrent;

	@Column(name = "\"CohortAcadTermGRS\"")
	private String CohortAcadTermGRS;

	@Column(name = "\"CohortAcadTermNameGRS\"")
	private String CohortAcadTermNameGRS;

	@Column(name = "\"CohortAcadTermIdGRS\"")
	private String CohortAcadTermIdGRS;

	@Column(name = "\"CohortAcadYearGRS\"")
	private String CohortAcadYearGRS;

	@Column(name = "\"CountryOfOriginCode\"")
	private String CountryOfOriginCode;

	@Column(name = "\"CountryOfOriginName\"")
	private String CountryOfOriginName;

	@Column(name = "\"CountyOfOriginCode\"")
	private String CountyOfOriginCode;

	@Column(name = "\"CountyOfOriginName\"")
	private String CountyOfOriginName;

	@Column(name = "\"ClassificationIDCurrent\"")
	private String ClassificationIDCurrent;

	@Column(name = "\"ClassificationCurrent\"")
	private String ClassificationCurrent;

	@Column(name = "\"Ethnicity\"")
	private String Ethnicity;

	@Column(name = "\"FirstTimeGradStudentAcadTerm\"")
	private String FirstTimeGradStudentAcadTerm;

	@Column(name = "\"FirstTimeGradStudentAcadTermIsMajor\"")
	private String FirstTimeGradStudentAcadTermIsMajor;

	@Column(name = "\"FirstTimeGradStudentAcadTermID\"")
	private String FirstTimeGradStudentAcadTermID;

	@Column(name = "\"FirstTimeGradStudentAcadTermName\"")
	private String FirstTimeGradStudentAcadTermName;

	@Column(name = "\"FirstTimeGradStudentAcadYear\"")
	private String FirstTimeGradStudentAcadYear;

	@Column(name = "\"FirstTimeTransferAcadTerm\"")
	private String FirstTimeTransferAcadTerm;

	@Column(name = "\"FirstTimeTransferAcadTermName\"")
	private String FirstTimeTransferAcadTermName;

	@Column(name = "\"FirstTimeTransferAcadTermIsMajor\"")
	private String FirstTimeTransferAcadTermIsMajor;

	@Column(name = "\"FirstTimeTransferAcadTermID\"")
	private String FirstTimeTransferAcadTermID;

	@Column(name = "\"FirstTimeTransferAcadYear\"")
	private String FirstTimeTransferAcadYear;

	@Column(name = "\"FirstTimeUGDegreeSeekingAcadTerm\"")
	private String FirstTimeUGDegreeSeekingAcadTerm;

	@Column(name = "\"FirstTimeUGDegreeSeekingAcadTermName\"")
	private String FirstTimeUGDegreeSeekingAcadTermName;

	@Column(name = "\"FirstTimeUGDegreeSeekingAcadTermIsMajor\"")
	private String FirstTimeUGDegreeSeekingAcadTermIsMajor;

	@Column(name = "\"FirstTimeUGDegreeSeekingAcadTermID\"")
	private String FirstTimeUGDegreeSeekingAcadTermID;

	@Column(name = "\"FirstTimeUGDegreeSeekingAcadYear\"")
	private String FirstTimeUGDegreeSeekingAcadYear;

	@Column(name = "\"GenderIdentityCurrent\"")
	private String GenderIdentityCurrent;

	@Column(name = "\"GenderAtBirth\"")
	private String GenderAtBirth;

	@Column(name = "\"HighSchoolShortDescription\"")
	private String HighSchoolShortDescription;

	@Column(name = "\"HighSchoolID\"")
	private String HighSchoolID;

	@Column(name = "\"HighSchool\"")
	private String HighSchool;

	@Column(name = "\"HighSchoolIndex\"")
	private Double HighSchoolIndex;

	@Column(name = "\"HighSchoolGPA\"")
	private Double HighSchoolGPA;

	@Column(name = "\"HighestSATMathOrEquivalentACT\"")
	private Double HighestSATMathOrEquivalentACT;

	@Column(name = "\"HighestSATOrEquivalentACT\"")
	private Double HighestSATOrEquivalentACT;

	@Column(name = "\"HighestSATReadingOrEquivalentACT\"")
	private Double HighestSATReadingOrEquivalentACT;

	@Column(name = "\"HighestSATWritingOrEquivalentACT\"")
	private Double HighestSATWritingOrEquivalentACT;

	@Column(name = "\"IsTransferFirstTime\"")
	private String IsTransferFirstTime;

	@Column(name = "\"ResidencyCurrent\"")
	private String ResidencyCurrent;

	@Column(name = "\"ResidencyStatusCurrent\"")
	private String ResidencyStatusCurrent;

	@Column(name = "\"SAT\"")
	private Double SAT;

	@Column(name = "\"SATMath\"")
	private Double SATMath;

	@Column(name = "\"SATMax\"")
	private Double SATMax;

	@Column(name = "\"SATVerbal\"")
	private Double SATVerbal;

	@Column(name = "\"SATWriting\"")
	private Double SATWriting;

	@Column(name = "\"StateOfOriginCurrent\"")
	private String StateOfOriginCurrent;

	@Column(name = "\"IsFirstTime\"")
	private String IsFirstTime;

	@Column(name = "\"ZipOfOriginCurrent\"")
	private String ZipOfOriginCurrent;

	@Column(name = "\"IsAthleteCurrent\"")
	private String IsAthleteCurrent;

	@Column(name = "\"LMSLastLogin\"")
	private Date LMSLastLogin;

	@Column(name = "\"NumberOfMajorTermsEnrolledUG\"")
	private Double NumberOfMajorTermsEnrolledUG;

	@Column(name = "\"NumberOfTermsEnrolledUG\"")
	private Double NumberOfTermsEnrolledUG;

	@Column(name = "\"NumberOfMajorTermsEnrolledGRAD\"")
	private Double NumberOfMajorTermsEnrolledGRAD;

	@Column(name = "\"NumberOfTermsEnrolledGRAD\"")
	private Double NumberOfTermsEnrolledGRAD;

	@Column(name = "\"SuccessScoreVACCurrent\"")
	private Double SuccessScoreVACCurrent;

	@Column(name = "\"SuccessScoreVACCurrentClusterID\"")
	private String SuccessScoreVACCurrentClusterID;

	@Column(name = "\"SuccessScoreVACCurrentPercentile\"")
	private Double SuccessScoreVACCurrentPercentile;

	@Column(name = "\"SuccessScoreVACFirstTerm\"")
	private Double SuccessScoreVACFirstTerm;

	@Column(name = "\"SuccessScoreVACFirstTermClusterID\"")
	private String SuccessScoreVACFirstTermClusterID;

	@Column(name = "\"SuccessScoreVACFirstTermPercentile\"")
	private Double SuccessScoreVACFirstTermPercentile;

	@Column(name = "\"HighSchoolGPACapped\"")
	private Double HighSchoolGPACapped;

	@Column(name = "\"GRADGraduationEffectiveDate\"")
	private Date GRADGraduationEffectiveDate;

	@Column(name = "\"UGGraduationEffectiveDate\"")
	private Date UGGraduationEffectiveDate;

	@Column(name = "\"PrimaryCollegeFirst\"")
	private String PrimaryCollegeFirst;

	@Column(name = "\"PrimaryCollegeCurrent\"")
	private String PrimaryCollegeCurrent;

	@Column(name = "\"HasPellCurrent\"")
	private String HasPellCurrent;

	@Column(name = "\"HasPellEver\"")
	private String HasPellEver;

	@Column(name = "\"LatestPellAwardedTerm\"")
	private String LatestPellAwardedTerm;

	@Column(name = "\"LatestPellAwardedTermID\"")
	private String LatestPellAwardedTermID;

	@Column(name = "\"LatestPellAwardedYear\"")
	private String LatestPellAwardedYear;

	@Column(name = "\"LatestPellAwardedTermName\"")
	private String LatestPellAwardedTermName;

	@Column(name = "\"LatestPellAwardedTermNameIsMajor\"")
	private String LatestPellAwardedTermNameIsMajor;

	@Column(name = "\"NumberOfPellTerms\"")
	private Double NumberOfPellTerms;

	@Column(name = "\"IsFreshmanSummerProgram\"")
	private String IsFreshmanSummerProgram;

	@Column(name = "\"FirstTimeOtherStudentAcadTerm\"")
	private String FirstTimeOtherStudentAcadTerm;

	@Column(name = "\"FirstTimeOtherStudentAcadTermIsMajor\"")
	private String FirstTimeOtherStudentAcadTermIsMajor;

	@Column(name = "\"FirstTimeOtherStudentAcadTermID\"")
	private String FirstTimeOtherStudentAcadTermID;

	@Column(name = "\"FirstTimeOtherStudentAcadTermName\"")
	private String FirstTimeOtherStudentAcadTermName;

	@Column(name = "\"FirstTimeOtherStudentAcadYear\"")
	private String FirstTimeOtherStudentAcadYear;

//	@OneToMany(mappedBy = "demographics")
//	private Collection<MajorsMinorsDetails> majorsMinorsDetails;

//	@OneToMany
//	(mappedBy = "demographics", cascade = CascadeType.ALL)
	@JoinColumn(name = "StudentID")
//	private Collection<MajorsMinors> majorsMinors;

//	@OneToMany(mappedBy = "demographics")
//	private Collection<RetentionDetails> retentionDetails;
//
//	@OneToMany(mappedBy = "demographics")
//	private Collection<Retention> retention;

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getAcademicStatusCurrent() {
		return AcademicStatusCurrent;
	}

	public void setAcademicStatusCurrent(String academicStatusCurrent) {
		AcademicStatusCurrent = academicStatusCurrent;
	}

	public String getAcademicTermIDLastEnrolled() {
		return AcademicTermIDLastEnrolled;
	}

	public void setAcademicTermIDLastEnrolled(String academicTermIDLastEnrolled) {
		AcademicTermIDLastEnrolled = academicTermIDLastEnrolled;
	}

	public String getAcademicTermLastEnrolled() {
		return AcademicTermLastEnrolled;
	}

	public void setAcademicTermLastEnrolled(String academicTermLastEnrolled) {
		AcademicTermLastEnrolled = academicTermLastEnrolled;
	}

	public String getAcademicTermNameLastEnrolled() {
		return AcademicTermNameLastEnrolled;
	}

	public void setAcademicTermNameLastEnrolled(String academicTermNameLastEnrolled) {
		AcademicTermNameLastEnrolled = academicTermNameLastEnrolled;
	}

	public String getAcademicTermLastEnrolledIsMajor() {
		return AcademicTermLastEnrolledIsMajor;
	}

	public void setAcademicTermLastEnrolledIsMajor(String academicTermLastEnrolledIsMajor) {
		AcademicTermLastEnrolledIsMajor = academicTermLastEnrolledIsMajor;
	}

	public String getAcademicYearLastEnrolled() {
		return AcademicYearLastEnrolled;
	}

	public void setAcademicYearLastEnrolled(String academicYearLastEnrolled) {
		AcademicYearLastEnrolled = academicYearLastEnrolled;
	}

	public Double getACT() {
		return ACT;
	}

	public void setACT(Double aCT) {
		ACT = aCT;
	}

	public Double getACTEnglish() {
		return ACTEnglish;
	}

	public void setACTEnglish(Double aCTEnglish) {
		ACTEnglish = aCTEnglish;
	}

	public Double getACTMath() {
		return ACTMath;
	}

	public void setACTMath(Double aCTMath) {
		ACTMath = aCTMath;
	}

	public Double getACTReading() {
		return ACTReading;
	}

	public void setACTReading(Double aCTReading) {
		ACTReading = aCTReading;
	}

	public Double getACTScience() {
		return ACTScience;
	}

	public void setACTScience(Double aCTScience) {
		ACTScience = aCTScience;
	}

	public Double getActiveHoldsAcademicCurrent() {
		return ActiveHoldsAcademicCurrent;
	}

	public void setActiveHoldsAcademicCurrent(Double activeHoldsAcademicCurrent) {
		ActiveHoldsAcademicCurrent = activeHoldsAcademicCurrent;
	}

	public Double getActiveHoldsAdministrativeCurrent() {
		return ActiveHoldsAdministrativeCurrent;
	}

	public void setActiveHoldsAdministrativeCurrent(Double activeHoldsAdministrativeCurrent) {
		ActiveHoldsAdministrativeCurrent = activeHoldsAdministrativeCurrent;
	}

	public Double getActiveHoldsFinancialCurrent() {
		return ActiveHoldsFinancialCurrent;
	}

	public void setActiveHoldsFinancialCurrent(Double activeHoldsFinancialCurrent) {
		ActiveHoldsFinancialCurrent = activeHoldsFinancialCurrent;
	}

	public Integer getAgeCurrent() {
		return AgeCurrent;
	}

	public void setAgeCurrent(Integer ageCurrent) {
		AgeCurrent = ageCurrent;
	}

	public String getCohortAcadTermGRS() {
		return CohortAcadTermGRS;
	}

	public void setCohortAcadTermGRS(String cohortAcadTermGRS) {
		CohortAcadTermGRS = cohortAcadTermGRS;
	}

	public String getCohortAcadTermNameGRS() {
		return CohortAcadTermNameGRS;
	}

	public void setCohortAcadTermNameGRS(String cohortAcadTermNameGRS) {
		CohortAcadTermNameGRS = cohortAcadTermNameGRS;
	}

	public String getCohortAcadTermIdGRS() {
		return CohortAcadTermIdGRS;
	}

	public void setCohortAcadTermIdGRS(String cohortAcadTermIdGRS) {
		CohortAcadTermIdGRS = cohortAcadTermIdGRS;
	}

	public String getCohortAcadYearGRS() {
		return CohortAcadYearGRS;
	}

	public void setCohortAcadYearGRS(String cohortAcadYearGRS) {
		CohortAcadYearGRS = cohortAcadYearGRS;
	}

	public String getCountryOfOriginCode() {
		return CountryOfOriginCode;
	}

	public void setCountryOfOriginCode(String countryOfOriginCode) {
		CountryOfOriginCode = countryOfOriginCode;
	}

	public String getCountryOfOriginName() {
		return CountryOfOriginName;
	}

	public void setCountryOfOriginName(String countryOfOriginName) {
		CountryOfOriginName = countryOfOriginName;
	}

	public String getCountyOfOriginCode() {
		return CountyOfOriginCode;
	}

	public void setCountyOfOriginCode(String countyOfOriginCode) {
		CountyOfOriginCode = countyOfOriginCode;
	}

	public String getCountyOfOriginName() {
		return CountyOfOriginName;
	}

	public void setCountyOfOriginName(String countyOfOriginName) {
		CountyOfOriginName = countyOfOriginName;
	}

	public String getClassificationIDCurrent() {
		return ClassificationIDCurrent;
	}

	public void setClassificationIDCurrent(String classificationIDCurrent) {
		ClassificationIDCurrent = classificationIDCurrent;
	}

	public String getClassificationCurrent() {
		return ClassificationCurrent;
	}

	public void setClassificationCurrent(String classificationCurrent) {
		ClassificationCurrent = classificationCurrent;
	}

	public String getEthnicity() {
		return Ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		Ethnicity = ethnicity;
	}

	public String getFirstTimeGradStudentAcadTerm() {
		return FirstTimeGradStudentAcadTerm;
	}

	public void setFirstTimeGradStudentAcadTerm(String firstTimeGradStudentAcadTerm) {
		FirstTimeGradStudentAcadTerm = firstTimeGradStudentAcadTerm;
	}

	public String getFirstTimeGradStudentAcadTermIsMajor() {
		return FirstTimeGradStudentAcadTermIsMajor;
	}

	public void setFirstTimeGradStudentAcadTermIsMajor(String firstTimeGradStudentAcadTermIsMajor) {
		FirstTimeGradStudentAcadTermIsMajor = firstTimeGradStudentAcadTermIsMajor;
	}

	public String getFirstTimeGradStudentAcadTermID() {
		return FirstTimeGradStudentAcadTermID;
	}

	public void setFirstTimeGradStudentAcadTermID(String firstTimeGradStudentAcadTermID) {
		FirstTimeGradStudentAcadTermID = firstTimeGradStudentAcadTermID;
	}

	public String getFirstTimeGradStudentAcadTermName() {
		return FirstTimeGradStudentAcadTermName;
	}

	public void setFirstTimeGradStudentAcadTermName(String firstTimeGradStudentAcadTermName) {
		FirstTimeGradStudentAcadTermName = firstTimeGradStudentAcadTermName;
	}

	public String getFirstTimeGradStudentAcadYear() {
		return FirstTimeGradStudentAcadYear;
	}

	public void setFirstTimeGradStudentAcadYear(String firstTimeGradStudentAcadYear) {
		FirstTimeGradStudentAcadYear = firstTimeGradStudentAcadYear;
	}

	public String getFirstTimeTransferAcadTerm() {
		return FirstTimeTransferAcadTerm;
	}

	public void setFirstTimeTransferAcadTerm(String firstTimeTransferAcadTerm) {
		FirstTimeTransferAcadTerm = firstTimeTransferAcadTerm;
	}

	public String getFirstTimeTransferAcadTermName() {
		return FirstTimeTransferAcadTermName;
	}

	public void setFirstTimeTransferAcadTermName(String firstTimeTransferAcadTermName) {
		FirstTimeTransferAcadTermName = firstTimeTransferAcadTermName;
	}

	public String getFirstTimeTransferAcadTermIsMajor() {
		return FirstTimeTransferAcadTermIsMajor;
	}

	public void setFirstTimeTransferAcadTermIsMajor(String firstTimeTransferAcadTermIsMajor) {
		FirstTimeTransferAcadTermIsMajor = firstTimeTransferAcadTermIsMajor;
	}

	public String getFirstTimeTransferAcadTermID() {
		return FirstTimeTransferAcadTermID;
	}

	public void setFirstTimeTransferAcadTermID(String firstTimeTransferAcadTermID) {
		FirstTimeTransferAcadTermID = firstTimeTransferAcadTermID;
	}

	public String getFirstTimeTransferAcadYear() {
		return FirstTimeTransferAcadYear;
	}

	public void setFirstTimeTransferAcadYear(String firstTimeTransferAcadYear) {
		FirstTimeTransferAcadYear = firstTimeTransferAcadYear;
	}

	public String getFirstTimeUGDegreeSeekingAcadTerm() {
		return FirstTimeUGDegreeSeekingAcadTerm;
	}

	public void setFirstTimeUGDegreeSeekingAcadTerm(String firstTimeUGDegreeSeekingAcadTerm) {
		FirstTimeUGDegreeSeekingAcadTerm = firstTimeUGDegreeSeekingAcadTerm;
	}

	public String getFirstTimeUGDegreeSeekingAcadTermName() {
		return FirstTimeUGDegreeSeekingAcadTermName;
	}

	public void setFirstTimeUGDegreeSeekingAcadTermName(String firstTimeUGDegreeSeekingAcadTermName) {
		FirstTimeUGDegreeSeekingAcadTermName = firstTimeUGDegreeSeekingAcadTermName;
	}

	public String getFirstTimeUGDegreeSeekingAcadTermIsMajor() {
		return FirstTimeUGDegreeSeekingAcadTermIsMajor;
	}

	public void setFirstTimeUGDegreeSeekingAcadTermIsMajor(String firstTimeUGDegreeSeekingAcadTermIsMajor) {
		FirstTimeUGDegreeSeekingAcadTermIsMajor = firstTimeUGDegreeSeekingAcadTermIsMajor;
	}

	public String getFirstTimeUGDegreeSeekingAcadTermID() {
		return FirstTimeUGDegreeSeekingAcadTermID;
	}

	public void setFirstTimeUGDegreeSeekingAcadTermID(String firstTimeUGDegreeSeekingAcadTermID) {
		FirstTimeUGDegreeSeekingAcadTermID = firstTimeUGDegreeSeekingAcadTermID;
	}

	public String getFirstTimeUGDegreeSeekingAcadYear() {
		return FirstTimeUGDegreeSeekingAcadYear;
	}

	public void setFirstTimeUGDegreeSeekingAcadYear(String firstTimeUGDegreeSeekingAcadYear) {
		FirstTimeUGDegreeSeekingAcadYear = firstTimeUGDegreeSeekingAcadYear;
	}

	public String getGenderIdentityCurrent() {
		return GenderIdentityCurrent;
	}

	public void setGenderIdentityCurrent(String genderIdentityCurrent) {
		GenderIdentityCurrent = genderIdentityCurrent;
	}

	public String getGenderAtBirth() {
		return GenderAtBirth;
	}

	public void setGenderAtBirth(String genderAtBirth) {
		GenderAtBirth = genderAtBirth;
	}

	public String getHighSchoolShortDescription() {
		return HighSchoolShortDescription;
	}

	public void setHighSchoolShortDescription(String highSchoolShortDescription) {
		HighSchoolShortDescription = highSchoolShortDescription;
	}

	public String getHighSchoolID() {
		return HighSchoolID;
	}

	public void setHighSchoolID(String highSchoolID) {
		HighSchoolID = highSchoolID;
	}

	public String getHighSchool() {
		return HighSchool;
	}

	public void setHighSchool(String highSchool) {
		HighSchool = highSchool;
	}

	public Double getHighSchoolIndex() {
		return HighSchoolIndex;
	}

	public void setHighSchoolIndex(Double highSchoolIndex) {
		HighSchoolIndex = highSchoolIndex;
	}

	public Double getHighSchoolGPA() {
		return HighSchoolGPA;
	}

	public void setHighSchoolGPA(Double highSchoolGPA) {
		HighSchoolGPA = highSchoolGPA;
	}

	public Double getHighestSATMathOrEquivalentACT() {
		return HighestSATMathOrEquivalentACT;
	}

	public void setHighestSATMathOrEquivalentACT(Double highestSATMathOrEquivalentACT) {
		HighestSATMathOrEquivalentACT = highestSATMathOrEquivalentACT;
	}

	public Double getHighestSATOrEquivalentACT() {
		return HighestSATOrEquivalentACT;
	}

	public void setHighestSATOrEquivalentACT(Double highestSATOrEquivalentACT) {
		HighestSATOrEquivalentACT = highestSATOrEquivalentACT;
	}

	public Double getHighestSATReadingOrEquivalentACT() {
		return HighestSATReadingOrEquivalentACT;
	}

	public void setHighestSATReadingOrEquivalentACT(Double highestSATReadingOrEquivalentACT) {
		HighestSATReadingOrEquivalentACT = highestSATReadingOrEquivalentACT;
	}

	public Double getHighestSATWritingOrEquivalentACT() {
		return HighestSATWritingOrEquivalentACT;
	}

	public void setHighestSATWritingOrEquivalentACT(Double highestSATWritingOrEquivalentACT) {
		HighestSATWritingOrEquivalentACT = highestSATWritingOrEquivalentACT;
	}

	public String getIsTransferFirstTime() {
		return IsTransferFirstTime;
	}

	public void setIsTransferFirstTime(String isTransferFirstTime) {
		IsTransferFirstTime = isTransferFirstTime;
	}

	public String getResidencyCurrent() {
		return ResidencyCurrent;
	}

	public void setResidencyCurrent(String residencyCurrent) {
		ResidencyCurrent = residencyCurrent;
	}

	public String getResidencyStatusCurrent() {
		return ResidencyStatusCurrent;
	}

	public void setResidencyStatusCurrent(String residencyStatusCurrent) {
		ResidencyStatusCurrent = residencyStatusCurrent;
	}

	public Double getSAT() {
		return SAT;
	}

	public void setSAT(Double sAT) {
		SAT = sAT;
	}

	public Double getSATMath() {
		return SATMath;
	}

	public void setSATMath(Double sATMath) {
		SATMath = sATMath;
	}

	public Double getSATMax() {
		return SATMax;
	}

	public void setSATMax(Double sATMax) {
		SATMax = sATMax;
	}

	public Double getSATVerbal() {
		return SATVerbal;
	}

	public void setSATVerbal(Double sATVerbal) {
		SATVerbal = sATVerbal;
	}

	public Double getSATWriting() {
		return SATWriting;
	}

	public void setSATWriting(Double sATWriting) {
		SATWriting = sATWriting;
	}

	public String getStateOfOriginCurrent() {
		return StateOfOriginCurrent;
	}

	public void setStateOfOriginCurrent(String stateOfOriginCurrent) {
		StateOfOriginCurrent = stateOfOriginCurrent;
	}

	public String getIsFirstTime() {
		return IsFirstTime;
	}

	public void setIsFirstTime(String isFirstTime) {
		IsFirstTime = isFirstTime;
	}

	public String getZipOfOriginCurrent() {
		return ZipOfOriginCurrent;
	}

	public void setZipOfOriginCurrent(String zipOfOriginCurrent) {
		ZipOfOriginCurrent = zipOfOriginCurrent;
	}

	public String getIsAthleteCurrent() {
		return IsAthleteCurrent;
	}

	public void setIsAthleteCurrent(String isAthleteCurrent) {
		IsAthleteCurrent = isAthleteCurrent;
	}

	public Date getLMSLastLogin() {
		return LMSLastLogin;
	}

	public void setLMSLastLogin(Date lMSLastLogin) {
		LMSLastLogin = lMSLastLogin;
	}

	public Double getNumberOfMajorTermsEnrolledUG() {
		return NumberOfMajorTermsEnrolledUG;
	}

	public void setNumberOfMajorTermsEnrolledUG(Double numberOfMajorTermsEnrolledUG) {
		NumberOfMajorTermsEnrolledUG = numberOfMajorTermsEnrolledUG;
	}

	public Double getNumberOfTermsEnrolledUG() {
		return NumberOfTermsEnrolledUG;
	}

	public void setNumberOfTermsEnrolledUG(Double numberOfTermsEnrolledUG) {
		NumberOfTermsEnrolledUG = numberOfTermsEnrolledUG;
	}

	public Double getNumberOfMajorTermsEnrolledGRAD() {
		return NumberOfMajorTermsEnrolledGRAD;
	}

	public void setNumberOfMajorTermsEnrolledGRAD(Double numberOfMajorTermsEnrolledGRAD) {
		NumberOfMajorTermsEnrolledGRAD = numberOfMajorTermsEnrolledGRAD;
	}

	public Double getNumberOfTermsEnrolledGRAD() {
		return NumberOfTermsEnrolledGRAD;
	}

	public void setNumberOfTermsEnrolledGRAD(Double numberOfTermsEnrolledGRAD) {
		NumberOfTermsEnrolledGRAD = numberOfTermsEnrolledGRAD;
	}

	public Double getSuccessScoreVACCurrent() {
		return SuccessScoreVACCurrent;
	}

	public void setSuccessScoreVACCurrent(Double successScoreVACCurrent) {
		SuccessScoreVACCurrent = successScoreVACCurrent;
	}

	public String getSuccessScoreVACCurrentClusterID() {
		return SuccessScoreVACCurrentClusterID;
	}

	public void setSuccessScoreVACCurrentClusterID(String successScoreVACCurrentClusterID) {
		SuccessScoreVACCurrentClusterID = successScoreVACCurrentClusterID;
	}

	public Double getSuccessScoreVACCurrentPercentile() {
		return SuccessScoreVACCurrentPercentile;
	}

	public void setSuccessScoreVACCurrentPercentile(Double successScoreVACCurrentPercentile) {
		SuccessScoreVACCurrentPercentile = successScoreVACCurrentPercentile;
	}

	public Double getSuccessScoreVACFirstTerm() {
		return SuccessScoreVACFirstTerm;
	}

	public void setSuccessScoreVACFirstTerm(Double successScoreVACFirstTerm) {
		SuccessScoreVACFirstTerm = successScoreVACFirstTerm;
	}

	public String getSuccessScoreVACFirstTermClusterID() {
		return SuccessScoreVACFirstTermClusterID;
	}

	public void setSuccessScoreVACFirstTermClusterID(String successScoreVACFirstTermClusterID) {
		SuccessScoreVACFirstTermClusterID = successScoreVACFirstTermClusterID;
	}

	public Double getSuccessScoreVACFirstTermPercentile() {
		return SuccessScoreVACFirstTermPercentile;
	}

	public void setSuccessScoreVACFirstTermPercentile(Double successScoreVACFirstTermPercentile) {
		SuccessScoreVACFirstTermPercentile = successScoreVACFirstTermPercentile;
	}

	public Double getHighSchoolGPACapped() {
		return HighSchoolGPACapped;
	}

	public void setHighSchoolGPACapped(Double highSchoolGPACapped) {
		HighSchoolGPACapped = highSchoolGPACapped;
	}

	public Date getGRADGraduationEffectiveDate() {
		return GRADGraduationEffectiveDate;
	}

	public void setGRADGraduationEffectiveDate(Date gRADGraduationEffectiveDate) {
		GRADGraduationEffectiveDate = gRADGraduationEffectiveDate;
	}

	public Date getUGGraduationEffectiveDate() {
		return UGGraduationEffectiveDate;
	}

	public void setUGGraduationEffectiveDate(Date uGGraduationEffectiveDate) {
		UGGraduationEffectiveDate = uGGraduationEffectiveDate;
	}

	public String getPrimaryCollegeFirst() {
		return PrimaryCollegeFirst;
	}

	public void setPrimaryCollegeFirst(String primaryCollegeFirst) {
		PrimaryCollegeFirst = primaryCollegeFirst;
	}

	public String getPrimaryCollegeCurrent() {
		return PrimaryCollegeCurrent;
	}

	public void setPrimaryCollegeCurrent(String primaryCollegeCurrent) {
		PrimaryCollegeCurrent = primaryCollegeCurrent;
	}

	public String getHasPellCurrent() {
		return HasPellCurrent;
	}

	public void setHasPellCurrent(String hasPellCurrent) {
		HasPellCurrent = hasPellCurrent;
	}

	public String getHasPellEver() {
		return HasPellEver;
	}

	public void setHasPellEver(String hasPellEver) {
		HasPellEver = hasPellEver;
	}

	public String getLatestPellAwardedTerm() {
		return LatestPellAwardedTerm;
	}

	public void setLatestPellAwardedTerm(String latestPellAwardedTerm) {
		LatestPellAwardedTerm = latestPellAwardedTerm;
	}

	public String getLatestPellAwardedTermID() {
		return LatestPellAwardedTermID;
	}

	public void setLatestPellAwardedTermID(String latestPellAwardedTermID) {
		LatestPellAwardedTermID = latestPellAwardedTermID;
	}

	public String getLatestPellAwardedYear() {
		return LatestPellAwardedYear;
	}

	public void setLatestPellAwardedYear(String latestPellAwardedYear) {
		LatestPellAwardedYear = latestPellAwardedYear;
	}

	public String getLatestPellAwardedTermName() {
		return LatestPellAwardedTermName;
	}

	public void setLatestPellAwardedTermName(String latestPellAwardedTermName) {
		LatestPellAwardedTermName = latestPellAwardedTermName;
	}

	public String getLatestPellAwardedTermNameIsMajor() {
		return LatestPellAwardedTermNameIsMajor;
	}

	public void setLatestPellAwardedTermNameIsMajor(String latestPellAwardedTermNameIsMajor) {
		LatestPellAwardedTermNameIsMajor = latestPellAwardedTermNameIsMajor;
	}

	public Double getNumberOfPellTerms() {
		return NumberOfPellTerms;
	}

	public void setNumberOfPellTerms(Double numberOfPellTerms) {
		NumberOfPellTerms = numberOfPellTerms;
	}

	public String getIsFreshmanSummerProgram() {
		return IsFreshmanSummerProgram;
	}

	public void setIsFreshmanSummerProgram(String isFreshmanSummerProgram) {
		IsFreshmanSummerProgram = isFreshmanSummerProgram;
	}

	public String getFirstTimeOtherStudentAcadTerm() {
		return FirstTimeOtherStudentAcadTerm;
	}

	public void setFirstTimeOtherStudentAcadTerm(String firstTimeOtherStudentAcadTerm) {
		FirstTimeOtherStudentAcadTerm = firstTimeOtherStudentAcadTerm;
	}

	public String getFirstTimeOtherStudentAcadTermIsMajor() {
		return FirstTimeOtherStudentAcadTermIsMajor;
	}

	public void setFirstTimeOtherStudentAcadTermIsMajor(String firstTimeOtherStudentAcadTermIsMajor) {
		FirstTimeOtherStudentAcadTermIsMajor = firstTimeOtherStudentAcadTermIsMajor;
	}

	public String getFirstTimeOtherStudentAcadTermID() {
		return FirstTimeOtherStudentAcadTermID;
	}

	public void setFirstTimeOtherStudentAcadTermID(String firstTimeOtherStudentAcadTermID) {
		FirstTimeOtherStudentAcadTermID = firstTimeOtherStudentAcadTermID;
	}

	public String getFirstTimeOtherStudentAcadTermName() {
		return FirstTimeOtherStudentAcadTermName;
	}

	public void setFirstTimeOtherStudentAcadTermName(String firstTimeOtherStudentAcadTermName) {
		FirstTimeOtherStudentAcadTermName = firstTimeOtherStudentAcadTermName;
	}

	public String getFirstTimeOtherStudentAcadYear() {
		return FirstTimeOtherStudentAcadYear;
	}

	public void setFirstTimeOtherStudentAcadYear(String firstTimeOtherStudentAcadYear) {
		FirstTimeOtherStudentAcadYear = firstTimeOtherStudentAcadYear;
	}

}
