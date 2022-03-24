package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class HelloWorldNewTest {
	
	@Test
	void testSayHello() {		
		assertEquals("Hello World",new HelloWorld().sayHello(),()-> "sayHello() returns \"Hello World!\"");
	}
}
