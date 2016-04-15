package com.patrykscheffler.magenda.controller;

import com.patrykscheffler.magenda.model.Event;
import com.patrykscheffler.magenda.repository.EventRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "events", method = RequestMethod.GET)
    public List<Event> list() {
        return eventRepository.findAll();
    }

    @RequestMapping(value = "events", method = RequestMethod.POST)
    public Event create(@RequestBody Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @RequestMapping(value = "events/{id}", method = RequestMethod.GET)
    public Event get(@PathVariable Long id) {
        return eventRepository.findOne(id);
    }

    @RequestMapping(value = "events/{id}", method = RequestMethod.PUT)
    public Event update(@PathVariable Long id, @RequestBody Event event) {
        Event existingEvent = eventRepository.findOne(id);
        BeanUtils.copyProperties(event, existingEvent);
        return eventRepository.saveAndFlush(existingEvent);
    }

    @RequestMapping(value = "events/{id}", method = RequestMethod.DELETE)
    public Event delete(@PathVariable Long id) {
        Event existingEvent = eventRepository.findOne(id);
        eventRepository.delete(existingEvent);
        return existingEvent;
    }

}
