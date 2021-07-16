package CalculatorAPI.CalculatorAPI;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CalTest {

	CalculatorAPI obj;
	int result;

	@BeforeClass
	public void init() {
		System.out.println();
		obj = new CalculatorAPI();
	}

	@BeforeMethod
	public void reintialiseResultVar() {
		result = 0;
		System.out.println("reintialiseResultVar" );
	}

	@Test(priority = 1)
	public void testAdditionWithTwoPositiveNumbers() {
		System.out.println("Test case 1");
		result = obj.addition(10, 20);
		System.out.println("result=" + result);
		Assert.assertEquals(result, 30, "Addition does not work");
	}

	@Test(priority = 3)
	public void testAdditionWithtwoZeros() {
		System.out.println("Test case 3");
		result = obj.addition(0, 0);
		System.out.println("result=" + result);
		Assert.assertEquals(result, 0, "Addition does not work");
	}

	@Test(priority = 2)
	public void testAdditionWithOnePositiveOneNegative() {
		System.out.println("Test case 2");
		result = obj.addition(10, -8);
		System.out.println("result=" + result);
		Assert.assertEquals(result, 2, "Addition does not work");
	}
	@AfterMethod
	public void end() {
		result = 0;
		System.out.println("end");
	}
}
