package com.cobook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cobook.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{

    @Query(value="select * from employee where company_email=?1 and password=?2", nativeQuery = true)
    public Employee getByCompanyEmailAndPassword(String companyEmail, String password);

    @Query(value="select * from employee where company_email=?1", nativeQuery = true)
    public Employee getCompanyEmail(String companyEmail);
    
}
