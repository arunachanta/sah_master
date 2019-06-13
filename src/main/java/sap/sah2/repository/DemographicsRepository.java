package sap.sah2.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import sap.sah2.entities.Demographics;

/*@Transactional*/
public interface DemographicsRepository extends CrudRepository<Demographics, String> {

	/*@Override
	@Query("select a.StudentID from Demographics a where a.AgeCurrent=55")
	public Iterable<Demographics> findAll();*/
}