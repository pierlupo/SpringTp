package com.Spring.TP.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private long id;
    private String lastname;
    private String firstname;

}
