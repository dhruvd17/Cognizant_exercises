package com.employee.EmployeeManagementSystem.service;

import com.employee.EmployeeManagementSystem.entity.Country;
import com.employee.EmployeeManagementSystem.repository.CountryRepository;
import com.employee.EmployeeManagementSystem.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country Not Found");
        }

        return result.get();
    }

    @Transactional
public void addCountry(Country country) {
    countryRepository.save(country);
}
@Transactional
public void updateCountry(String code, String name) throws CountryNotFoundException {

    Country country = findCountryByCode(code);

    country.setName(name);

    countryRepository.save(country);
}
@Transactional
public void deleteCountry(String code) {
    countryRepository.deleteById(code);
}   
}