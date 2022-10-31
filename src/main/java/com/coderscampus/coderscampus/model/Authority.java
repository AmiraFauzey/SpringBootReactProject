package com.coderscampus.coderscampus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Entity
public class Authority implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1722809961422851452L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String authority;
	@ManyToOne(optional=false)
	private User user;
	
	public Authority() {}
	public Authority(String authority) {
		this.authority = authority;
	}
	
}
