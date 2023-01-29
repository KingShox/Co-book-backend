package com.cobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobook.entity.Event;
import com.cobook.repo.EventRepo;

@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public Event createEvent(Event event){
        return eventRepo.save(event);
    }

    public Event updateEventById(Event event) throws Exception{
        if(event.getId() == null){
            throw new Exception("EVENT NOT FOUND");
        }
        return eventRepo.save(event);
    }
    public Event getEventById(Long id){
        return eventRepo.findById(id).get();
    }

    public List<Event>viewAllEvent(){
        return eventRepo.findAll();
    }

    public void deleteEventById(Long id){
        eventRepo.deleteById(id);
    }
    
}
