package sap.sah2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import sap.sah2.entities.Demo_Enr;
import sap.sah2.entities.Demographics;
import sap.sah2.repository.CurrentContentPerStudentRepository;
//import sap.sah2.repository.Demo_EnrRepository;
import sap.sah2.repository.DemographicsRepository;


@RestController
@SpringBootApplication
@ComponentScan("sap.sah2")
@EntityScan("sap.sah2.entities")
public class Application extends SpringBootServletInitializer {
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    
	@Autowired
	CurrentContentPerStudentRepository CurrentContentPerStudentRepository;
	
/*	@Autowired
	DemographicsRepository demographicsRepository;*/
	
/*	@Autowired
	private Demo_EnrRepository demo_EnrRepository;

	
	@RequestMapping("/")
	public Iterable<Demo_Enr> demo_EnrRepository() {
		System.out.println(demo_EnrRepository.findAll());
		return (demo_EnrRepository.findAll());

	}*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println("In Main Method");
		
	}

	
}
