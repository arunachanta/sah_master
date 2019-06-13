package sap.sah2.utils;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.olingo.odata2.api.ODataServiceFactory;  
import org.apache.olingo.odata2.core.servlet.ODataServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringEnabledOdataServlet extends ODataServlet {
    private static final long serialVersionUID = -2082253378482260378L;

    private final ApplicationContext applicationContext;

    public SpringEnabledOdataServlet(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        ODataServiceFactory oDataServiceFactory = applicationContext.getBean(ODataServiceFactory.class);
        req.setAttribute(ODataServiceFactory.FACTORY_INSTANCE_LABEL, oDataServiceFactory);
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

}
