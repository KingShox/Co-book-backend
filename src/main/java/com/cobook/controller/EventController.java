package com.cobook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cobook.entity.Event;
import com.cobook.service.EventService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class EventController {



    @Autowired
    EventService eventService;

  @RequestMapping(
    value="/createEvent",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.POST
  )
  public ResponseEntity<Object> createEvent(@RequestBody Event event) {
      try {
        Event createEvent = eventService.createEvent(event);
        return new ResponseEntity<>(createEvent,HttpStatus.CREATED);
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
      }catch(Error e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
  @RequestMapping(
    value="/viewAllEvent",
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.GET
  )
  public ResponseEntity<Object> viewAllEvent(){
    try {
        List<Event> viewAllEvent = eventService.viewAllEvent();
        return new ResponseEntity<>(viewAllEvent,HttpStatus.OK);
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        
    }catch(Error e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @RequestMapping(
    value="/updateEventById",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.POST
  )
  public ResponseEntity<Object> updateEventById(@RequestBody Event event) {
      try {
        Event updateEventById = eventService.updateEventById(event);
        return new ResponseEntity<>(updateEventById,HttpStatus.OK);
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
      }catch(Error e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }

  @RequestMapping(
    value="/getEventById/{eventId}",
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.GET
  )
  public ResponseEntity<Object> getEventById(@PathVariable Long eventId) {
      try {
        Event getEventById = eventService.getEventById(eventId);
        return new ResponseEntity<>(getEventById,HttpStatus.OK);
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
      }catch(Error e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }

  @RequestMapping(
    value = "/deleteEventById/{eventId}",
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.DELETE
  )

  public ResponseEntity<Object> deleteEventById(@PathVariable Long eventId){
    try{
        eventService.deleteEventById(eventId);
        return new ResponseEntity<>(HttpStatus.OK);
    }catch (Exception e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);

    }catch(Error e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
 

}
