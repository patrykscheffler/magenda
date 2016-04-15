package com.patrykscheffler.magenda;

import com.patrykscheffler.magenda.model.Event;
import com.patrykscheffler.magenda.repository.EventRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AppConfig.class)
public class EventRepositoryIntegrationTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void testFindAll() {
        List<Event> events = eventRepository.findAll();
        assertThat(events.size(), is(greaterThanOrEqualTo(0)));
    }

}
