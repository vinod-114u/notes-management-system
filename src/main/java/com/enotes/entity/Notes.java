 package com.enotes.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "notes")
public class Notes extends Audit {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	//@Column(nullable = false)
	private String title;

	//@Column(nullable = false)
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public UserDtls getUserDtls() {
		return userDtls;
	}

	public void setUserDtls(UserDtls userDtls) {
		this.userDtls = userDtls;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private UserDtls userDtls;

	public Notes() {
		// TODO Auto-generated constructor stub
	}
}
