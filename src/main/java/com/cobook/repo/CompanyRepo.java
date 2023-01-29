package com.cobook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cobook.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long>{
    
    
    @Query(value="select * from company where email=?1 and password=?2", nativeQuery = true)
    public Company findByEmailAndPassword(String email, String password);
    
}
