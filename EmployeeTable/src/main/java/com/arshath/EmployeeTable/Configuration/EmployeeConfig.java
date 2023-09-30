package com.arshath.EmployeeTable.Configuration;


import com.arshath.EmployeeTable.Model.Employees;
import com.arshath.EmployeeTable.Repository.EmployeesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            EmployeesRepository repository) {
        return args -> {

            Employees Employee1 = new Employees(
                    "Arshath",
                    LocalDate.of(1993, Month.SEPTEMBER, 1),
                    "arshath@gmail.com",
                    "1234567890"
            );

            repository.saveAll(List.of(Employee1));


        };

    }

}
