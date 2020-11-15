package com.WCF.Insurance.FutureRequestFeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.WCF.Insurance.FutureRequestFeatures.Dao")
@EnableSwagger2
public class App {
	
	//following commented code is to use autowired in main.
//	@Bean
//	  FeatureRequest fr() {
//		return new FeatureRequest();
//	}
//	
//	static FeatureRequest fr;
//	
//	@Autowired
//	public void fr(FeatureRequest fr) {
//		App.fr =  fr;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		//fr.print();
	}
	
	
}