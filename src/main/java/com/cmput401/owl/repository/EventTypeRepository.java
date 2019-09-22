package com.cmput401.owl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmput401.owl.model.EventType;


@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Integer> {

	
}
