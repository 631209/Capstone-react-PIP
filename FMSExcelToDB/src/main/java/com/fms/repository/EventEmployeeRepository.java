package com.fms.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.fms.domain.EventEmployee;

public interface EventEmployeeRepository extends ReactiveCrudRepository<EventEmployee, Long>{

}
