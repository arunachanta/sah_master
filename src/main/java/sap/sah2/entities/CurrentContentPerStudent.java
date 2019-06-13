package sap.sah2.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.sah.foundation.SAHBean;

@Entity
@Table(name = "\"sah.curatedViews::materialized.CurrentContentPerStudent\"")
public class CurrentContentPerStudent implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//demographics
	@Id
	@Column(name = "\"StudentID\"")
	private String StudentID;

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
	
//enrollment
	@Column(name = "\"EnrollmentStudentID\"")
	private String EnrollmentStudentID;
	
	@Column(name = "\"EnrollmentAcademicTerm\"")
	private String EnrollmentAcademicTerm;

	@Column(name = "\"ClassID\"")
	private String ClassID;

	@Column(name = "\"SectionID\"")
	private String SectionID;
	
	@Column(name = "\"EnrollmentAcademicTermID\"")
	private String EnrollmentAcademicTermID;

	@Column(name = "\"EnrollmentAcademicTermIsMajor\"") 
	private String EnrollmentAcademicTermIsMajor;

	@Column(name = "\"EnrollmentAcademicTermName\"") 
	private String EnrollmentAcademicTermName;

	@Column(name = "\"EnrollmentAcademicYear\"") 
	private String EnrollmentAcademicYear;

	@Column(name = "\"EnrollmentStatusEffectiveDate\"") 
	private Date EnrollmentStatusEffectiveDate;

	@Column(name = "\"Class\"") 
	private String Class;

	@Column(name = "\"ClassCollege\"") 
	private String ClassCollege;

	@Column(name = "\"ClassCollegeShort\"") 
	private String ClassCollegeShort;

	@Column(name = "\"ClassDepartment\"") 
	private String ClassDepartment;

	@Column(name = "\"ClassDepartmentID\"") 
	private String ClassDepartmentID;

	@Column(name = "\"ClassPriorTermsEnrolledCount\"") 
	private Double ClassPriorTermsEnrolledCount;

	@Column(name = "\"ClassPriorTermsGradedCount\"") 
	private Double ClassPriorTermsGradedCount;

	@Column(name = "\"ClassSchoolDivision\"") 
	private String ClassSchoolDivision;

	@Column(name = "\"ClassSchoolDivisionID\"") 
	private String ClassSchoolDivisionID;

	@Column(name = "\"ClassSectionID\"") 
	private String ClassSectionID;

	@Column(name = "\"ClassTermsEnrolledTotalCount\"") 
	private Double ClassTermsEnrolledTotalCount;

	@Column(name = "\"ClassTermsGradedTotalCount\"") 
	private Double ClassTermsGradedTotalCount;

	@Column(name = "\"DegreeProgramType\"") 
	private String DegreeProgramType;

	@Column(name = "\"Enrollment\"") 
	private Integer Enrollment;

	@Column(name = "\"Grade\"") 
	private String Grade;

	@Column(name = "\"GradeValue\"") 
	private Double GradeValue;

	@Column(name = "\"GradeValue4PointScale\"") 
	private Double GradeValue4PointScale;

	@Column(name = "\"GradeValue4PointScaleHighest\"") 
	private Double GradeValue4PointScaleHighest;

	@Column(name = "\"GrossRevenue\"") 
	private Integer GrossRevenue;

	@Column(name = "\"HighestGradeEarned\"") 
	private String HighestGradeEarned;

	@Column(name = "\"HighestGradeEarnedAcademicTerm\"") 
	private String HighestGradeEarnedAcademicTerm;

	@Column(name = "\"HighestGradeEarnedValue\"") 
	private Double HighestGradeEarnedValue;

	@Column(name = "\"IsCore\"") 
	private String IsCore;

	@Column(name = "\"IsCrossListApproved\"") 
	private String IsCrossListApproved;

	@Column(name = "\"IsDF\"") 
	private String IsDF;

	@Column(name = "\"IsDFW\"") 
	private String IsDFW;

	@Column(name = "\"IsHighestGradeEarned\"") 
	private String IsHighestGradeEarned;

	@Column(name = "\"IsNotPassed\"") 
	private String IsNotPassed;

	@Column(name = "\"IsOnlineCourse\"") 
	private String IsOnlineCourse;

	@Column(name = "\"IsRetake\"") 
	private String IsRetake;

	@Column(name = "\"PrimaryDeliveryMode\"") 
	private String PrimaryDeliveryMode;

	@Column(name = "\"PrimaryDeliveryModeID\"") 
	private String PrimaryDeliveryModeID;

	@Column(name = "\"PrimaryInstructorAcademicAppointmentSchoolDivision\"") 
	private String PrimaryInstructorAcademicAppointmentSchoolDivision;

	@Column(name = "\"PrimaryInstructorDepartment\"") 
	private String PrimaryInstructorDepartment;

	@Column(name = "\"PrimaryInstructorDepartmentID\"") 
	private String PrimaryInstructorDepartmentID;

	@Column(name = "\"PrimaryInstructorFirstName\"") 
	private String PrimaryInstructorFirstName;

	@Column(name = "\"PrimaryInstructorID\"") 
	private String PrimaryInstructorID;

	@Column(name = "\"PrimaryInstructorLastName\"") 
	private String PrimaryInstructorLastName;

	@Column(name = "\"PrimaryInstructorRank\"") 
	private String PrimaryInstructorRank;

	@Column(name = "\"PrimaryInstructorStatus\"") 
	private String PrimaryInstructorStatus;

	@Column(name = "\"PrimaryInstructorTitleSeries\"") 
	private String PrimaryInstructorTitleSeries;

	@Column(name = "\"PrimaryStudentCollege\"") 
	private String PrimaryStudentCollege;

	@Column(name = "\"PrimaryStudentDegree\"") 
	private String PrimaryStudentDegree;

	@Column(name = "\"PrimaryStudentDegreeName\"") 
	private String PrimaryStudentDegreeName;

	@Column(name = "\"PrimaryStudentDepartment\"") 
	private String PrimaryStudentDepartment;

	@Column(name = "\"PrimaryStudentDepartmentID\"") 
	private String PrimaryStudentDepartmentID;

	@Column(name = "\"PrimaryStudentMajor\"") 
	private String PrimaryStudentMajor;

	@Column(name = "\"PrimaryStudentMajorID\"") 
	private String PrimaryStudentMajorID;

	@Column(name = "\"PrimaryStudentMajorName\"") 
	private String PrimaryStudentMajorName;

	@Column(name = "\"PrimaryStudentSchoolDivision\"") 
	private String PrimaryStudentSchoolDivision;

	@Column(name = "\"SectionBeginDate\"") 
	private Date SectionBeginDate;

	@Column(name = "\"SectionEndDate\"") 
	private Date SectionEndDate;

	@Column(name = "\"SectionTitle\"") 
	private String SectionTitle;

	@Column(name = "\"UnitsCompleted\"") 
	private Double UnitsCompleted;

	@Column(name = "\"UnitsAttempted\"") 
	private Double UnitsAttempted;

	@Column(name = "\"UnitsPassed\"") 
	private Double UnitsPassed;

	@Column(name = "\"Waitlisted\"") 
	private String Waitlisted;

	@Column(name = "\"WithdrawalWeek\"") 
	private Integer WithdrawalWeek;

	@Column(name = "\"ClassLevel\"") 
	private String ClassLevel;

	@Column(name = "\"GradeScaleID\"") 
	private String GradeScaleID;

	@Column(name = "\"GradeScaleDescription\"") 
	private String GradeScaleDescription;

	@Column(name = "\"IsGenEd\"") 
	private String IsGenEd;

	@Column(name = "\"PrimaryInstructorFullPartTime\"") 
	private String PrimaryInstructorFullPartTime;

	@Column(name = "\"PrimaryInstructorPosition\"") 
	private String PrimaryInstructorPosition;
	
//majorsMinors
//	@Column(name = "\"MajorMinorsStudentID\"" )
//	private String MajorsMinorsStudentID;

	@Column(name = "\"MajorsMinorsAcademicTerm\"" )
	private String MajorsMinorsAcademicTerm;

	/*@Column(name = "\"MajorsMinorsCategory\"" )
	private String MajorsMinorsCategory;*/

	@Column(name = "\"MajorsMinorsAcademicTermID\"" )
	private String MajorsMinorsAcademicTermID;

	@Column(name = "\"MajorsMinorsAcademicTermIsMajor\"" ) 
	private String MajorsMinorsAcademicTermIsMajor;

	@Column(name = "\"MajorsMinorsAcademicTermName\"" ) 
	private String MajorsMinorsAcademicTermName;

	@Column(name = "\"MajorsMinorsAcademicYear\"" ) 
	private String MajorsMinorsAcademicYear;

	@Column(name = "\"CensusDate\"" ) 
	private Date CensusDate;

	@Column(name = "\"PrimaryDegreeClassificationID\"" ) 
	private String PrimaryDegreeClassificationID;

	@Column(name = "\"PrimaryDegreeClassification\"" ) 
	private String PrimaryDegreeClassification;

	@Column(name = "\"PrimaryDegreeID\"" ) 
	private String PrimaryDegreeID;

	@Column(name = "\"PrimaryDegreeShortName\"" ) 
	private String PrimaryDegreeShortName;

	@Column(name = "\"PrimaryDegreeName\"" ) 
	private String PrimaryDegreeName;

	@Column(name = "\"PrimaryDegreeTypeID\"" ) 
	private String PrimaryDegreeTypeID;

	@Column(name = "\"PrimaryDegreeType\"" ) 
	private String PrimaryDegreeType;

	@Column(name = "\"PrimaryDegreePrimaryMajorDepartmentID\"" ) 
	private String PrimaryDegreePrimaryMajorDepartmentID;

	@Column(name = "\"PrimaryDegreePrimaryMajorDepartmentName\"" ) 
	private String PrimaryDegreePrimaryMajorDepartmentName;

	@Column(name = "\"PrimaryDegreePrimaryMajorID\"" ) 
	private String PrimaryDegreePrimaryMajorID;

	@Column(name = "\"PrimaryDegreePrimaryMajorShortName\"" ) 
	private String PrimaryDegreePrimaryMajorShortName;

	@Column(name = "\"PrimaryDegreePrimaryMajorName\"" ) 
	private String PrimaryDegreePrimaryMajorName;

	@Column(name = "\"PrimaryDegreePrimaryMajorSchoolDivisionID\"" ) 
	private String PrimaryDegreePrimaryMajorSchoolDivisionID;

	@Column(name = "\"PrimaryDegreePrimaryMajorSchoolDivisionName\"" ) 
	private String PrimaryDegreePrimaryMajorSchoolDivisionName;

	@Column(name = "\"PrimaryDegreePrimaryMinorID\"" ) 
	private String PrimaryDegreePrimaryMinorID;

	@Column(name = "\"PrimaryDegreePrimaryMinorShortName\"" ) 
	private String PrimaryDegreePrimaryMinorShortName;

	@Column(name = "\"PrimaryDegreePrimaryMinorName\"" ) 
	private String PrimaryDegreePrimaryMinorName;

	@Column(name = "\"PrimaryDegreeSecondaryMajorDepartmentID\"" ) 
	private String PrimaryDegreeSecondaryMajorDepartmentID;

	@Column(name = "\"PrimaryDegreeSecondaryMajorDepartmentName\"" ) 
	private String PrimaryDegreeSecondaryMajorDepartmentName;

	@Column(name = "\"PrimaryDegreeSecondaryMajorID\"" ) 
	private String PrimaryDegreeSecondaryMajorID;

	@Column(name = "\"PrimaryDegreeSecondaryMajorShortName\"" ) 
	private String PrimaryDegreeSecondaryMajorShortName;

	@Column(name = "\"PrimaryDegreeSecondaryMajorName\"" ) 
	private String PrimaryDegreeSecondaryMajorName;

	@Column(name = "\"PrimaryDegreeSecondaryMajorSchoolDivisionID\"" ) 
	private String PrimaryDegreeSecondaryMajorSchoolDivisionID;

	@Column(name = "\"PrimaryDegreeSecondaryMajorSchoolDivisionName\"" ) 
	private String PrimaryDegreeSecondaryMajorSchoolDivisionName;

	@Column(name = "\"PrimaryDegreeSecondaryMinorID\"" ) 
	private String PrimaryDegreeSecondaryMinorID;

	@Column(name = "\"PrimaryDegreeSecondaryMinorShortName\"" ) 
	private String PrimaryDegreeSecondaryMinorShortName;

	@Column(name = "\"PrimaryDegreeSecondaryMinorName\"" ) 
	private String PrimaryDegreeSecondaryMinorName;

	@Column(name = "\"SecondaryDegreeClassificationID\"" ) 
	private String SecondaryDegreeClassificationID;

	@Column(name = "\"SecondaryDegreeClassification\"" ) 
	private String SecondaryDegreeClassification;

	@Column(name = "\"SecondaryDegreeShortName\"" ) 
	private String SecondaryDegreeShortName;

	@Column(name = "\"SecondaryDegreeName\"" ) 
	private String SecondaryDegreeName;

	@Column(name = "\"SecondaryDegreeTypeID\"" ) 
	private String SecondaryDegreeTypeID;

	@Column(name = "\"SecondaryDegreeType\"" ) 
	private String SecondaryDegreeType;

	@Column(name = "\"SecondaryDegreePrimaryMajorDepartmentID\"" ) 
	private String SecondaryDegreePrimaryMajorDepartmentID;

	@Column(name = "\"SecondaryDegreePrimaryMajorDepartmentName\"" ) 
	private String SecondaryDegreePrimaryMajorDepartmentName;

	@Column(name = "\"SecondaryDegreePrimaryMajorID\"" ) 
	private String SecondaryDegreePrimaryMajorID;

	@Column(name = "\"SecondaryDegreePrimaryMajorShortName\"" ) 
	private String SecondaryDegreePrimaryMajorShortName;

	@Column(name = "\"SecondaryDegreePrimaryMajorName\"" ) 
	private String SecondaryDegreePrimaryMajorName;

	@Column(name = "\"SecondaryDegreePrimaryMajorSchoolDivisionID\"" ) 
	private String SecondaryDegreePrimaryMajorSchoolDivisionID;

	@Column(name = "\"SecondaryDegreePrimaryMajorSchoolDivisionName\"" ) 
	private String SecondaryDegreePrimaryMajorSchoolDivisionName;

	@Column(name = "\"SecondaryDegreePrimaryMinorID\"" ) 
	private String SecondaryDegreePrimaryMinorID;

	@Column(name = "\"SecondaryDegreePrimaryMinorShortName\"" ) 
	private String SecondaryDegreePrimaryMinorShortName;

	@Column(name = "\"SecondaryDegreePrimaryMinorName\"" ) 
	private String SecondaryDegreePrimaryMinorName;

	@Column(name = "\"SecondaryDegreeSecondaryMajorDepartmentID\"" ) 
	private String SecondaryDegreeSecondaryMajorDepartmentID;

	@Column(name = "\"SecondaryDegreeSecondaryMajorDepartmentName\"" ) 
	private String SecondaryDegreeSecondaryMajorDepartmentName;

	@Column(name = "\"SecondaryDegreeSecondaryMajorID\"" ) 
	private String SecondaryDegreeSecondaryMajorID;

	@Column(name = "\"SecondaryDegreeSecondaryMajorShortName\"" ) 
	private String SecondaryDegreeSecondaryMajorShortName;

	@Column(name = "\"SecondaryDegreeSecondaryMajorName\"" ) 
	private String SecondaryDegreeSecondaryMajorName;

	@Column(name = "\"SecondaryDegreeSecondaryMajorSchoolDivisionID\"" ) 
	private String SecondaryDegreeSecondaryMajorSchoolDivisionID;

	@Column(name = "\"SecondaryDegreeSecondaryMajorSchoolDivisionName\"" ) 
	private String SecondaryDegreeSecondaryMajorSchoolDivisionName;

	@Column(name = "\"SecondaryDegreeSecondaryMinorID\"" ) 
	private String SecondaryDegreeSecondaryMinorID;

	@Column(name = "\"SecondaryDegreeSecondaryMinorShortName\"" ) 
	private String SecondaryDegreeSecondaryMinorShortName;

	@Column(name = "\"SecondaryDegreeSecondaryMinorName\"" ) 
	private String SecondaryDegreeSecondaryMinorName;

	@Column(name = "\"MajorsMinorsRowNumber\"" ) 
	private Double MajorsMinorsRowNumber;

	@Column(name = "\"PrimaryDegreePrimaryMinorDepartmentID\"" ) 
	private String PrimaryDegreePrimaryMinorDepartmentID;

	@Column(name = "\"PrimaryDegreePrimaryMinorDepartmentName\"" ) 
	private String PrimaryDegreePrimaryMinorDepartmentName;

	@Column(name = "\"PrimaryDegreePrimaryMinorSchoolDivisionID\"" ) 
	private String PrimaryDegreePrimaryMinorSchoolDivisionID;

	@Column(name = "\"PrimaryDegreePrimaryMinorSchoolDivisionName\"" ) 
	private String PrimaryDegreePrimaryMinorSchoolDivisionName;

	@Column(name = "\"PrimaryDegreeSecondaryMinorDepartmentID\"" ) 
	private String PrimaryDegreeSecondaryMinorDepartmentID;

	@Column(name = "\"PrimaryDegreeSecondaryMinorDepartmentName\"" ) 
	private String PrimaryDegreeSecondaryMinorDepartmentName;

	@Column(name = "\"PrimaryDegreeSecondaryMinorSchoolDivisionID\"" ) 
	private String PrimaryDegreeSecondaryMinorSchoolDivisionID;

	@Column(name = "\"PrimaryDegreeSecondaryMinorSchoolDivisionName\"" ) 
	private String PrimaryDegreeSecondaryMinorSchoolDivisionName;

	@Column(name = "\"SecondaryDegreeID\"" ) 
	private String SecondaryDegreeID;

	@Column(name = "\"SecondaryDegreePrimaryMinorDepartmentID\"" ) 
	private String SecondaryDegreePrimaryMinorDepartmentID;

	@Column(name = "\"SecondaryDegreePrimaryMinorDepartmentName\"" ) 
	private String SecondaryDegreePrimaryMinorDepartmentName;

	@Column(name = "\"SecondaryDegreePrimaryMinorSchoolDivisionID\"" ) 
	private String SecondaryDegreePrimaryMinorSchoolDivisionID;

	@Column(name = "\"SecondaryDegreePrimaryMinorSchoolDivisionName\"" ) 
	private String SecondaryDegreePrimaryMinorSchoolDivisionName;

	@Column(name = "\"SecondaryDegreeSecondaryMinorDepartmentID\"" ) 
	private String SecondaryDegreeSecondaryMinorDepartmentID;

	@Column(name = "\"SecondaryDegreeSecondaryMinorDepartmentName\"" ) 
	private String SecondaryDegreeSecondaryMinorDepartmentName;

	@Column(name = "\"SecondaryDegreeSecondaryMinorSchoolDivisionID\"" ) 
	private String SecondaryDegreeSecondaryMinorSchoolDivisionID;

	@Column(name = "\"SecondaryDegreeSecondaryMinorSchoolDivisionName\"" ) 
	private String SecondaryDegreeSecondaryMinorSchoolDivisionName;
	
//majorsMinorsDetails
	@Column(name = "\"MajorsMinorsDetailsStudentID\"")
	private String MajorsMinorsDetailsStudentID;

	@Column(name = "\"MajorsMinorsDetailsAcademicTerm\"")
	private String MajorsMinorsDetailsAcademicTerm;

	@Column(name = "\"ProgramTypeChange\"")
	private String ProgramTypeChange;
	
	@Column(name = "\"ToProgramPriority\"")
	private String ToProgramPriority;

	@Column(name = "\"MajorsMinorsDetailsAcademicTermID\"")
	private String MajorsMinorsDetailsAcademicTermID;

	@Column(name = "\"MajorsMinorsDetailsAcademicTermIsMajor\"")
	private String MajorsMinorsDetailsAcademicTermIsMajor;

	@Column(name = "\"MajorsMinorsDetailsAcademicTermName\"")
	private String MajorsMinorsDetailsAcademicTermName;

	@Column(name = "\"MajorsMinorsDetailsAcademicYear\"")
	private Integer MajorsMinorsDetailsAcademicYear;

	@Column(name = "\"ActivityDate\"")
	private Date ActivityDate;

	@Column(name = "\"FromProgramID\"")
	private String FromProgramID;

	@Column(name = "\"FromProgramName\"")
	private String FromProgramName;

	@Column(name = "\"FromProgramShortName\"")
	private String FromProgramShortName;

	@Column(name = "\"FromProgramPriority\"")
	private String FromProgramPriority;

	@Column(name = "\"FromDegreeTypeID\"")
	private String FromDegreeTypeID;

	@Column(name = "\"FromProgramDepartmentID\"")
	private String FromProgramDepartmentID;

	@Column(name = "\"FromProgramDepartmentName\"")
	private String FromProgramDepartmentName;

	@Column(name = "\"FromProgramSchoolDivisionID\"")
	private String FromProgramSchoolDivisionID;

	@Column(name = "\"FromProgramSchoolDivisionName\"")
	private String FromProgramSchoolDivisionName;

	@Column(name = "\"FromProgramCipCode\"")
	private String FromProgramCipCode;

	@Column(name = "\"ToProgramID\"")
	private String ToProgramID;

	@Column(name = "\"ToProgramName\"")
	private String ToProgramName;

	@Column(name = "\"ToProgramShortName\"")
	private String ToProgramShortName;

	@Column(name = "\"ToDegreeTypeID\"")
	private String ToDegreeTypeID;

	@Column(name = "\"ToProgramDepartmentID\"")
	private String ToProgramDepartmentID;

	@Column(name = "\"ToProgramDepartmentName\"")
	private String ToProgramDepartmentName;

	@Column(name = "\"ToProgramSchoolDivisionID\"")
	private String ToProgramSchoolDivisionID;

	@Column(name = "\"ToProgramSchoolDivisionName\"")
	private String ToProgramSchoolDivisionName;

	@Column(name = "\"ToProgramCipCode\"")
	private String ToProgramCipCode;

	@Column(name = "\"ActivityCode\"")
	private String ActivityCode;

	@Column(name = "\"ActivityID\"")
	private String ActivityID;

	@Column(name = "\"ActivityStatus\"")
	private String ActivityStatus;
	
//retention
	@Column(name = "\"RetentionStudentID\"")
	private String RetentionStudentID;

	@Column(name = "\"RetentionCohortGroup\"")
	private String RetentionCohortGroup;

	@Column(name = "\"RetentionCohortTerm\"")
	private String RetentionCohortTerm;

	@Column(name = "\"RetentionCohortCategory\"")
	private String RetentionCohortCategory;

	@Column(name = "\"RetentionCohortTermID\"")
	private String RetentionCohortTermID;

	@Column(name = "\"RetentionCohortTermName\"")
	private String RetentionCohortTermName;

//	@Column(name = "\"RetentionCohortTermIsMajor\"")
//	private String RetentionCohortTermIsMajor;

	@Column(name = "\"RetentionCohortYear\"")
	private String RetentionCohortYear;

	@Column(name = "\"HasProgressed1Term\"")
	private String HasProgressed1Term;

	@Column(name = "\"HasProgressed2Terms\"")
	private String HasProgressed2Terms;

	@Column(name = "\"HasProgressed3Terms\"")
	private String HasProgressed3Terms;

	@Column(name = "\"ProgressedAllTermsCount\"")
	private Integer ProgressedAllTermsCount;

	@Column(name = "\"HasProgressed1Year\"")
	private String HasProgressed1Year;

	@Column(name = "\"HasProgressed2Years\"")
	private String HasProgressed2Years;

	@Column(name = "\"HasProgressed3Years\"")
	private String HasProgressed3Years;

	@Column(name = "\"HasProgressed4Years\"")
	private String HasProgressed4Years;

	@Column(name = "\"IsGraduated3Years\"")
	private String IsGraduated3Years;

	@Column(name = "\"IsGraduated4Years\"")
	private String IsGraduated4Years;

	@Column(name = "\"IsGraduated5Years\"")
	private String IsGraduated5Years;

	@Column(name = "\"IsGraduated6Years\"")
	private String IsGraduated6Years;

	@Column(name = "\"IsGraduated7Years\"")
	private String IsGraduated7Years;

	@Column(name = "\"IsRetained1Term\"")
	private String IsRetained1Term;

	@Column(name = "\"IsRetained2Terms\"")
	private String IsRetained2Terms;

	@Column(name = "\"ProgressedMajorTermsCount\"")
	private Integer ProgressedMajorTermsCount;

	@Column(name = "\"RetainedTermCount\"")
	private Integer RetainedTermCount;

	@Column(name = "\"IsRetained1Year\"")
	private String IsRetained1Year;

	@Column(name = "\"IsRetained2Years\"")
	private String IsRetained2Years;

	@Column(name = "\"IsRetained3Years\"")
	private String IsRetained3Years;

	@Column(name = "\"IsRetained4Years\"")
	private String IsRetained4Years;

	@Column(name = "\"IsRetained5Years\"")
	private String IsRetained5Years;
	
//retentionDetails
	
	@Column(name = "\"RetentionDetailsStudentID\"")
	private String RetentionDetailsStudentID;

	@Column(name = "\"RetentionDetailsCohortGroup\"")
	private String RetentionDetailsCohortGroup;

	@Column(name = "\"RetentionDetailsCohortTerm\"")
	private String RetentionDetailsCohortTerm;
	
	@Column(name = "\"RetentionDetailsAcademicTerm\"")
	private String RetentionDetailsAcademicTerm;

	@Column(name = "\"RetentionDetailsCohortCategory\"")
	private String RetentionDetailsCohortCategory;
	
	@Column(name = "\"RetentionDetailsCohortTermID\"")
	private String RetentionDetailsCohortTermID;

	@Column(name = "\"RetentionDetailsCohortTermIsMajor\"")
	private String RetentionDetailsCohortTermIsMajor;

	@Column(name = "\"RetentionDetailsCohortTermName\"")
	private String RetentionDetailsCohortTermName;

	@Column(name = "\"RetentionDetailsCohortYear\"")
	private String RetentionDetailsCohortYear;

	@Column(name = "\"RetentionDetailsAcademicTermID\"")
	private String RetentionDetailsAcademicTermID;

	@Column(name = "\"RetentionDetailsAcademicTermIsMajor\"")
	private String RetentionDetailsAcademicTermIsMajor;

	@Column(name = "\"RetentionDetailsAcademicTermName\"")
	private String RetentionDetailsAcademicTermName;

	@Column(name = "\"RetentionDetailsAcademicYear\"")
	private String RetentionDetailsAcademicYear;

	@Column(name = "\"ClassesEnrolled\"")
	private Integer ClassesEnrolled;

	@Column(name = "\"UnitsEnrolled\"")
	private Double UnitsEnrolled;

	@Column(name = "\"CumUnits\"")
	private Double CumUnits;

	@Column(name = "\"EnrolledTermCount\"")
	private Double EnrolledTermCount;

	@Column(name = "\"IsEnrolled\"")
	private String IsEnrolled;

	@Column(name = "\"HasProgressed\"")
	private String HasProgressed;

	@Column(name = "\"IsGraduated\"")
	private String IsGraduated;

	@Column(name = "\"IsRetained\"")
	private String IsRetained;

	@Column(name = "\"StudentTermNumber\"")
	private Double StudentTermNumber;

	@Column(name = "\"StudentYearNumber\"")
	private Double StudentYearNumber;

	@Column(name = "\"RetentionDetailsRowNumber\"")
	private Double RetentionDetailsRowNumber;
	
	//groupDetails
	@Column(name = "\"GroupID\"")
	private Integer GroupID;
	
	@Column(name = "\"DataID\"")
	private String DataID;
	
	@Column(name = "\"Status\"")
	private String Status;
	
	@Column(name = "\"CreatedAt\"")
	private Date CreatedAt;
	
	@Column(name = "\"CreatedBy\"")
	private String CreatedBy;
	
	@Column(name = "\"ActiveStatus\"")
	private Boolean ActiveStatus;
	
	@Column(name = "\"NewStatusChange\"")
	private Boolean NewStatusChange;

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

	public String getEnrollmentStudentID() {
		return EnrollmentStudentID;
	}

	public void setEnrollmentStudentID(String enrollmentStudentID) {
		EnrollmentStudentID = enrollmentStudentID;
	}

	public String getEnrollmentAcademicTerm() {
		return EnrollmentAcademicTerm;
	}

	public void setEnrollmentAcademicTerm(String enrollmentAcademicTerm) {
		EnrollmentAcademicTerm = enrollmentAcademicTerm;
	}

	public String getClassID() {
		return ClassID;
	}

	public void setClassID(String classID) {
		ClassID = classID;
	}

	public String getSectionID() {
		return SectionID;
	}

	public void setSectionID(String sectionID) {
		SectionID = sectionID;
	}

	public String getEnrollmentAcademicTermID() {
		return EnrollmentAcademicTermID;
	}

	public void setEnrollmentAcademicTermID(String enrollmentAcademicTermID) {
		EnrollmentAcademicTermID = enrollmentAcademicTermID;
	}

	public String getEnrollmentAcademicTermIsMajor() {
		return EnrollmentAcademicTermIsMajor;
	}

	public void setEnrollmentAcademicTermIsMajor(String enrollmentAcademicTermIsMajor) {
		EnrollmentAcademicTermIsMajor = enrollmentAcademicTermIsMajor;
	}

	public String getEnrollmentAcademicTermName() {
		return EnrollmentAcademicTermName;
	}

	public void setEnrollmentAcademicTermName(String enrollmentAcademicTermName) {
		EnrollmentAcademicTermName = enrollmentAcademicTermName;
	}

	public String getEnrollmentAcademicYear() {
		return EnrollmentAcademicYear;
	}

	public void setEnrollmentAcademicYear(String enrollmentAcademicYear) {
		EnrollmentAcademicYear = enrollmentAcademicYear;
	}

	public Date getEnrollmentStatusEffectiveDate() {
		return EnrollmentStatusEffectiveDate;
	}

	public void setEnrollmentStatusEffectiveDate(Date enrollmentStatusEffectiveDate) {
		EnrollmentStatusEffectiveDate = enrollmentStatusEffectiveDate;
	}

	/*public String getClass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}*/

	public String getClassCollege() {
		return ClassCollege;
	}

	public void setClassCollege(String classCollege) {
		ClassCollege = classCollege;
	}

	public String getClassCollegeShort() {
		return ClassCollegeShort;
	}

	public void setClassCollegeShort(String classCollegeShort) {
		ClassCollegeShort = classCollegeShort;
	}

	public String getClassDepartment() {
		return ClassDepartment;
	}

	public void setClassDepartment(String classDepartment) {
		ClassDepartment = classDepartment;
	}

	public String getClassDepartmentID() {
		return ClassDepartmentID;
	}

	public void setClassDepartmentID(String classDepartmentID) {
		ClassDepartmentID = classDepartmentID;
	}

	public Double getClassPriorTermsEnrolledCount() {
		return ClassPriorTermsEnrolledCount;
	}

	public void setClassPriorTermsEnrolledCount(Double classPriorTermsEnrolledCount) {
		ClassPriorTermsEnrolledCount = classPriorTermsEnrolledCount;
	}

	public Double getClassPriorTermsGradedCount() {
		return ClassPriorTermsGradedCount;
	}

	public void setClassPriorTermsGradedCount(Double classPriorTermsGradedCount) {
		ClassPriorTermsGradedCount = classPriorTermsGradedCount;
	}

	public String getClassSchoolDivision() {
		return ClassSchoolDivision;
	}

	public void setClassSchoolDivision(String classSchoolDivision) {
		ClassSchoolDivision = classSchoolDivision;
	}

	public String getClassSchoolDivisionID() {
		return ClassSchoolDivisionID;
	}

	public void setClassSchoolDivisionID(String classSchoolDivisionID) {
		ClassSchoolDivisionID = classSchoolDivisionID;
	}

	public String getClassSectionID() {
		return ClassSectionID;
	}

	public void setClassSectionID(String classSectionID) {
		ClassSectionID = classSectionID;
	}

	public Double getClassTermsEnrolledTotalCount() {
		return ClassTermsEnrolledTotalCount;
	}

	public void setClassTermsEnrolledTotalCount(Double classTermsEnrolledTotalCount) {
		ClassTermsEnrolledTotalCount = classTermsEnrolledTotalCount;
	}

	public Double getClassTermsGradedTotalCount() {
		return ClassTermsGradedTotalCount;
	}

	public void setClassTermsGradedTotalCount(Double classTermsGradedTotalCount) {
		ClassTermsGradedTotalCount = classTermsGradedTotalCount;
	}

	public String getDegreeProgramType() {
		return DegreeProgramType;
	}

	public void setDegreeProgramType(String degreeProgramType) {
		DegreeProgramType = degreeProgramType;
	}

	public Integer getEnrollment() {
		return Enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		Enrollment = enrollment;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public Double getGradeValue() {
		return GradeValue;
	}

	public void setGradeValue(Double gradeValue) {
		GradeValue = gradeValue;
	}

	public Double getGradeValue4PointScale() {
		return GradeValue4PointScale;
	}

	public void setGradeValue4PointScale(Double gradeValue4PointScale) {
		GradeValue4PointScale = gradeValue4PointScale;
	}

	public Double getGradeValue4PointScaleHighest() {
		return GradeValue4PointScaleHighest;
	}

	public void setGradeValue4PointScaleHighest(Double gradeValue4PointScaleHighest) {
		GradeValue4PointScaleHighest = gradeValue4PointScaleHighest;
	}

	public Integer getGrossRevenue() {
		return GrossRevenue;
	}

	public void setGrossRevenue(Integer grossRevenue) {
		GrossRevenue = grossRevenue;
	}

	public String getHighestGradeEarned() {
		return HighestGradeEarned;
	}

	public void setHighestGradeEarned(String highestGradeEarned) {
		HighestGradeEarned = highestGradeEarned;
	}

	public String getHighestGradeEarnedAcademicTerm() {
		return HighestGradeEarnedAcademicTerm;
	}

	public void setHighestGradeEarnedAcademicTerm(String highestGradeEarnedAcademicTerm) {
		HighestGradeEarnedAcademicTerm = highestGradeEarnedAcademicTerm;
	}

	public Double getHighestGradeEarnedValue() {
		return HighestGradeEarnedValue;
	}

	public void setHighestGradeEarnedValue(Double highestGradeEarnedValue) {
		HighestGradeEarnedValue = highestGradeEarnedValue;
	}

	public String getIsCore() {
		return IsCore;
	}

	public void setIsCore(String isCore) {
		IsCore = isCore;
	}

	public String getIsCrossListApproved() {
		return IsCrossListApproved;
	}

	public void setIsCrossListApproved(String isCrossListApproved) {
		IsCrossListApproved = isCrossListApproved;
	}

	public String getIsDF() {
		return IsDF;
	}

	public void setIsDF(String isDF) {
		IsDF = isDF;
	}

	public String getIsDFW() {
		return IsDFW;
	}

	public void setIsDFW(String isDFW) {
		IsDFW = isDFW;
	}

	public String getIsHighestGradeEarned() {
		return IsHighestGradeEarned;
	}

	public void setIsHighestGradeEarned(String isHighestGradeEarned) {
		IsHighestGradeEarned = isHighestGradeEarned;
	}

	public String getIsNotPassed() {
		return IsNotPassed;
	}

	public void setIsNotPassed(String isNotPassed) {
		IsNotPassed = isNotPassed;
	}

	public String getIsOnlineCourse() {
		return IsOnlineCourse;
	}

	public void setIsOnlineCourse(String isOnlineCourse) {
		IsOnlineCourse = isOnlineCourse;
	}

	public String getIsRetake() {
		return IsRetake;
	}

	public void setIsRetake(String isRetake) {
		IsRetake = isRetake;
	}

	public String getPrimaryDeliveryMode() {
		return PrimaryDeliveryMode;
	}

	public void setPrimaryDeliveryMode(String primaryDeliveryMode) {
		PrimaryDeliveryMode = primaryDeliveryMode;
	}

	public String getPrimaryDeliveryModeID() {
		return PrimaryDeliveryModeID;
	}

	public void setPrimaryDeliveryModeID(String primaryDeliveryModeID) {
		PrimaryDeliveryModeID = primaryDeliveryModeID;
	}

	public String getPrimaryInstructorAcademicAppointmentSchoolDivision() {
		return PrimaryInstructorAcademicAppointmentSchoolDivision;
	}

	public void setPrimaryInstructorAcademicAppointmentSchoolDivision(
			String primaryInstructorAcademicAppointmentSchoolDivision) {
		PrimaryInstructorAcademicAppointmentSchoolDivision = primaryInstructorAcademicAppointmentSchoolDivision;
	}

	public String getPrimaryInstructorDepartment() {
		return PrimaryInstructorDepartment;
	}

	public void setPrimaryInstructorDepartment(String primaryInstructorDepartment) {
		PrimaryInstructorDepartment = primaryInstructorDepartment;
	}

	public String getPrimaryInstructorDepartmentID() {
		return PrimaryInstructorDepartmentID;
	}

	public void setPrimaryInstructorDepartmentID(String primaryInstructorDepartmentID) {
		PrimaryInstructorDepartmentID = primaryInstructorDepartmentID;
	}

	public String getPrimaryInstructorFirstName() {
		return PrimaryInstructorFirstName;
	}

	public void setPrimaryInstructorFirstName(String primaryInstructorFirstName) {
		PrimaryInstructorFirstName = primaryInstructorFirstName;
	}

	public String getPrimaryInstructorID() {
		return PrimaryInstructorID;
	}

	public void setPrimaryInstructorID(String primaryInstructorID) {
		PrimaryInstructorID = primaryInstructorID;
	}

	public String getPrimaryInstructorLastName() {
		return PrimaryInstructorLastName;
	}

	public void setPrimaryInstructorLastName(String primaryInstructorLastName) {
		PrimaryInstructorLastName = primaryInstructorLastName;
	}

	public String getPrimaryInstructorRank() {
		return PrimaryInstructorRank;
	}

	public void setPrimaryInstructorRank(String primaryInstructorRank) {
		PrimaryInstructorRank = primaryInstructorRank;
	}

	public String getPrimaryInstructorStatus() {
		return PrimaryInstructorStatus;
	}

	public void setPrimaryInstructorStatus(String primaryInstructorStatus) {
		PrimaryInstructorStatus = primaryInstructorStatus;
	}

	public String getPrimaryInstructorTitleSeries() {
		return PrimaryInstructorTitleSeries;
	}

	public void setPrimaryInstructorTitleSeries(String primaryInstructorTitleSeries) {
		PrimaryInstructorTitleSeries = primaryInstructorTitleSeries;
	}

	public String getPrimaryStudentCollege() {
		return PrimaryStudentCollege;
	}

	public void setPrimaryStudentCollege(String primaryStudentCollege) {
		PrimaryStudentCollege = primaryStudentCollege;
	}

	public String getPrimaryStudentDegree() {
		return PrimaryStudentDegree;
	}

	public void setPrimaryStudentDegree(String primaryStudentDegree) {
		PrimaryStudentDegree = primaryStudentDegree;
	}

	public String getPrimaryStudentDegreeName() {
		return PrimaryStudentDegreeName;
	}

	public void setPrimaryStudentDegreeName(String primaryStudentDegreeName) {
		PrimaryStudentDegreeName = primaryStudentDegreeName;
	}

	public String getPrimaryStudentDepartment() {
		return PrimaryStudentDepartment;
	}

	public void setPrimaryStudentDepartment(String primaryStudentDepartment) {
		PrimaryStudentDepartment = primaryStudentDepartment;
	}

	public String getPrimaryStudentDepartmentID() {
		return PrimaryStudentDepartmentID;
	}

	public void setPrimaryStudentDepartmentID(String primaryStudentDepartmentID) {
		PrimaryStudentDepartmentID = primaryStudentDepartmentID;
	}

	public String getPrimaryStudentMajor() {
		return PrimaryStudentMajor;
	}

	public void setPrimaryStudentMajor(String primaryStudentMajor) {
		PrimaryStudentMajor = primaryStudentMajor;
	}

	public String getPrimaryStudentMajorID() {
		return PrimaryStudentMajorID;
	}

	public void setPrimaryStudentMajorID(String primaryStudentMajorID) {
		PrimaryStudentMajorID = primaryStudentMajorID;
	}

	public String getPrimaryStudentMajorName() {
		return PrimaryStudentMajorName;
	}

	public void setPrimaryStudentMajorName(String primaryStudentMajorName) {
		PrimaryStudentMajorName = primaryStudentMajorName;
	}

	public String getPrimaryStudentSchoolDivision() {
		return PrimaryStudentSchoolDivision;
	}

	public void setPrimaryStudentSchoolDivision(String primaryStudentSchoolDivision) {
		PrimaryStudentSchoolDivision = primaryStudentSchoolDivision;
	}

	public Date getSectionBeginDate() {
		return SectionBeginDate;
	}

	public void setSectionBeginDate(Date sectionBeginDate) {
		SectionBeginDate = sectionBeginDate;
	}

	public Date getSectionEndDate() {
		return SectionEndDate;
	}

	public void setSectionEndDate(Date sectionEndDate) {
		SectionEndDate = sectionEndDate;
	}

	public String getSectionTitle() {
		return SectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		SectionTitle = sectionTitle;
	}

	public Double getUnitsCompleted() {
		return UnitsCompleted;
	}

	public void setUnitsCompleted(Double unitsCompleted) {
		UnitsCompleted = unitsCompleted;
	}

	public Double getUnitsAttempted() {
		return UnitsAttempted;
	}

	public void setUnitsAttempted(Double unitsAttempted) {
		UnitsAttempted = unitsAttempted;
	}

	public Double getUnitsPassed() {
		return UnitsPassed;
	}

	public void setUnitsPassed(Double unitsPassed) {
		UnitsPassed = unitsPassed;
	}

	public String getWaitlisted() {
		return Waitlisted;
	}

	public void setWaitlisted(String waitlisted) {
		Waitlisted = waitlisted;
	}

	public Integer getWithdrawalWeek() {
		return WithdrawalWeek;
	}

	public void setWithdrawalWeek(Integer withdrawalWeek) {
		WithdrawalWeek = withdrawalWeek;
	}

	public String getClassLevel() {
		return ClassLevel;
	}

	public void setClassLevel(String classLevel) {
		ClassLevel = classLevel;
	}

	public String getGradeScaleID() {
		return GradeScaleID;
	}

	public void setGradeScaleID(String gradeScaleID) {
		GradeScaleID = gradeScaleID;
	}

	public String getGradeScaleDescription() {
		return GradeScaleDescription;
	}

	public void setGradeScaleDescription(String gradeScaleDescription) {
		GradeScaleDescription = gradeScaleDescription;
	}

	public String getIsGenEd() {
		return IsGenEd;
	}

	public void setIsGenEd(String isGenEd) {
		IsGenEd = isGenEd;
	}

	public String getPrimaryInstructorFullPartTime() {
		return PrimaryInstructorFullPartTime;
	}

	public void setPrimaryInstructorFullPartTime(String primaryInstructorFullPartTime) {
		PrimaryInstructorFullPartTime = primaryInstructorFullPartTime;
	}

	public String getPrimaryInstructorPosition() {
		return PrimaryInstructorPosition;
	}

	public void setPrimaryInstructorPosition(String primaryInstructorPosition) {
		PrimaryInstructorPosition = primaryInstructorPosition;
	}

//	public String getMajorsMinorsStudentID() {
//		return MajorsMinorsStudentID;
//	}
//
//	public void setMajorsMinorsStudentID(String majorsMinorsStudentID) {
//		MajorsMinorsStudentID = majorsMinorsStudentID;
//	}

	public String getMajorsMinorsAcademicTerm() {
		return MajorsMinorsAcademicTerm;
	}

	public void setMajorsMinorsAcademicTerm(String majorsMinorsAcademicTerm) {
		MajorsMinorsAcademicTerm = majorsMinorsAcademicTerm;
	}

	public String getMajorsMinorsAcademicTermID() {
		return MajorsMinorsAcademicTermID;
	}

	public void setMajorsMinorsAcademicTermID(String majorsMinorsAcademicTermID) {
		MajorsMinorsAcademicTermID = majorsMinorsAcademicTermID;
	}

	public String getMajorsMinorsAcademicTermIsMajor() {
		return MajorsMinorsAcademicTermIsMajor;
	}

	public void setMajorsMinorsAcademicTermIsMajor(String majorsMinorsAcademicTermIsMajor) {
		MajorsMinorsAcademicTermIsMajor = majorsMinorsAcademicTermIsMajor;
	}

	public String getMajorsMinorsAcademicTermName() {
		return MajorsMinorsAcademicTermName;
	}

	public void setMajorsMinorsAcademicTermName(String majorsMinorsAcademicTermName) {
		MajorsMinorsAcademicTermName = majorsMinorsAcademicTermName;
	}

	public String getMajorsMinorsAcademicYear() {
		return MajorsMinorsAcademicYear;
	}

	public void setMajorsMinorsAcademicYear(String majorsMinorsAcademicYear) {
		MajorsMinorsAcademicYear = majorsMinorsAcademicYear;
	}

	public Date getCensusDate() {
		return CensusDate;
	}

	public void setCensusDate(Date censusDate) {
		CensusDate = censusDate;
	}

	public String getPrimaryDegreeClassificationID() {
		return PrimaryDegreeClassificationID;
	}

	public void setPrimaryDegreeClassificationID(String primaryDegreeClassificationID) {
		PrimaryDegreeClassificationID = primaryDegreeClassificationID;
	}

	public String getPrimaryDegreeClassification() {
		return PrimaryDegreeClassification;
	}

	public void setPrimaryDegreeClassification(String primaryDegreeClassification) {
		PrimaryDegreeClassification = primaryDegreeClassification;
	}

	public String getPrimaryDegreeID() {
		return PrimaryDegreeID;
	}

	public void setPrimaryDegreeID(String primaryDegreeID) {
		PrimaryDegreeID = primaryDegreeID;
	}

	public String getPrimaryDegreeShortName() {
		return PrimaryDegreeShortName;
	}

	public void setPrimaryDegreeShortName(String primaryDegreeShortName) {
		PrimaryDegreeShortName = primaryDegreeShortName;
	}

	public String getPrimaryDegreeName() {
		return PrimaryDegreeName;
	}

	public void setPrimaryDegreeName(String primaryDegreeName) {
		PrimaryDegreeName = primaryDegreeName;
	}

	public String getPrimaryDegreeTypeID() {
		return PrimaryDegreeTypeID;
	}

	public void setPrimaryDegreeTypeID(String primaryDegreeTypeID) {
		PrimaryDegreeTypeID = primaryDegreeTypeID;
	}

	public String getPrimaryDegreeType() {
		return PrimaryDegreeType;
	}

	public void setPrimaryDegreeType(String primaryDegreeType) {
		PrimaryDegreeType = primaryDegreeType;
	}

	public String getPrimaryDegreePrimaryMajorDepartmentID() {
		return PrimaryDegreePrimaryMajorDepartmentID;
	}

	public void setPrimaryDegreePrimaryMajorDepartmentID(String primaryDegreePrimaryMajorDepartmentID) {
		PrimaryDegreePrimaryMajorDepartmentID = primaryDegreePrimaryMajorDepartmentID;
	}

	public String getPrimaryDegreePrimaryMajorDepartmentName() {
		return PrimaryDegreePrimaryMajorDepartmentName;
	}

	public void setPrimaryDegreePrimaryMajorDepartmentName(String primaryDegreePrimaryMajorDepartmentName) {
		PrimaryDegreePrimaryMajorDepartmentName = primaryDegreePrimaryMajorDepartmentName;
	}

	public String getPrimaryDegreePrimaryMajorID() {
		return PrimaryDegreePrimaryMajorID;
	}

	public void setPrimaryDegreePrimaryMajorID(String primaryDegreePrimaryMajorID) {
		PrimaryDegreePrimaryMajorID = primaryDegreePrimaryMajorID;
	}

	public String getPrimaryDegreePrimaryMajorShortName() {
		return PrimaryDegreePrimaryMajorShortName;
	}

	public void setPrimaryDegreePrimaryMajorShortName(String primaryDegreePrimaryMajorShortName) {
		PrimaryDegreePrimaryMajorShortName = primaryDegreePrimaryMajorShortName;
	}

	public String getPrimaryDegreePrimaryMajorName() {
		return PrimaryDegreePrimaryMajorName;
	}

	public void setPrimaryDegreePrimaryMajorName(String primaryDegreePrimaryMajorName) {
		PrimaryDegreePrimaryMajorName = primaryDegreePrimaryMajorName;
	}

	public String getPrimaryDegreePrimaryMajorSchoolDivisionID() {
		return PrimaryDegreePrimaryMajorSchoolDivisionID;
	}

	public void setPrimaryDegreePrimaryMajorSchoolDivisionID(String primaryDegreePrimaryMajorSchoolDivisionID) {
		PrimaryDegreePrimaryMajorSchoolDivisionID = primaryDegreePrimaryMajorSchoolDivisionID;
	}

	public String getPrimaryDegreePrimaryMajorSchoolDivisionName() {
		return PrimaryDegreePrimaryMajorSchoolDivisionName;
	}

	public void setPrimaryDegreePrimaryMajorSchoolDivisionName(String primaryDegreePrimaryMajorSchoolDivisionName) {
		PrimaryDegreePrimaryMajorSchoolDivisionName = primaryDegreePrimaryMajorSchoolDivisionName;
	}

	public String getPrimaryDegreePrimaryMinorID() {
		return PrimaryDegreePrimaryMinorID;
	}

	public void setPrimaryDegreePrimaryMinorID(String primaryDegreePrimaryMinorID) {
		PrimaryDegreePrimaryMinorID = primaryDegreePrimaryMinorID;
	}

	public String getPrimaryDegreePrimaryMinorShortName() {
		return PrimaryDegreePrimaryMinorShortName;
	}

	public void setPrimaryDegreePrimaryMinorShortName(String primaryDegreePrimaryMinorShortName) {
		PrimaryDegreePrimaryMinorShortName = primaryDegreePrimaryMinorShortName;
	}

	public String getPrimaryDegreePrimaryMinorName() {
		return PrimaryDegreePrimaryMinorName;
	}

	public void setPrimaryDegreePrimaryMinorName(String primaryDegreePrimaryMinorName) {
		PrimaryDegreePrimaryMinorName = primaryDegreePrimaryMinorName;
	}

	public String getPrimaryDegreeSecondaryMajorDepartmentID() {
		return PrimaryDegreeSecondaryMajorDepartmentID;
	}

	public void setPrimaryDegreeSecondaryMajorDepartmentID(String primaryDegreeSecondaryMajorDepartmentID) {
		PrimaryDegreeSecondaryMajorDepartmentID = primaryDegreeSecondaryMajorDepartmentID;
	}

	public String getPrimaryDegreeSecondaryMajorDepartmentName() {
		return PrimaryDegreeSecondaryMajorDepartmentName;
	}

	public void setPrimaryDegreeSecondaryMajorDepartmentName(String primaryDegreeSecondaryMajorDepartmentName) {
		PrimaryDegreeSecondaryMajorDepartmentName = primaryDegreeSecondaryMajorDepartmentName;
	}

	public String getPrimaryDegreeSecondaryMajorID() {
		return PrimaryDegreeSecondaryMajorID;
	}

	public void setPrimaryDegreeSecondaryMajorID(String primaryDegreeSecondaryMajorID) {
		PrimaryDegreeSecondaryMajorID = primaryDegreeSecondaryMajorID;
	}

	public String getPrimaryDegreeSecondaryMajorShortName() {
		return PrimaryDegreeSecondaryMajorShortName;
	}

	public void setPrimaryDegreeSecondaryMajorShortName(String primaryDegreeSecondaryMajorShortName) {
		PrimaryDegreeSecondaryMajorShortName = primaryDegreeSecondaryMajorShortName;
	}

	public String getPrimaryDegreeSecondaryMajorName() {
		return PrimaryDegreeSecondaryMajorName;
	}

	public void setPrimaryDegreeSecondaryMajorName(String primaryDegreeSecondaryMajorName) {
		PrimaryDegreeSecondaryMajorName = primaryDegreeSecondaryMajorName;
	}

	public String getPrimaryDegreeSecondaryMajorSchoolDivisionID() {
		return PrimaryDegreeSecondaryMajorSchoolDivisionID;
	}

	public void setPrimaryDegreeSecondaryMajorSchoolDivisionID(String primaryDegreeSecondaryMajorSchoolDivisionID) {
		PrimaryDegreeSecondaryMajorSchoolDivisionID = primaryDegreeSecondaryMajorSchoolDivisionID;
	}

	public String getPrimaryDegreeSecondaryMajorSchoolDivisionName() {
		return PrimaryDegreeSecondaryMajorSchoolDivisionName;
	}

	public void setPrimaryDegreeSecondaryMajorSchoolDivisionName(String primaryDegreeSecondaryMajorSchoolDivisionName) {
		PrimaryDegreeSecondaryMajorSchoolDivisionName = primaryDegreeSecondaryMajorSchoolDivisionName;
	}

	public String getPrimaryDegreeSecondaryMinorID() {
		return PrimaryDegreeSecondaryMinorID;
	}

	public void setPrimaryDegreeSecondaryMinorID(String primaryDegreeSecondaryMinorID) {
		PrimaryDegreeSecondaryMinorID = primaryDegreeSecondaryMinorID;
	}

	public String getPrimaryDegreeSecondaryMinorShortName() {
		return PrimaryDegreeSecondaryMinorShortName;
	}

	public void setPrimaryDegreeSecondaryMinorShortName(String primaryDegreeSecondaryMinorShortName) {
		PrimaryDegreeSecondaryMinorShortName = primaryDegreeSecondaryMinorShortName;
	}

	public String getPrimaryDegreeSecondaryMinorName() {
		return PrimaryDegreeSecondaryMinorName;
	}

	public void setPrimaryDegreeSecondaryMinorName(String primaryDegreeSecondaryMinorName) {
		PrimaryDegreeSecondaryMinorName = primaryDegreeSecondaryMinorName;
	}

	public String getSecondaryDegreeClassificationID() {
		return SecondaryDegreeClassificationID;
	}

	public void setSecondaryDegreeClassificationID(String secondaryDegreeClassificationID) {
		SecondaryDegreeClassificationID = secondaryDegreeClassificationID;
	}

	public String getSecondaryDegreeClassification() {
		return SecondaryDegreeClassification;
	}

	public void setSecondaryDegreeClassification(String secondaryDegreeClassification) {
		SecondaryDegreeClassification = secondaryDegreeClassification;
	}

	public String getSecondaryDegreeShortName() {
		return SecondaryDegreeShortName;
	}

	public void setSecondaryDegreeShortName(String secondaryDegreeShortName) {
		SecondaryDegreeShortName = secondaryDegreeShortName;
	}

	public String getSecondaryDegreeName() {
		return SecondaryDegreeName;
	}

	public void setSecondaryDegreeName(String secondaryDegreeName) {
		SecondaryDegreeName = secondaryDegreeName;
	}

	public String getSecondaryDegreeTypeID() {
		return SecondaryDegreeTypeID;
	}

	public void setSecondaryDegreeTypeID(String secondaryDegreeTypeID) {
		SecondaryDegreeTypeID = secondaryDegreeTypeID;
	}

	public String getSecondaryDegreeType() {
		return SecondaryDegreeType;
	}

	public void setSecondaryDegreeType(String secondaryDegreeType) {
		SecondaryDegreeType = secondaryDegreeType;
	}

	public String getSecondaryDegreePrimaryMajorDepartmentID() {
		return SecondaryDegreePrimaryMajorDepartmentID;
	}

	public void setSecondaryDegreePrimaryMajorDepartmentID(String secondaryDegreePrimaryMajorDepartmentID) {
		SecondaryDegreePrimaryMajorDepartmentID = secondaryDegreePrimaryMajorDepartmentID;
	}

	public String getSecondaryDegreePrimaryMajorDepartmentName() {
		return SecondaryDegreePrimaryMajorDepartmentName;
	}

	public void setSecondaryDegreePrimaryMajorDepartmentName(String secondaryDegreePrimaryMajorDepartmentName) {
		SecondaryDegreePrimaryMajorDepartmentName = secondaryDegreePrimaryMajorDepartmentName;
	}

	public String getSecondaryDegreePrimaryMajorID() {
		return SecondaryDegreePrimaryMajorID;
	}

	public void setSecondaryDegreePrimaryMajorID(String secondaryDegreePrimaryMajorID) {
		SecondaryDegreePrimaryMajorID = secondaryDegreePrimaryMajorID;
	}

	public String getSecondaryDegreePrimaryMajorShortName() {
		return SecondaryDegreePrimaryMajorShortName;
	}

	public void setSecondaryDegreePrimaryMajorShortName(String secondaryDegreePrimaryMajorShortName) {
		SecondaryDegreePrimaryMajorShortName = secondaryDegreePrimaryMajorShortName;
	}

	public String getSecondaryDegreePrimaryMajorName() {
		return SecondaryDegreePrimaryMajorName;
	}

	public void setSecondaryDegreePrimaryMajorName(String secondaryDegreePrimaryMajorName) {
		SecondaryDegreePrimaryMajorName = secondaryDegreePrimaryMajorName;
	}

	public String getSecondaryDegreePrimaryMajorSchoolDivisionID() {
		return SecondaryDegreePrimaryMajorSchoolDivisionID;
	}

	public void setSecondaryDegreePrimaryMajorSchoolDivisionID(String secondaryDegreePrimaryMajorSchoolDivisionID) {
		SecondaryDegreePrimaryMajorSchoolDivisionID = secondaryDegreePrimaryMajorSchoolDivisionID;
	}

	public String getSecondaryDegreePrimaryMajorSchoolDivisionName() {
		return SecondaryDegreePrimaryMajorSchoolDivisionName;
	}

	public void setSecondaryDegreePrimaryMajorSchoolDivisionName(String secondaryDegreePrimaryMajorSchoolDivisionName) {
		SecondaryDegreePrimaryMajorSchoolDivisionName = secondaryDegreePrimaryMajorSchoolDivisionName;
	}

	public String getSecondaryDegreePrimaryMinorID() {
		return SecondaryDegreePrimaryMinorID;
	}

	public void setSecondaryDegreePrimaryMinorID(String secondaryDegreePrimaryMinorID) {
		SecondaryDegreePrimaryMinorID = secondaryDegreePrimaryMinorID;
	}

	public String getSecondaryDegreePrimaryMinorShortName() {
		return SecondaryDegreePrimaryMinorShortName;
	}

	public void setSecondaryDegreePrimaryMinorShortName(String secondaryDegreePrimaryMinorShortName) {
		SecondaryDegreePrimaryMinorShortName = secondaryDegreePrimaryMinorShortName;
	}

	public String getSecondaryDegreePrimaryMinorName() {
		return SecondaryDegreePrimaryMinorName;
	}

	public void setSecondaryDegreePrimaryMinorName(String secondaryDegreePrimaryMinorName) {
		SecondaryDegreePrimaryMinorName = secondaryDegreePrimaryMinorName;
	}

	public String getSecondaryDegreeSecondaryMajorDepartmentID() {
		return SecondaryDegreeSecondaryMajorDepartmentID;
	}

	public void setSecondaryDegreeSecondaryMajorDepartmentID(String secondaryDegreeSecondaryMajorDepartmentID) {
		SecondaryDegreeSecondaryMajorDepartmentID = secondaryDegreeSecondaryMajorDepartmentID;
	}

	public String getSecondaryDegreeSecondaryMajorDepartmentName() {
		return SecondaryDegreeSecondaryMajorDepartmentName;
	}

	public void setSecondaryDegreeSecondaryMajorDepartmentName(String secondaryDegreeSecondaryMajorDepartmentName) {
		SecondaryDegreeSecondaryMajorDepartmentName = secondaryDegreeSecondaryMajorDepartmentName;
	}

	public String getSecondaryDegreeSecondaryMajorID() {
		return SecondaryDegreeSecondaryMajorID;
	}

	public void setSecondaryDegreeSecondaryMajorID(String secondaryDegreeSecondaryMajorID) {
		SecondaryDegreeSecondaryMajorID = secondaryDegreeSecondaryMajorID;
	}

	public String getSecondaryDegreeSecondaryMajorShortName() {
		return SecondaryDegreeSecondaryMajorShortName;
	}

	public void setSecondaryDegreeSecondaryMajorShortName(String secondaryDegreeSecondaryMajorShortName) {
		SecondaryDegreeSecondaryMajorShortName = secondaryDegreeSecondaryMajorShortName;
	}

	public String getSecondaryDegreeSecondaryMajorName() {
		return SecondaryDegreeSecondaryMajorName;
	}

	public void setSecondaryDegreeSecondaryMajorName(String secondaryDegreeSecondaryMajorName) {
		SecondaryDegreeSecondaryMajorName = secondaryDegreeSecondaryMajorName;
	}

	public String getSecondaryDegreeSecondaryMajorSchoolDivisionID() {
		return SecondaryDegreeSecondaryMajorSchoolDivisionID;
	}

	public void setSecondaryDegreeSecondaryMajorSchoolDivisionID(String secondaryDegreeSecondaryMajorSchoolDivisionID) {
		SecondaryDegreeSecondaryMajorSchoolDivisionID = secondaryDegreeSecondaryMajorSchoolDivisionID;
	}

	public String getSecondaryDegreeSecondaryMajorSchoolDivisionName() {
		return SecondaryDegreeSecondaryMajorSchoolDivisionName;
	}

	public void setSecondaryDegreeSecondaryMajorSchoolDivisionName(String secondaryDegreeSecondaryMajorSchoolDivisionName) {
		SecondaryDegreeSecondaryMajorSchoolDivisionName = secondaryDegreeSecondaryMajorSchoolDivisionName;
	}

	public String getSecondaryDegreeSecondaryMinorID() {
		return SecondaryDegreeSecondaryMinorID;
	}

	public void setSecondaryDegreeSecondaryMinorID(String secondaryDegreeSecondaryMinorID) {
		SecondaryDegreeSecondaryMinorID = secondaryDegreeSecondaryMinorID;
	}

	public String getSecondaryDegreeSecondaryMinorShortName() {
		return SecondaryDegreeSecondaryMinorShortName;
	}

	public void setSecondaryDegreeSecondaryMinorShortName(String secondaryDegreeSecondaryMinorShortName) {
		SecondaryDegreeSecondaryMinorShortName = secondaryDegreeSecondaryMinorShortName;
	}

	public String getSecondaryDegreeSecondaryMinorName() {
		return SecondaryDegreeSecondaryMinorName;
	}

	public void setSecondaryDegreeSecondaryMinorName(String secondaryDegreeSecondaryMinorName) {
		SecondaryDegreeSecondaryMinorName = secondaryDegreeSecondaryMinorName;
	}

	public Double getMajorsMinorsRowNumber() {
		return MajorsMinorsRowNumber;
	}

	public void setMajorsMinorsRowNumber(Double majorsMinorsRowNumber) {
		MajorsMinorsRowNumber = majorsMinorsRowNumber;
	}

	public String getPrimaryDegreePrimaryMinorDepartmentID() {
		return PrimaryDegreePrimaryMinorDepartmentID;
	}

	public void setPrimaryDegreePrimaryMinorDepartmentID(String primaryDegreePrimaryMinorDepartmentID) {
		PrimaryDegreePrimaryMinorDepartmentID = primaryDegreePrimaryMinorDepartmentID;
	}

	public String getPrimaryDegreePrimaryMinorDepartmentName() {
		return PrimaryDegreePrimaryMinorDepartmentName;
	}

	public void setPrimaryDegreePrimaryMinorDepartmentName(String primaryDegreePrimaryMinorDepartmentName) {
		PrimaryDegreePrimaryMinorDepartmentName = primaryDegreePrimaryMinorDepartmentName;
	}

	public String getPrimaryDegreePrimaryMinorSchoolDivisionID() {
		return PrimaryDegreePrimaryMinorSchoolDivisionID;
	}

	public void setPrimaryDegreePrimaryMinorSchoolDivisionID(String primaryDegreePrimaryMinorSchoolDivisionID) {
		PrimaryDegreePrimaryMinorSchoolDivisionID = primaryDegreePrimaryMinorSchoolDivisionID;
	}

	public String getPrimaryDegreePrimaryMinorSchoolDivisionName() {
		return PrimaryDegreePrimaryMinorSchoolDivisionName;
	}

	public void setPrimaryDegreePrimaryMinorSchoolDivisionName(String primaryDegreePrimaryMinorSchoolDivisionName) {
		PrimaryDegreePrimaryMinorSchoolDivisionName = primaryDegreePrimaryMinorSchoolDivisionName;
	}

	public String getPrimaryDegreeSecondaryMinorDepartmentID() {
		return PrimaryDegreeSecondaryMinorDepartmentID;
	}

	public void setPrimaryDegreeSecondaryMinorDepartmentID(String primaryDegreeSecondaryMinorDepartmentID) {
		PrimaryDegreeSecondaryMinorDepartmentID = primaryDegreeSecondaryMinorDepartmentID;
	}

	public String getPrimaryDegreeSecondaryMinorDepartmentName() {
		return PrimaryDegreeSecondaryMinorDepartmentName;
	}

	public void setPrimaryDegreeSecondaryMinorDepartmentName(String primaryDegreeSecondaryMinorDepartmentName) {
		PrimaryDegreeSecondaryMinorDepartmentName = primaryDegreeSecondaryMinorDepartmentName;
	}

	public String getPrimaryDegreeSecondaryMinorSchoolDivisionID() {
		return PrimaryDegreeSecondaryMinorSchoolDivisionID;
	}

	public void setPrimaryDegreeSecondaryMinorSchoolDivisionID(String primaryDegreeSecondaryMinorSchoolDivisionID) {
		PrimaryDegreeSecondaryMinorSchoolDivisionID = primaryDegreeSecondaryMinorSchoolDivisionID;
	}

	public String getPrimaryDegreeSecondaryMinorSchoolDivisionName() {
		return PrimaryDegreeSecondaryMinorSchoolDivisionName;
	}

	public void setPrimaryDegreeSecondaryMinorSchoolDivisionName(String primaryDegreeSecondaryMinorSchoolDivisionName) {
		PrimaryDegreeSecondaryMinorSchoolDivisionName = primaryDegreeSecondaryMinorSchoolDivisionName;
	}

	public String getSecondaryDegreeID() {
		return SecondaryDegreeID;
	}

	public void setSecondaryDegreeID(String secondaryDegreeID) {
		SecondaryDegreeID = secondaryDegreeID;
	}

	public String getSecondaryDegreePrimaryMinorDepartmentID() {
		return SecondaryDegreePrimaryMinorDepartmentID;
	}

	public void setSecondaryDegreePrimaryMinorDepartmentID(String secondaryDegreePrimaryMinorDepartmentID) {
		SecondaryDegreePrimaryMinorDepartmentID = secondaryDegreePrimaryMinorDepartmentID;
	}

	public String getSecondaryDegreePrimaryMinorDepartmentName() {
		return SecondaryDegreePrimaryMinorDepartmentName;
	}

	public void setSecondaryDegreePrimaryMinorDepartmentName(String secondaryDegreePrimaryMinorDepartmentName) {
		SecondaryDegreePrimaryMinorDepartmentName = secondaryDegreePrimaryMinorDepartmentName;
	}

	public String getSecondaryDegreePrimaryMinorSchoolDivisionID() {
		return SecondaryDegreePrimaryMinorSchoolDivisionID;
	}

	public void setSecondaryDegreePrimaryMinorSchoolDivisionID(String secondaryDegreePrimaryMinorSchoolDivisionID) {
		SecondaryDegreePrimaryMinorSchoolDivisionID = secondaryDegreePrimaryMinorSchoolDivisionID;
	}

	public String getSecondaryDegreePrimaryMinorSchoolDivisionName() {
		return SecondaryDegreePrimaryMinorSchoolDivisionName;
	}

	public void setSecondaryDegreePrimaryMinorSchoolDivisionName(String secondaryDegreePrimaryMinorSchoolDivisionName) {
		SecondaryDegreePrimaryMinorSchoolDivisionName = secondaryDegreePrimaryMinorSchoolDivisionName;
	}

	public String getSecondaryDegreeSecondaryMinorDepartmentID() {
		return SecondaryDegreeSecondaryMinorDepartmentID;
	}

	public void setSecondaryDegreeSecondaryMinorDepartmentID(String secondaryDegreeSecondaryMinorDepartmentID) {
		SecondaryDegreeSecondaryMinorDepartmentID = secondaryDegreeSecondaryMinorDepartmentID;
	}

	public String getSecondaryDegreeSecondaryMinorDepartmentName() {
		return SecondaryDegreeSecondaryMinorDepartmentName;
	}

	public void setSecondaryDegreeSecondaryMinorDepartmentName(String secondaryDegreeSecondaryMinorDepartmentName) {
		SecondaryDegreeSecondaryMinorDepartmentName = secondaryDegreeSecondaryMinorDepartmentName;
	}

	public String getSecondaryDegreeSecondaryMinorSchoolDivisionID() {
		return SecondaryDegreeSecondaryMinorSchoolDivisionID;
	}

	public void setSecondaryDegreeSecondaryMinorSchoolDivisionID(String secondaryDegreeSecondaryMinorSchoolDivisionID) {
		SecondaryDegreeSecondaryMinorSchoolDivisionID = secondaryDegreeSecondaryMinorSchoolDivisionID;
	}

	public String getSecondaryDegreeSecondaryMinorSchoolDivisionName() {
		return SecondaryDegreeSecondaryMinorSchoolDivisionName;
	}

	public void setSecondaryDegreeSecondaryMinorSchoolDivisionName(String secondaryDegreeSecondaryMinorSchoolDivisionName) {
		SecondaryDegreeSecondaryMinorSchoolDivisionName = secondaryDegreeSecondaryMinorSchoolDivisionName;
	}

	public String getMajorsMinorsDetailsStudentID() {
		return MajorsMinorsDetailsStudentID;
	}

	public void setMajorsMinorsDetailsStudentID(String majorsMinorsDetailsStudentID) {
		MajorsMinorsDetailsStudentID = majorsMinorsDetailsStudentID;
	}

	public String getMajorsMinorsDetailsAcademicTerm() {
		return MajorsMinorsDetailsAcademicTerm;
	}

	public void setMajorsMinorsDetailsAcademicTerm(String majorsMinorsDetailsAcademicTerm) {
		MajorsMinorsDetailsAcademicTerm = majorsMinorsDetailsAcademicTerm;
	}

	public String getProgramTypeChange() {
		return ProgramTypeChange;
	}

	public void setProgramTypeChange(String programTypeChange) {
		ProgramTypeChange = programTypeChange;
	}

	public String getToProgramPriority() {
		return ToProgramPriority;
	}

	public void setToProgramPriority(String toProgramPriority) {
		ToProgramPriority = toProgramPriority;
	}

	public String getMajorsMinorsDetailsAcademicTermID() {
		return MajorsMinorsDetailsAcademicTermID;
	}

	public void setMajorsMinorsDetailsAcademicTermID(String majorsMinorsDetailsAcademicTermID) {
		MajorsMinorsDetailsAcademicTermID = majorsMinorsDetailsAcademicTermID;
	}

	public String getMajorsMinorsDetailsAcademicTermIsMajor() {
		return MajorsMinorsDetailsAcademicTermIsMajor;
	}

	public void setMajorsMinorsDetailsAcademicTermIsMajor(String majorsMinorsDetailsAcademicTermIsMajor) {
		MajorsMinorsDetailsAcademicTermIsMajor = majorsMinorsDetailsAcademicTermIsMajor;
	}

	public String getMajorsMinorsDetailsAcademicTermName() {
		return MajorsMinorsDetailsAcademicTermName;
	}

	public void setMajorsMinorsDetailsAcademicTermName(String majorsMinorsDetailsAcademicTermName) {
		MajorsMinorsDetailsAcademicTermName = majorsMinorsDetailsAcademicTermName;
	}

	public Integer getMajorsMinorsDetailsAcademicYear() {
		return MajorsMinorsDetailsAcademicYear;
	}

	public void setMajorsMinorsDetailsAcademicYear(Integer majorsMinorsDetailsAcademicYear) {
		MajorsMinorsDetailsAcademicYear = majorsMinorsDetailsAcademicYear;
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

	public String getRetentionStudentID() {
		return RetentionStudentID;
	}

	public void setRetentionStudentID(String retentionStudentID) {
		RetentionStudentID = retentionStudentID;
	}

	public String getRetentionCohortGroup() {
		return RetentionCohortGroup;
	}

	public void setRetentionCohortGroup(String retentionCohortGroup) {
		RetentionCohortGroup = retentionCohortGroup;
	}

	public String getRetentionCohortTerm() {
		return RetentionCohortTerm;
	}

	public void setRetentionCohortTerm(String retentionCohortTerm) {
		RetentionCohortTerm = retentionCohortTerm;
	}

	public String getRetentionCohortCategory() {
		return RetentionCohortCategory;
	}

	public void setRetentionCohortCategory(String retentionCohortCategory) {
		RetentionCohortCategory = retentionCohortCategory;
	}

	public String getRetentionCohortTermID() {
		return RetentionCohortTermID;
	}

	public void setRetentionCohortTermID(String retentionCohortTermID) {
		RetentionCohortTermID = retentionCohortTermID;
	}

	public String getRetentionCohortTermName() {
		return RetentionCohortTermName;
	}

	public void setRetentionCohortTermName(String retentionCohortTermName) {
		RetentionCohortTermName = retentionCohortTermName;
	}

//	public String getRetentionCohortTermIsMajor() {
//		return RetentionCohortTermIsMajor;
//	}
//
//	public void setRetentionCohortTermIsMajor(String retentionCohortTermIsMajor) {
//		RetentionCohortTermIsMajor = retentionCohortTermIsMajor;
//	}

	public String getRetentionCohortYear() {
		return RetentionCohortYear;
	}

	public void setRetentionCohortYear(String retentionCohortYear) {
		RetentionCohortYear = retentionCohortYear;
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

	public String getRetentionDetailsStudentID() {
		return RetentionDetailsStudentID;
	}

	public void setRetentionDetailsStudentID(String retentionDetailsStudentID) {
		RetentionDetailsStudentID = retentionDetailsStudentID;
	}

	public String getRetentionDetailsCohortGroup() {
		return RetentionDetailsCohortGroup;
	}

	public void setRetentionDetailsCohortGroup(String retentionDetailsCohortGroup) {
		RetentionDetailsCohortGroup = retentionDetailsCohortGroup;
	}

	public String getRetentionDetailsCohortTerm() {
		return RetentionDetailsCohortTerm;
	}

	public void setRetentionDetailsCohortTerm(String retentionDetailsCohortTerm) {
		RetentionDetailsCohortTerm = retentionDetailsCohortTerm;
	}

	public String getRetentionDetailsAcademicTerm() {
		return RetentionDetailsAcademicTerm;
	}

	public void setRetentionDetailsAcademicTerm(String retentionDetailsAcademicTerm) {
		RetentionDetailsAcademicTerm = retentionDetailsAcademicTerm;
	}

	public String getRetentionDetailsCohortCategory() {
		return RetentionDetailsCohortCategory;
	}

	public void setRetentionDetailsCohortCategory(String retentionDetailsCohortCategory) {
		RetentionDetailsCohortCategory = retentionDetailsCohortCategory;
	}

	public String getRetentionDetailsCohortTermID() {
		return RetentionDetailsCohortTermID;
	}

	public void setRetentionDetailsCohortTermID(String retentionDetailsCohortTermID) {
		RetentionDetailsCohortTermID = retentionDetailsCohortTermID;
	}

	public String getRetentionDetailsCohortTermIsMajor() {
		return RetentionDetailsCohortTermIsMajor;
	}

	public void setRetentionDetailsCohortTermIsMajor(String retentionDetailsCohortTermIsMajor) {
		RetentionDetailsCohortTermIsMajor = retentionDetailsCohortTermIsMajor;
	}

	public String getRetentionDetailsCohortTermName() {
		return RetentionDetailsCohortTermName;
	}

	public void setRetentionDetailsCohortTermName(String retentionDetailsCohortTermName) {
		RetentionDetailsCohortTermName = retentionDetailsCohortTermName;
	}

	public String getRetentionDetailsCohortYear() {
		return RetentionDetailsCohortYear;
	}

	public void setRetentionDetailsCohortYear(String retentionDetailsCohortYear) {
		RetentionDetailsCohortYear = retentionDetailsCohortYear;
	}

	public String getRetentionDetailsAcademicTermID() {
		return RetentionDetailsAcademicTermID;
	}

	public void setRetentionDetailsAcademicTermID(String retentionDetailsAcademicTermID) {
		RetentionDetailsAcademicTermID = retentionDetailsAcademicTermID;
	}

	public String getRetentionDetailsAcademicTermIsMajor() {
		return RetentionDetailsAcademicTermIsMajor;
	}

	public void setRetentionDetailsAcademicTermIsMajor(String retentionDetailsAcademicTermIsMajor) {
		RetentionDetailsAcademicTermIsMajor = retentionDetailsAcademicTermIsMajor;
	}

	public String getRetentionDetailsAcademicTermName() {
		return RetentionDetailsAcademicTermName;
	}

	public void setRetentionDetailsAcademicTermName(String retentionDetailsAcademicTermName) {
		RetentionDetailsAcademicTermName = retentionDetailsAcademicTermName;
	}

	public String getRetentionDetailsAcademicYear() {
		return RetentionDetailsAcademicYear;
	}

	public void setRetentionDetailsAcademicYear(String retentionDetailsAcademicYear) {
		RetentionDetailsAcademicYear = retentionDetailsAcademicYear;
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

	public Double getRetentionDetailsRowNumber() {
		return RetentionDetailsRowNumber;
	}

	public void setRetentionDetailsRowNumber(Double retentionDetailsRowNumber) {
		RetentionDetailsRowNumber = retentionDetailsRowNumber;
	}

/*	public String getClass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}*/

	public Integer getGroupID() {
		return GroupID;
	}

	public void setGroupID(Integer groupID) {
		GroupID = groupID;
	}

	public String getDataID() {
		return DataID;
	}

	public void setDataID(String dataID) {
		DataID = dataID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Boolean getActiveStatus() {
		return ActiveStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		ActiveStatus = activeStatus;
	}

	public Boolean getNewStatusChange() {
		return NewStatusChange;
	}

	public void setNewStatusChange(Boolean newStatusChange) {
		NewStatusChange = newStatusChange;
	}

}
