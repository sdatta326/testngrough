package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void tc3()
	{
		 System.out.println("hello world3");
	}
	
	@Parameters({"URL","KEY"})
	@Test
	public void func(String u,String k)
	{
		 System.out.println(u+"for day2");
		 System.out.println(k+"for day2");	
	}
	
	
	
	@Parameters({"URL"})
	@Test
	public void tc4(String u)
	{
		 System.out.println("hello world3");
		 System.out.println(u);
		 
	}
	
	
	@BeforeSuite
	public void tc5()
	{
		 System.out.println("I will execute at first of suite");
	}

}
