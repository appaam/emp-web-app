package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.Test;

public class HelloWorldOldTest {
	
	
	@Test
	void testSayNoHello() {		
		HelloWorld helloWorld=new HelloWorld();
		assertNotEquals("No Hello World!",helloWorld.sayHello());
	}
}
