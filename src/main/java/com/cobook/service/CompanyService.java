package com.cobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobook.entity.Company;
import com.cobook.repo.CompanyRepo;



@Service
public class CompanyService {

    @Autowired
    CompanyRepo companyRepo;

    public Company registerCompany(Company company){
        return companyRepo.save(company);
    }

    public Company signInCompany(Company company){
        return companyRepo.findByEmailAndPassword(company.getEmail(), company.getPassword());
    }
    public List<Company> viewAllCompnay(){
        return companyRepo.findAll();
    }
    public Company updateCompanyById(Company company) throws Exception{
        if(company.getId() == null){
            throw new Exception("COMPANY NOT FOUND");
        }
        return companyRepo.save(company);
    }
    public Company getCompanyById(Long id){
        return companyRepo.findById(id).get();
    }


    public void deleteCompanyById(Long id){
        companyRepo.deleteById(id);
    }
    public Company getCompanyByName(String name) throws Exception{
        
        Company company = companyRepo.getCompanyByName(name);
        if(company == null ){
            throw new Exception("COMPANY NOT FOUND");
        
        }else{
            return company;
        }

    }
    
}
