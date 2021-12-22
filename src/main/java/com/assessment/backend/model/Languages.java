package com.assessment.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Languages {
	
	@Id
	private Integer id_language;
	
	@Column
	private String name_language;

	public Integer getId_language() {
		return id_language;
	}

	public void setId_language(Integer id_language) {
		this.id_language = id_language;
	}

	public String getName_language() {
		return name_language;
	}

	public void setName_language(String name_language) {
		this.name_language = name_language;
	}
	
	
}

