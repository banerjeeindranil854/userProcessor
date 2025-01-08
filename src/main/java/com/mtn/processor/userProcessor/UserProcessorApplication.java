package com.mtn.processor.userProcessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = {"com.mtn.processor",
		"com.mtn.publicConnector.backend.mtnBackendConnectorUserProfile.connector",
		"com.mtn.publicConnector.backend.mtnBackendConnectorUserProfile.controller",
		"com.mtn.publicConnector.backend.mtnBackendConnectorUserProfile.config"
})
public class UserProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProcessorApplication.class, args);
	}

}
