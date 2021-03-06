package com.anhtuan.store.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class RoleEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
