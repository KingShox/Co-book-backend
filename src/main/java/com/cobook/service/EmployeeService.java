package com.cobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobook.entity.Employee;
import com.cobook.repo.EmployeeRepo;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepo employeeRepo;


    public Employee registerEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee signInEmployee(String companyEmail, String password){
        return employeeRepo.getByCompanyEmailAndPassword(companyEmail,password);
    }

    public List<Employee>viewAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployeeById(Employee employee) throws Exception{
        if(employee.getId() == null){
            throw new Exception("EMPLOYEE NOT FOUN");
        }
        return employeeRepo.save(employee);
    }
    public Employee getEmployeeById(Long id){
        return employeeRepo.findById(id).get();
    }
    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }
    public Employee findByEmployeeCompanyEmail(String companyEmail){
        return employeeRepo.getCompanyEmail(companyEmail);
    }
    
}
