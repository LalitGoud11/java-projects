package com.springTesting.DemoSpringProjectLearning.test;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.springTesting.DemoSpringProjectLearning.testing.MathUtils;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //only one instance is created per class
@EnabledOnOs(OS.MAC) //only runs on MAC OS, can also be used on methods
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	//	@BeforeAll //Can remove static keyword only when class is annotated with @TestInstance(TestInstance.Lifecycle.PER_CLASS)
	//	 void initializeBeforeAll() {
	//		System.out.println("Running before all methods");
	//		mathUtils = new MathUtils();
	//	}
	
	
	//@Test //does'nt need to write test annotation on @BeforeEach method.
	//@EnabledOnOs(OS.WINDOWS) //Not working on @BeforeEach 
	@BeforeEach //runs before each method & @AfterEach runs runs after each method.
	void initialize() {
		System.out.println("Already init in initializeBeforeAll()");
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("End of method");
	}
	
	
	@Test// to tell jUnit that method with @Test annotation has to be run. 
	void testAdd() {
		//MathUtils mathUtils = new MathUtils();
		System.out.println("Before assumption method: Add Method");
		boolean isServerUp = false;
		assumeTrue(isServerUp,"If this method ran without skipping, my assumption is right"); //Eg: This is used in occasions like run only when server is up.
		
		int expected = 2;
		int actual = mathUtils.add(0, 2);
		//		assertEquals(expected, actual);
		//      can add a string message to log 
		assertEquals(expected, actual,"add method mathUtils");
	}
	
	@Test
	@DisplayName("testing multiplication")
	void testMultiplication() {
		assertAll(
				()-> assertEquals(2, mathUtils.multiply(1, 2),"positive multiply"),
				()-> assertEquals(2, mathUtils.multiply(-1, 2),"negative multiply"),
				()-> assertEquals(0, mathUtils.multiply(1, 0),"multiply with zero")
				);
	}
	
	
	@Nested //Testing nested classes 
	@DisplayName("testing subtraction")
	class TestSubract {
		
		@Test
		@DisplayName("testing subtraction for +no")
		void testPositiveSub() {
		assertEquals(2, mathUtils.subtract(4, 2));
		}
		
		@Test
		@DisplayName("testing subtraction for -no")
		void testNegativeSub() {
		assertEquals(-6, mathUtils.subtract(-4, 2));
		}
		
		@Test
		@DisplayName("testing subtraction for small - large")
		void testpositivesub() {
		assertEquals(2, mathUtils.subtract(2, 4));
		}
	}

	@DisplayName("Testing the are of circle") //u'll get this name in the console instead of method name
	@Test
	void testAreaOfCircle() {
		//MathUtils mathUtils = new MathUtils();
		double expected = 12.56;
		double actual = mathUtils.areaOfCircle(2);
		assertEquals(expected, actual,"message ");
	}
	
	@Test //expected exception assertThrows.
	@EnabledOnOs(OS.LINUX) //used on method/class, 
	void testDivideByZero()   {
		//MathUtils mathUtils = new MathUtils();
		System.out.println("Test divide by zero, should not run");
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(4, 0));
	}

	@Test //expected exception assertThrows.
	void testDivide() throws Exception  {
		//MathUtils mathUtils = new MathUtils();	
		assertEquals(2, mathUtils.divide(4,2));
	}
	
	@Test
	@DisplayName("Method that should skip")
	@Disabled //This is used to skip the method without executing, Usually used in TDD. 
	void ignore() {
		fail("Method should not run. Fail");
	}
	
}
 