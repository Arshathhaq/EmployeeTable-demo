package com.arshath.EmployeeTable.Repository;

import com.arshath.EmployeeTable.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

//Connects with Database using Spring Data JPA
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {


}
