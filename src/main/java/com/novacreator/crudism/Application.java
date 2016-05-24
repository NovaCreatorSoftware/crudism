package com.novacreator.crudism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(exclude = VelocityAutoConfiguration.class)
public class Application extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	private static ConfigurableApplicationContext context;
	private static String contextPath;
	
	//to deploy as a WAR
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
        context = SpringApplication.run(Application.class, args);
        contextPath = ((ServerProperties)context.getBean("serverProperties")).getContextPath();
        LOGGER.info("######## CRUDISM UP UP UP ########");
    }
	
	public static ConfigurableApplicationContext getContext() {
		return context;
	}
	
	public static String getContextPath() {
		return contextPath;
	}
}
