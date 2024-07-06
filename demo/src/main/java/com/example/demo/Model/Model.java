package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;




@Entity
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @NotBlank
    private  String Name;
    private  String CollageName;
    private   String PhoneNo;
}
