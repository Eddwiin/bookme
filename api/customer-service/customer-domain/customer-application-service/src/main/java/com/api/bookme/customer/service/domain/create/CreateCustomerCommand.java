package com.api.bookme.customer.service.domain.create;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateCustomerCommand {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final String userName;
    @NotNull
    private final String firstName;
    @NotNull
    private final String lastName;
}
