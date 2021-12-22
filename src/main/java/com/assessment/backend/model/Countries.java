package com.assessment.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Countries {
	
	@Id
	private Integer id_country;
	
	@Column
	private String name_country;
	
	@Column
	private String capital;
	
	@Column 
	private Integer population;
	
	@Column
	private Integer id_language;

	public Integer getId_country() {
		return id_country;
	}

	public void setId_country(Integer id_country) {
		this.id_country = id_country;
	}

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getId_language() {
		return id_language;
	}

	public void setId_language(Integer id_language) {
		this.id_language = id_language;
	}

	

	
	
}
