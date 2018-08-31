package learnUnitTest.UnitTest;
import static org.junit.Assert.*;
import org.junit.Test;

import application.MathProvider;
import junit.framework.Assert;

public class TestMath {
	MathProvider provider;
	public TestMath()
	{
		provider=new MathProvider();
	}
	@Test
	public void testAdd()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, provider.Add(a, b));
		System.out.println("Test Completed");
	}
	
	@Test
	public void subtractTest()
	{
		int a=10;
		int b=5;
		Assert.assertEquals(a-b, provider.Substract(a, b));
		System.out.println("Test Completed");
	}
	
	

}
