package com.StudentPortalRest.StudentPortalRest.services;


import java.util.Queue;

import com.StudentPortalRest.StudentPortalRest.entity.Events;


public interface EventService {
	
public Queue<Events> getEvents();
	
	
	public String addEvent(Events e);
	
	
	public String deleteEvent();
}
