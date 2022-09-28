package com.educandoweb.course.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
