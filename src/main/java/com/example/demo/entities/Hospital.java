package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Hospital")
public class Hospital implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column (name = "idHospital")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "hospital")
	private List<User> users;
	
	public Hospital() {
		users = new ArrayList<>();
	}

	public Hospital(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
