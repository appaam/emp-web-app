package com.sapient.aem.model;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


@Suite
//@SelectClasses({HelloWorldNewTest.class,HelloWorldOldTest.class})
@SelectPackages("com.sapient.aem.model")
@SuiteDisplayName("A demo test suite")
public class JUnit5TestSuiteExample {

}
