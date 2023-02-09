package com.cobook.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private String date;

    @Column(name = "news")
    private String news;

    @ManyToMany
    @JoinTable(name = "employee_news", joinColumns = {
            @JoinColumn(name = "news_id", referencedColumnName = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "employee_id", referencedColumnName = "id")
    })
    List<Employee> event;

public News() {
}

public Integer getId() {
        return id;
}


public String getTitle() {
        return title;
}

public void setTitle(String title) {
        this.title = title;
}

public String getDate() {
        return date;
}

public void setDate(String date) {
        this.date = date;
}

public String getNews() {
        return news;
}

public void setNews(String news) {
        this.news = news;
}

public List<Employee> getEvent() {
        return event;
}

public void setEvent(List<Employee> event) {
        this.event = event;
}

@Override
public String toString() {
        return "News [id=" + id + ", title=" + title + ", date=" + date + ", news=" + news + ", event=" + event + "]";
}

    

}
