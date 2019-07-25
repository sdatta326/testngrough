package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//helper attributes
//dependsOnMethods,enabled,timeOut etc

public class third {
	
	@Test
	public void apple()
	{
		System.out.println("car mobile loan interest APPLE");
	}
	@Parameters({"URL"})
	@Test
	public void orange(String s)
	{
		System.out.println("car door  loan related things ORANGE"+"  "+s);
	}
	
	@Test(timeOut=4000)//dont fail till 40 seconds/4 thosend milliseconds wait 40 seconds before throw an error
	//applicable for this method only
	public void xrange()
	{
		System.out.println("car door  loan related things XRANGE");
	}
	@Test(enabled=false)//only  this method or test case will be skipped if any bug is found in this test method
	public void fan()
	{
		System.out.println("car get3  loan related things FAN");
	
	}
	@Test(dependsOnMethods= {"orange","xrange"})//before this method depends on methods will execute first
	public void lion()
	{
		System.out.println("car get4  loan related things LION");
	}

}
