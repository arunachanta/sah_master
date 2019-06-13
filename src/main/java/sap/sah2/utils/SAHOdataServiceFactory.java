package sap.sah2.utils;

import javax.persistence.EntityManagerFactory;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import sap.sah2.JPAannotations.CustomAnnotationProcessor;


import org.springframework.context.annotation.Scope;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class SAHOdataServiceFactory extends ODataJPAServiceFactory{
	public static final String PUNIT_NAME = "sah";
	private final EntityManagerFactory entityManagerFactory;
	
	@Autowired
	public SAHOdataServiceFactory(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}


	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		ODataJPAContext oDataJPAContext = getODataJPAContext();
		oDataJPAContext.setEntityManagerFactory(entityManagerFactory);
		oDataJPAContext.setJPAEdmExtension(new CustomAnnotationProcessor());
		oDataJPAContext.setPersistenceUnitName(PUNIT_NAME);
		return oDataJPAContext;
	}
	
}
