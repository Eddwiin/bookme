package com.api.bookme.customer.service.domain;

import com.api.bookme.customer.service.domain.create.CreateCustomerCommand;
import com.api.bookme.customer.service.domain.event.CustomerCreatedEvent;
import com.api.bookme.customer.service.domain.mapper.CustomerDataMapper;
import com.api.bookme.customer.service.domain.ports.output.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class CustomerCreateCommandHandler {
    private final CustomerDomainService customerDomainService;
    private final CustomerRepository customerRepository;
    private final CustomerDataMapper customerDataMapper;

    public CustomerCreateCommandHandler(CustomerDomainService customerDomainService, CustomerRepository customerRepository, CustomerDataMapper customerDataMapper) {
        this.customerDomainService = customerDomainService;
        this.customerRepository = customerRepository;
        this.customerDataMapper = customerDataMapper;
    }

    @Transactional
    public CustomerCreatedEvent createCustomer(CreateCustomerCommand createCustomerCommand) {
        
    }
}
