package com.fms.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;

import com.fms.domain.Event;

public interface ExcelToDbRepository extends ReactiveCrudRepository<Event, Long>{

	@Query("select * from events where event_id=?")
	Mono<Event> findByEventId(String eventId);

}
