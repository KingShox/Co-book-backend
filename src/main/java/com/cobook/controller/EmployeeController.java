package com.cobook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobook.entity.Employee;
import com.cobook.service.EmployeeService;



import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @RequestMapping(
        value = "/registerEmployee",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> registerEmployee(@RequestBody Employee employee){
        try {
            Employee registerEmployee = employeeService.registerEmployee(employee);
            return new ResponseEntity<>(registerEmployee, HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value = "/signInEmployee",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> signInEmployee(@RequestBody Employee employee){
        try{
            Employee signInEmployee = employeeService.signInEmployee(employee.getCompanyEmail(),employee.getPassword());
            return new ResponseEntity<>(signInEmployee,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @RequestMapping(
        value = "/updateEmployeeById",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> updateEmployeeById(@RequestBody Employee employee){
        try{
            Employee updateEmployeeById = employeeService.updateEmployeeById(employee);
            return new ResponseEntity<>(updateEmployeeById,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value = "/getEmployeeById/{employeeId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> updateEmployeeById(@PathVariable Long employeeId){
        try{
            Employee getEmployeeById = employeeService.getEmployeeById(employeeId);
            return new ResponseEntity<>(getEmployeeById,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(
        value = "viewAllEmployee",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewAllEmployee(){
        try{
        List<Employee> viewAllCompany = employeeService.viewAllEmployee();
        
        return new ResponseEntity<>(viewAllCompany,HttpStatus.OK);

        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/deleteEmployeeById/{employeeId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable Long employeeId){
        try{
            employeeService.deleteEmployeeById(employeeId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value = "/getEmpolyeeCompanyEmail/{companyEmail}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getEmployeeCompanyEmail(@PathVariable String companyEmail){
        try{
           Employee getEmployeeCompanyEmail = employeeService.findByEmployeeCompanyEmail(companyEmail);
           return new ResponseEntity<>(getEmployeeCompanyEmail,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
