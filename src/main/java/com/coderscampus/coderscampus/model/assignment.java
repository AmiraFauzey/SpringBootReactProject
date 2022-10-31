package com.coderscampus.coderscampus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class assignment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	private String githubUrl;
	private String branch;
	private String codeReviewVideoUrl;
	
	@ManyToOne(optional = false)
	private User user;
	
}
