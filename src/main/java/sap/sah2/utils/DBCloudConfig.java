package sap.sah2.utils;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.eclipse.persistence.config.PersistenceUnitProperties;
//import org.eclipse.persistence.config.*;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Profile({ "SAHCloud" })
public class DBCloudConfig extends AbstractCloudConfig {
	@Primary
	@Bean(name="oneOfManyDataSources")
    public DataSource dataSource()
    {
        return connectionFactory().dataSource();
    }
    
    @Bean
    public JpaVendorAdapter eclipselink()
    {
        return new EclipseLinkJpaVendorAdapter();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean emf(JpaVendorAdapter adapter, DataSource ds, Environment env)		
    {
//    	String PUNIT = "sah";
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(adapter);
        factory.setDataSource(ds);
        factory.setPersistenceUnitName(SAHOdataServiceFactory.PUNIT_NAME);
        factory.setJpaPropertyMap(getJpaProperties());
        return factory;
    }

    @Bean 
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf)
    {
        return new JpaTransactionManager(emf);
    }
    
    private Map<String, String> getJpaProperties() {
        Map<String, String> map = new HashMap();
        map.put("eclipselink.ddl-generation", "none");   //===============================
        map.put(PersistenceUnitProperties.TARGET_DATABASE,"HANA");
        map.put("eclipselink.cache.shared.default", "false");
        return map;
    }

}
