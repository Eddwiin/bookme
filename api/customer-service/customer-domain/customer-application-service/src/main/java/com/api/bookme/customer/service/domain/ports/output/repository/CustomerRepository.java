package com.api.bookme.customer.service.domain.ports.output.repository;

import com.api.bookme.customer.service.domain.entity.Customer;

public interface CustomerRepository {
    Customer createCustomer(Customer customer);
}
