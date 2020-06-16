package com.fms.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.fms.domain.User;

import reactor.core.publisher.Mono;


public interface UserRepository extends ReactiveCrudRepository<User, Long>{
	

}
