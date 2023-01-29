package com.cobook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cobook.entity.Event;

@Repository
public interface EventRepo extends JpaRepository<Event,Long> {
    
}
