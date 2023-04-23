package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "USERSS")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name ="idUser")
	private Long idUser;
	
	@Column (name = "firstName")
	private String firstName;
	
	@Column (name = "lastName")
	private String lastName;
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name = "emailUser")
	private String emailUser;
	
	@Column (name = "password")
	private String password;
	
	@Column (name = "dateBirthday")
	private Date dateBirthdaay;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Long idUser, String firstName, String lastName, String phone, String emailUser, String password) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailUser = emailUser;
		this.password = password;
	}


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmailUser() {
		return emailUser;
	}


	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getDateBirthdaay() {
		return dateBirthdaay;
	}


	public void setDateBirthdaay(Date dateBirthdaay) {
		this.dateBirthdaay = dateBirthdaay;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
