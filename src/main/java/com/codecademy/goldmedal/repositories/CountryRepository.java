package com.codecademy.goldmedal.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
  
  public Optional<Country> findByName(String name);
  
  public List<Country> findAllByOrderByNameAsc();
  public List<Country> findAllByOrderByNameDesc();

  public List<Country> findAllByOrderByGdpAsc();
  public List<Country> findAllByOrderByGdpDesc();

  public List<Country> findAllByOrderByPopulationAsc();
  public List<Country> findAllByOrderByPopulationDesc();
}
