package com.cobook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cobook.entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile,Long>{
    
}
