package com.sts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "journal")
public class Journal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String tittle;
	
	

	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Journal(int id, String tittle) {
		this.id = id;
		this.tittle = tittle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	
	
	
}
