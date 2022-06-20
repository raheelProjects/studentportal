package com.StudentPortalRest.StudentPortalRest.services;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.stereotype.Service;


import com.StudentPortalRest.StudentPortalRest.entity.Events;

@Service
public class ImplementEvent implements EventService {
	
	Queue<Events> que;
	
	public ImplementEvent() {
		
		que = new LinkedList<Events>();
		

		que.add(new Events("SDA project submission","20-6-2022","20-6-2022"));
		que.add(new Events("HCI assignment","20-6-2022","20-6-2022"));
		que.add(new Events("Final papers","28-6-2022","9-7-2022"));
	}


	@Override
	public String addEvent(Events e) {
		que.add(e);
		return e.toString();
	}

	

	@Override
	public String deleteEvent() {
		que.remove();
		return "The event is removed";
	}


	@Override
	public Queue<Events> getEvents() {
		// TODO Auto-generated method stub
		return que;
	}

}
