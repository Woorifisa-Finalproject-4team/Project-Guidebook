package com.example.backend.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Calculate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    public int num1;
    @Column
    public int num2;
    @Column
    public int result;
}
