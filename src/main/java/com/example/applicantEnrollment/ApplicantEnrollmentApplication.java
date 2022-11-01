package com.example.applicantEnrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApplicantEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicantEnrollmentApplication.class, args);
	}

}
