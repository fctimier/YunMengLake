package com.yun.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInit  implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        /*AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.setServletContext(servletContext);

        ctx.register(SpringMVCConfig.class);

        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc",new DispatcherServlet(ctx));

        springmvc.addMapping("/");

        springmvc.setLoadOnStartup(1);*/
        System.out.println("启动配置");
    }

}
