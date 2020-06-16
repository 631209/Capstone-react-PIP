package com.fms.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.fms.domain.Event;
import com.fms.domain.EventEmployee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventEmployeeRepository extends ReactiveCrudRepository<EventEmployee, Long>{
	@Query("select * from events_employees where event_id= ?")
	public Flux<EventEmployee> findByEventId(String eventId);
}
