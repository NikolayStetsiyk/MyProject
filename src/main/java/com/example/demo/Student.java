package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Student {
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
	
}
