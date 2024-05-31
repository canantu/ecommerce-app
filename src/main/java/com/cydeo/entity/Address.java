package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity{

    private String name;
    private String zipCode;
    private String street;

    @ManyToOne
    private Customer customer;
}
