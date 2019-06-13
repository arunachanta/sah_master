package sap.sah2.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport;
import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport.ReturnType;
import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport.ReturnType.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sap.sah2.entities.Demo_Enr;

public class StudentCount {
	
	@PersistenceUnit
	EntityManagerFactory emf;
	
	public StudentCount() {
		System.out.println("InConstructor");
	}

	public static void StudentCount_Test() {
		System.out.println("InConstructor");
	}
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentCount.class);

	@EdmFunctionImport(name = "Demo_Enr", entitySet = "Demo_Enrs", returnType = @ReturnType(type = Type.ENTITY, isCollection = true))
	public List<Demo_Enr> Demo_Enr(){		
		try
		{
		LOGGER.error("In the Demo_Enr Method of StudentCount");
		// Get the query based on the input
//			String stmt = "select count(distinct \"StudentID\") as \"CountStudents\", \"GenderAtBirth\",\"AcademicYear\" from \"sah.curatedViews::Demo_Enr\" group by \"GenderAtBirth\",\"AcademicYear\" ";
		String stmt = "select count(distinct StudentID) as CountStudents, GenderAtBirth, AcademicYear from Demo_Enr group by GenderAtBirth, AcademicYear";
		// Process the Query
			System.out.println("stmt---"+ stmt);
			//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sah");
			System.out.println("emf---"+emf);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("et---"+ et);
		et.begin();
		// Set the Query
		Query query = em.createNativeQuery(stmt,Demo_Enr.class);	
		et.commit();
		
		// Return the output results
		List<Demo_Enr> resultList = (List<Demo_Enr>)query.getResultList();
		System.out.println("resultList---"+ resultList);
		return resultList;

		}catch(Exception e){
			LOGGER.error("Persistence operation failed",e.getMessage());
			return null;
		}
		
	}
}
