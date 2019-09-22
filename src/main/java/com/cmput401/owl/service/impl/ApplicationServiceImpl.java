package com.cmput401.owl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmput401.owl.model.EventType;
import com.cmput401.owl.repository.EventTypeRepository;
import com.cmput401.owl.service.ApplicationService;

@Service("applicationService")
public class ApplicationServiceImpl implements ApplicationService{

	
	@Autowired EventTypeRepository eventTypeRepository;
	
	@Override
	public List<EventType> getAllEventType() {
		// TODO Auto-generated method stub
		return eventTypeRepository.findAll();
	}

}
