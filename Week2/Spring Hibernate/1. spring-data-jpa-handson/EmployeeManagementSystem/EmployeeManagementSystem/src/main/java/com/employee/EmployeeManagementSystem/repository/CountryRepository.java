package com.employee.EmployeeManagementSystem.repository;

import com.employee.EmployeeManagementSystem.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}