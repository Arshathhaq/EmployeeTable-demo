package com.arshath.EmployeeTable.Controller;


import com.arshath.EmployeeTable.Model.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:8080")
public class EmployeeController {

    private final ControllerService  conService;

    public EmployeeController(ControllerService conService) {
        this.conService = conService;
    }

    //Add Employee
    @PostMapping("/add")
    public  String addEmployee(
            @RequestBody Employees employee) {
        conService.addEmployee(employee);
        return "Added Successfully...";
    }

    //Gets all Employees
    @GetMapping("/get")
    public List<Employees> getEmployeesDetail() {
        return conService.getEmployees();
    }


    //getEmployeeById
    @RequestMapping("/get/{id}")
    public List<Employees> getEmployee(@PathVariable("id") Integer Id){
        return conService.getEmployeeById(Id);
    }

    //Deletes
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(
            @PathVariable("id") Integer Id){
        conService.deleteEmployee(Id);
        return "Deleted Successfully....";
    }

    //Updates
    @PutMapping("/update/{id}")
    public String updateEmployee(
            @PathVariable("id") Integer Id,
            @RequestBody Employees employee
    ){
        conService.updateEmployee(Id,employee);
        return "Updated Successfully...";
    }






}
