package com.api.bookme.customer.service.domain;

import com.api.bookme.customer.service.domain.create.CreateCustomerCommand;
import com.api.bookme.customer.service.domain.create.CreateCustomerResponse;
import com.api.bookme.customer.service.domain.event.CustomerCreatedEvent;
import com.api.bookme.customer.service.domain.ports.input.service.CustomerApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class CustomerApplicationServiceImpl implements CustomerApplicationService {
    private final CustomerCreateCommandHandler customerCreateCommandHandler;

    @Override
    public CreateCustomerResponse createCustomer(CreateCustomerCommand createCustomerCommand) {
        CustomerCreatedEvent customerCreatedEvent = customerCreateCommandHandler
        return null;
    }
}
