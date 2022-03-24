package com.sapient.aem.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/*
 * @RunWith is replaced with @ExtendWith in JUnit5
 */
@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
public class MockSpy {
 
    @Mock
    private List<String> mockList;
 
    @Spy
    private List<String> spyList = new ArrayList<>();
 
    @Test
    public void testMockList() {
        //by default, calling the methods of mock object will do nothing
        mockList.add("test");
        assertNull(mockList.get(0));
   }
 
    @Test
    public void testMockWithStub() {
        //try stubbing a method
        String expected = "Mock";
        when(mockList.get(0)).thenReturn(expected);
 
        assertEquals(expected, mockList.get(0));
    }
    
    
    
    
    
    @Test
    public void testSpyList() {
        //spy object will call the real method when not stub
        spyList.add("test");
        assertEquals("test", spyList.get(0));
    }
 
    @Test
    public void testSpyWithStub() {
        //stubbing a spy method will result the same as the mock object
        String expected = "test";
        //take note of using doReturn instead of when
        doReturn(expected).when(spyList).get(0);
 
        assertEquals(expected, spyList.get(0));
    }
    
    
 
    
}
