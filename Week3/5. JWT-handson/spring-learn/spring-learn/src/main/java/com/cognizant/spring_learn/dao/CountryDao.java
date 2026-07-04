package com.cognizant.spring_learn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.Country;

@Repository
public class CountryDao {

    private static List<Country> countryList = new ArrayList<>();

    public CountryDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countryList.add(context.getBean("country", Country.class));

        Country us = new Country();
        us.setCode("US");
        us.setName("United States");

        Country de = new Country();
        de.setCode("DE");
        de.setName("Germany");

        Country jp = new Country();
        jp.setCode("JP");
        jp.setName("Japan");

        countryList.add(us);
        countryList.add(de);
        countryList.add(jp);
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountry(String code) {

        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}