package cal;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator ca =new Calculator();
	public void testAdd_BothNumbersArePositive_ShouldReturnPositiveNumber(){
		int first=1;
		int second=2;
		
		int result = ca.add(first,second);
		Assert.assertTrue(result>0);
		//fail("Not yet implemented");
	}
	public void testAdd_BothNumbersAreNegative_ShouldReturnNegativeNumber(){
		int first=-1;
		int second=-2;
		int result = ca.add(first,second);
		Assert.assertTrue(result<0);
	}
	public void testAdd_GreaterNumbersISPositiveOtherOneIsNegative_ShouldReturnPositiveNumbedr() {
		int first=-1;
		int second=2;
		int result = ca.add(first,second);
		Assert.assertTrue(result>0);
	}
	public void testAdd_GreaterNumbersIsNegativeOtherOneISPositive_ShouldReturnNegativeNumber() {
		int first=1;
		int second=-2;
		int result = ca.add(first,second);
		Assert.assertTrue(result<0);
	}

}
