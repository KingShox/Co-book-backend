package com.cobook.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="venue")
    private String venue;

    @Column(name="theme")
    private String theme;

    @Column(name="day")
    private LocalDate day;

    @Column(name="time")
    private String time;

    @Column(name="type_of_event")
    private String typeOfEvent;

    @Column(name="event_detail")
    private String eventDetail;


    @ManyToMany
    @JoinTable(
        name="employee_event",
        joinColumns ={
            @JoinColumn(name="event_id", referencedColumnName = "id")
        },
        inverseJoinColumns ={
            @JoinColumn(name="employee_id", referencedColumnName = "id")
        }
    )
    List<Employee> event;



    

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public List<Employee> getEvent() {
        return event;
    }

    public void setEvent(List<Employee> event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", venue=" + venue + ", theme=" + theme + ", day=" + day
                + ", time=" + time + ", typeOfEvent=" + typeOfEvent + ", eventDetail=" + eventDetail + "]";
    }

    
    
    
}
