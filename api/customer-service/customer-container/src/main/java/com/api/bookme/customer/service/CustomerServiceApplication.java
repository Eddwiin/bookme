package com.api.bookme.customer.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {  "com.api.bookme.customer.service.dataaccess", "com.api.bookme.customer.service.dataaccess"})
@EntityScan(basePackages = { "com.api.bookme.customer.service.dataaccess", "com.api.bookme.customer.service.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.api.bookme")
public class CustomerServiceApplication {
}
