package com.opteamix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;


@SpringBootApplication
public class ApplicationStarter{

	public static void main(String[] args) {	
		SpringApplication.run(ApplicationStarter.class); //this kickstarts spring application 
		// which can handle client request,scan all the components, front controller	
	}
	
	@Bean
	public HibernateJpaSessionFactoryBean createFactory() {
		return new HibernateJpaSessionFactoryBean();
	}

}
