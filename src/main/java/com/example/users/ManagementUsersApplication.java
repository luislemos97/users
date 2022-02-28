package com.example.users;

import com.example.users.integration.api.AddressApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ManagementUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementUsersApplication.class, args);
	}

	@Autowired
	private AddressApi addressApi;

}
