package com.arshath.EmployeeTable.Controller;

import com.arshath.EmployeeTable.Model.Employees;
import com.arshath.EmployeeTable.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Component
public class ControllerService {

    private final EmployeesRepository employeesRepository;
    @Autowired
    public ControllerService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    //Adds Employee
    public void addEmployee(Employees employee){
        employeesRepository.save(employee);
    }

    //Gets all employees
    public  List<Employees> getEmployees() {
        return  employeesRepository.findAll();
    }

    //Gets particular Employee Using emId
    @SuppressWarnings(value = "OptionalGetWithoutIsPresent")
    public List<Employees> getEmployeeById(Integer Id){
        return (List<Employees> )employeesRepository.findById(Id).get();

    }

    //Deletes Employee using emId
    public void deleteEmployee(Integer Id){
        employeesRepository.deleteById(Id);
    }

    //Updates Employee information
    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Transactional
    public void updateEmployee(Integer Id, Employees employee){
        Employees employeeDetails = employeesRepository.findById(Id).get();
        employeeDetails.setEmName(employee.getEmName());
        employeeDetails.setEmDob(employee.getEmDob());
        employeeDetails.setEmEmail(employee.getEmEmail());
        employeeDetails.setEmPhone(employee.getEmPhone());
    }


}
