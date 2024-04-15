package com.springchallengecrud.project3.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Required field")
    private String name;

    @NotBlank(message = "Required field")
    private String cpf;

    @Positive(message = "Income must be positive")
    private Double income;

    @NotBlank(message = "Required field")
    private LocalDate birthDate;

    private Integer children;

//    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
//        this.id = id;
//        this.name = name;
//        this.cpf = cpf;
//        this.income = income;
//        this.birthDate = birthDate;
//        this.children = children;
//    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
