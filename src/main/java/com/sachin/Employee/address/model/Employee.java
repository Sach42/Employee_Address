package com.sachin.Employee.address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private  String empFirstName;
    private String empLastName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
