package com.patrykscheffler.magenda.model;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String location;
    private Integer duration;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date eventdate;
    @DateTimeFormat(iso=DateTimeFormat.ISO.TIME)
    private Time eventtime;

    public Event() {}

    public Event(String name, String description, String location, Integer duration, Date eventdate, Time eventtime) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.duration = duration;
        this.eventdate = eventdate;
        this.eventtime = eventtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public Time getEventtime() {
        return eventtime;
    }

    public void setEventtime(Time eventtime) {
        this.eventtime = eventtime;
    }
}
