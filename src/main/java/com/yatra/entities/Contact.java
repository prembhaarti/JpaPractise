package com.yatra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "contact", catalog = "practise")
@AllArgsConstructor
public class Contact {

    @Id
    @Column(name = "phone_no", nullable = false)
    private String phoneNo;

    @Column(name = "address")
    private String address;
}
