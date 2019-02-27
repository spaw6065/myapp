/**
 * My test program
 */
package com.qa.testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author sumitpawar
 *
 */
public class demotestclass {

	//static Logger logger = Logger.getLogger(demotestclass.class);
			
			
	@Test
	public void sum() {
		int a =10;
		int b=20;
		System.out.println("Sum");
		//logger.info("SUM");
		
		Assert.assertEquals(30, a+b);	
	}
	
	@Test
	public void divide() {
		int a =10,b=20;
		System.out.println("Divide");
		//logger.info("DIVIDE");
	Assert.assertEquals(2, b/a);	
	}
	
	@Test
	public void multiply() {
		int a =10,b=20;
		System.out.println("multiply");
		//logger.info("MULTIPLY");
		Assert.assertEquals(200, a*b);	
	}
	
	@Test
	public void subtract() {
		int a =10,b=20;
		//logger.info("SUBTRACT");
		Assert.assertEquals(10, b-a);	
	}
}
