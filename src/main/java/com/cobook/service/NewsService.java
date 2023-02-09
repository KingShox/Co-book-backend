package com.cobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobook.entity.News;
import com.cobook.repo.NewsRepo;

@Service
public class NewsService {

    @Autowired
    NewsRepo newsRepo;

    public News createNews(News news){
        return newsRepo.save(news);
    }

    public List<News> viewAllNews(){
        return newsRepo.findAll();
    }

    public void deleteNews(Integer id){
        newsRepo.deleteById(id);
    }
    public News getNewsById(Integer id){
        return newsRepo.findById(id).get();
    }
    
    
}
