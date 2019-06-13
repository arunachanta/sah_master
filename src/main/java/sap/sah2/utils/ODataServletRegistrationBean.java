package sap.sah2.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.stereotype.Component;

@Component
public class ODataServletRegistrationBean extends ServletRegistrationBean {
	@Autowired
	public ODataServletRegistrationBean(SpringEnabledOdataServlet oDataServlet) {
		super(oDataServlet, "/sah.svc/*");
	}

}
