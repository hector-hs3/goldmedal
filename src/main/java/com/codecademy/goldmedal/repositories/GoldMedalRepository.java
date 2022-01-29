package com.codecademy.goldmedal.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.GoldMedal;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
  
  public List<GoldMedal> findByCountryOrderByYearAsc(String country);
  public List<GoldMedal> findByCountryOrderByYearDesc(String country);

  public List<GoldMedal> findByCountryOrderBySeasonAsc(String country);
  public List<GoldMedal> findByCountryOrderBySeasonDesc(String country);

  public List<GoldMedal> findByCountryOrderByCityAsc(String country);
  public List<GoldMedal> findByCountryOrderByCityDesc(String country);

  public List<GoldMedal> findByCountryOrderByNameAsc(String country);
  public List<GoldMedal> findByCountryOrderByNameDesc(String country);

  public List<GoldMedal> findByCountryOrderByEventAsc(String country);
  public List<GoldMedal> findByCountryOrderByEventDesc(String country);

  public int countByCountry(String country);
  public int countBySeason(String season);
  public List<GoldMedal> findByCountryAndGender(String country, String gender);
  public List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String country, String season);
  
}
