package com.api.bookme.customer.service.domain.ports.input.service;

import com.api.bookme.customer.service.domain.create.CreateCustomerCommand;
import com.api.bookme.customer.service.domain.create.CreateCustomerResponse;
import jakarta.validation.Valid;

public interface CustomerApplicationService {
    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);
}
