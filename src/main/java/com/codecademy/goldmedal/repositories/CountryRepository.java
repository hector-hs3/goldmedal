package com.codecademy.goldmedal.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
  
  public Optional<Country> findByName(String name);
}
