package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.dao.CountryDao;

@Service
public class CountryService {

    @Autowired
    private CountryDao dao;

    public List<Country> getAllCountries() {
        return dao.getAllCountries();
    }

    public Country getCountry(String code) {
        return dao.getCountry(code);
    }
}   