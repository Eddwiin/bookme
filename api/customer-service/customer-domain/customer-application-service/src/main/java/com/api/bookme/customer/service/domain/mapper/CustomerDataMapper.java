package com.api.bookme.customer.service.domain.mapper;

import com.api.bookme.customer.service.domain.create.CreateCustomerCommand;
import com.api.bookme.customer.service.domain.entity.Customer;
import com.api.bookme.domain.valueobject.CustomerId;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataMapper {
    public Customer createCustomerCommandToCustomer(CreateCustomerCommand createCustomerCommand) {
        return new Customer(
                new CustomerId(createCustomerCommand.getCustomerId()),
                createCustomerCommand.getUserName(),
                createCustomerCommand.getFirstName(),
                createCustomerCommand.getLastName()
        );
    }
}
