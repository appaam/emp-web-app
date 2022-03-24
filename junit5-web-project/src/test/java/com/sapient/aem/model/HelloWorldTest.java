package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag(value = "HWT") //identifier of this test class
@DisplayName(value = "This is a sample test")
class HelloWorldTest {
	private HelloWorld helloWorld=null;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test methods");
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all test methods");
	}


	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test method");
		helloWorld= new HelloWorld();
	}


	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test method");
		helloWorld=null;
	}

	@Disabled
	@Test
	void testSayHello() {		
//		assertEquals("Hello World",helloWorld.sayHello(),"sayHello() returns \"Hello World!\"");
		assertEquals("Hello World",helloWorld.sayHello(),()-> "sayHello() returns \"Hello World!\"");
	}

	@Disabled
	@Test
	void testSayNoHello() {		
		assertNotEquals("No Hello World!",helloWorld.sayHello());
	}

	@Disabled
	@DisplayName(value = "Test method to test string ends with i")
	@ParameterizedTest
	@ValueSource(strings = {"cali","mali","dani","venu"})
	void testEndsWith(String str) {
		assertTrue(str.endsWith("i"));
	}

	@Disabled
	@Tag(value = "cdn") //identifier of this test method
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}") 
	@DisplayName("RepeatingTest") 
	void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) { 
		int i = 3; 
		System.out.println(testInfo.getDisplayName() + "-->" + 
													repInfo.getCurrentRepetition() ); 
		assertEquals(repInfo.getCurrentRepetition(), i); 
	} 

		
	
	@Test
	@DisplayName(value = "Checking two arrays for equality")
	void checkCourses() {
		assertArrayEquals(helloWorld.getCourses(), helloWorld.getNewCourses(),
												"Checking arrays for equality");
	}

	
	
	@Test
	void methodYetToBeTested() {
		Assertions.fail("Method supposed to fail");
	}
	
	
	//Assumptions, assertTrue(), assertFalse(), assertThat()
	@Test
    void testOnDev() {
		System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
      //remainder of test will be aborted
    }

	@Test
    void testOnProd() {
		System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
      //remainder of test will proceed

    }
	
}
