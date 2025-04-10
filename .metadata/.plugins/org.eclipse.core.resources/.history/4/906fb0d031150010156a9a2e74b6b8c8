package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArithematic {
	
	Arithematic arth = new Arithematic();
	
	@BeforeEach
	void testBefore() {
		System.out.println("** before method executed **");
	}
	
	@AfterEach 
	void testAfter() {
		System.out.println("** after method executed **");
	}
	
	@BeforeAll
	static void testBeforeAll() {
		System.out.println("** BeforeAll method executed");
	}
	
	@AfterAll
	static void testAfterAll() {
		System.out.println("** AfterAll method executed**");
	}
	@Test
	void testAdd() {
		assertEquals(11, arth.add(6, 5));
	}
	
	@Test
	void testMultiply() {
		assertEquals(30, arth.multiply(5, 6));
	}
	
	

}
