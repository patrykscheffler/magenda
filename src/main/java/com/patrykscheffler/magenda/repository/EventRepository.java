package com.patrykscheffler.magenda.repository;

import com.patrykscheffler.magenda.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
