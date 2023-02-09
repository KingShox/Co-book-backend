package com.cobook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cobook.entity.News;

@Repository
public interface NewsRepo extends JpaRepository<News,Integer> {
    
}
