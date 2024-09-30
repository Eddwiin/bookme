package com.api.bookme.customer.service.domain.event;

import com.api.bookme.customer.service.domain.entity.Customer;
import com.api.bookme.domain.event.DomainEvent;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class CustomerCreatedEvent implements DomainEvent<Customer> {
    private final Customer customer;
    private final ZonedDateTime createdAt;

    public CustomerCreatedEvent(Customer customer, ZonedDateTime createdAt) {
        this.customer = customer;
        this.createdAt = createdAt;
    }
}
