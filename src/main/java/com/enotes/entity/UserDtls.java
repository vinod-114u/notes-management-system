package com.enotes.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
public class UserDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "full_name",nullable = false)
	private String name;
	@Column(unique = true,nullable = false)
	private String email;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String about;
	private String role;
	
	public UserDtls() {
		// TODO Auto-generated constructor stub
	}

}