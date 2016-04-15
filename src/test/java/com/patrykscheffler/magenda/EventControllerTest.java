package com.patrykscheffler.magenda;

import com.patrykscheffler.magenda.controller.EventController;
import com.patrykscheffler.magenda.model.Event;
import com.patrykscheffler.magenda.repository.EventRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class EventControllerTest {

    @InjectMocks
    EventController eventController;

    @Mock
    EventRepository eventRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEventGet() {
        Event ev = new Event();
        ev.setId(1L);
        when(eventRepository.findOne(1L)).thenReturn(ev);

        Event event = eventController.get(1L);
        assertThat(event.getId(), is(1L));
    }

    @Test
    public void testEventCreate() {
        Event ev = new Event();
        ev.setId(1L);
        when(eventRepository.saveAndFlush(ev)).thenReturn(ev);

        Event event = eventController.create(ev);
        assertThat(event.getId(), is(1L));
    }

    @Test
    public void testEventUpdate() {
        Event ev = new Event();
        ev.setId(1L);
        when(eventRepository.findOne(1L)).thenReturn(ev);
        when(eventRepository.saveAndFlush(ev)).thenReturn(ev);

        Event event = eventController.update(1L, ev);
        assertThat(event.getId(), is(1L));
    }

    @Test
    public void testEventDelete() {
        Event ev = new Event();
        ev.setId(1L);
        when(eventRepository.findOne(1L)).thenReturn(ev);

        Event event = eventController.delete(1L);
        assertThat(event.getId(), is(1L));
    }

    @Test
    public void testEventList() {
        List<Event> el = new ArrayList<>();
        when(eventRepository.findAll()).thenReturn(el);

        List<Event> eventList = eventController.list();
        assertThat(eventList.size(), is(0));
    }

}
