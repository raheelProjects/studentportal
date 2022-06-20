package com.StudentPortalRest.StudentPortalRest.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EventsTest {

	@Test
	void test() {
		assertEquals("event : final papers / starting Date : 28-06-2022 / Ending Date : 8-07-2022",
				Events.getevents("final papers","28-06-2022", "8-07-2022"));
	}

}
