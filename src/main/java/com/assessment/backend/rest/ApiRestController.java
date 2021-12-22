package com.assessment.backend.rest;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.backend.model.Countries;
import com.assessment.backend.model.CountriesDTO;
import com.assessment.backend.repository.CountryRepository;


@RestController
@RequestMapping("/api")
public class ApiRestController {
	
	@Autowired
	CountryRepository countryRepo;
	
	@GetMapping(value = "/getall")
	public List<Countries> getall(){
		return countryRepo.findAll();
	}
	
	@GetMapping(value = "/getall/{id}")
	public Countries getid(@PathVariable Integer id){
		return countryRepo.findById(id).orElse(null);
	}
	
	@PostMapping(value = "/save")
	public Countries saveNewCountry(@ModelAttribute("country") Countries country){
		return countryRepo.save(country);
	}
	
	@PostMapping(value = "/update/{id}")
	public boolean updateCountry(@PathVariable Integer id, @ModelAttribute("country") CountriesDTO country){
		Optional<Countries> c = countryRepo.findById(id);
		Countries oldCountry;
		if(c.isEmpty()) {
			return false;
		}else {
			oldCountry = c.get();
		}
		Optional.ofNullable(country.getCapital()).ifPresent(newC -> oldCountry.setCapital(newC));
		Optional.ofNullable(country.getId_language()).ifPresent(newC -> oldCountry.setId_language(newC));
		Optional.ofNullable(country.getName_country()).ifPresent(newC -> oldCountry.setName_country(newC));
		Optional.ofNullable(country.getPopulation()).ifPresent(newC -> oldCountry.setPopulation(newC));
		
		countryRepo.save(oldCountry);
		
		return true;
	}
	
	@GetMapping(value = "/delete/{id}")
	public void delete(@PathVariable Integer id){
		countryRepo.findById(id).ifPresentOrElse(c -> countryRepo.delete(c), null);
	}
}
