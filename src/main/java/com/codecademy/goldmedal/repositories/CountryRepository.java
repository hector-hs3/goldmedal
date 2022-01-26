package com.codecademy.goldmedal.repositories;


import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
  
}
