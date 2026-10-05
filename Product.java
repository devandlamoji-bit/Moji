package com.bakehub.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; private String description; @Column(nullable=false) private Double price; private String imageUrl; private boolean active=true; }
