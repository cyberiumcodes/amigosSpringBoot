package com.example.demo.customer;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private Long id;
    private String name;
}
