package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class first {
	@Test
	public  void show1()
	{
		System.out.println("personal interest for loan1");
	}
	/*@BeforeTest
	public  void show2()
	{
		System.out.println("I will first execute before all test cases start with @test in the same folder/test in suite where class name first.java exists");
		System.out.println("personal interest for loan2");
	}*/
	@Parameters({"url","url1"})//parameter related to class file only and  u can pass any parameter
	//to pass value to your testcases we pass this//parameter related to specific class only
	@Test
	public  void show3(String s,String v)
	{
		System.out.println("personal interesr for things related to loan3"+" "+s+" "+"concatinate"+" "+v);
	}
	
	@Parameters({"url1"})//parameters passing in testng//or to pass url and username and password parameter to particuler method and test cases
	@Test
	public  void show30(String s)
	{
		System.out.println("personal interesr for things related to loan3"+" "+s);
	}
	
	@Test(groups= {"smoke"})//only this test case from this class file related folder will be executed not the other testcases of this class folder
	//will be executed
	public  void show40()
	{
		System.out.println("personal interesr for things related to loan40 SMOKING GROUPS");
	}
	@BeforeClass
	public void showme()
	{
		System.out.println("before class I will execute");	
	}
	@AfterClass
	public void showus()
	{
		System.out.println("after class I will execute");
	}
	/*@AfterTest
	public  void show4()
	{
		System.out.println("personal interesr for things related to loan4");
		System.out.println("I will  execute last all test cases start with @test in the same folder/test in suite where class name first.java exists");
	}
	/*@BeforeSuite
	public  void show5()
	{
		System.out.println("I will execute before all the testcases in the whole suite");
		System.out.println("personal interesr for things related to loan5");
	}*
	/*@AfterSuite
	public  void show6()
	{
		System.out.println("personal interesr for things related to loan6");
		System.out.println("I will execute after all the testcases in the whole suite");
	}*/
	
	@BeforeMethod
	public  void show7()
	{
		System.out.println("BEFORE METHOD personal interesr for things related to loan7");
		System.out.println("I will execute before every method in this first java testcase class related folder");
	}
	
	@AfterMethod
	public  void show8()
	{
		System.out.println("AFTER METHODpersonal interesr for things related to loan8");
		System.out.println("I will execute after every method in this first java testcase class related folder");
	}
	
}
