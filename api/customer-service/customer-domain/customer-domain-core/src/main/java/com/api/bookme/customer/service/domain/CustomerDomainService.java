package com.api.bookme.customer.service.domain;

import com.api.bookme.customer.service.domain.entity.Customer;
import com.api.bookme.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);
}
