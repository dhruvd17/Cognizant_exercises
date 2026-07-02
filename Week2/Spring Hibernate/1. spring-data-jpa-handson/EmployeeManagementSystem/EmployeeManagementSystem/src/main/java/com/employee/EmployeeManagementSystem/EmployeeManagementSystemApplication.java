package com.employee.EmployeeManagementSystem;

import com.employee.EmployeeManagementSystem.entity.Country;
import com.employee.EmployeeManagementSystem.service.CountryService;
import com.employee.EmployeeManagementSystem.service.exception.CountryNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {

        ApplicationContext context =
                SpringApplication.run(EmployeeManagementSystemApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testDeleteCountry();
    }

    private static void testDeleteCountry() {

        Country country = new Country();
        country.setCode("NP");
        country.setName("Nepal");

        countryService.addCountry(country);

        countryService.deleteCountry("NP");

        try {
            System.out.println(countryService.findCountryByCode("NP"));
        } catch (CountryNotFoundException e) {
            System.out.println("Country deleted successfully");
        }
    }
}