package com.StudentPortalRest.StudentPortalRest.entity;

final public class Events {
    private String event;
    private String datefrom;
    private String dateto;
	public Events(String ev, String datefrom,String dateto) {
		super();
		this.event = ev;
		this.datefrom = datefrom;
		this.dateto = dateto;
		
	}
	@Override
	public String toString() {
		return "Event Added [event=" + event + ", datefrom=" + datefrom + ", dateto=" + dateto + "]";
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(String datefrom) {
		this.datefrom = datefrom;
	}
	public String getDateto() {
		return dateto;
	}
	public void setDateto(String dateto) {
		this.dateto = dateto;
	}
	
	public static String getevents(String sevent,String datefrom,String dateto) {

		return "event : "+sevent+" / starting Date : "+datefrom+" / Ending Date : "+dateto;
	}
  
}