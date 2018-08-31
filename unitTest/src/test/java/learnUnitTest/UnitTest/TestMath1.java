package learnUnitTest.UnitTest;

import org.junit.Assert;
import org.junit.Test;

import application.MathProvider;

public class TestMath1 {
	
	MathProvider provider;
	
	public TestMath1()
	{
		provider=new MathProvider();
	}
	
	@Test
	public void mulitplyTest()
	{
		int a=10;
		int b=5;
		Assert.assertEquals(a*b, provider.Multiply(a, b));
	}

}
