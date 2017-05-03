package com.yatra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {
    private String phoneNo;
    private String address;
}
