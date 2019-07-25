package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups={"Smoke"})
	public void webloginhome()
	{
		System.out.println("web login for home");
	}
	@Test
	public void mobileloginhome()
	{
		System.out.println("mobile login for home");
	}
	@Test(enabled=true)
	public void func()
	{
		System.out.println("function login for home");
	}
	@AfterMethod
	public void  apiloginhome6()
	{
		System.out.println("I will execute after every method from day4");
	}
	@Test(timeOut=4000)
	public void homeapiloginhome4()
	{
		System.out.println("mobile login for home");
	}
	@Test(dependsOnMethods= {"homeapiloginhome4","func"})
	public void apiloginhome4()
	{
		System.out.println("api login for home");
	}
	@AfterTest
	public void  homeloginhome()
	{
		System.out.println("I will execute last from first folder home login for home");
	}
	//@Parameters({"URL"})
	@Test
	public void paraloginhome10(String u1) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream f=new FileInputStream("C:\\Selenium\\TestNGTutorial\\src\\test\\datadriven.properties");
		prop.load(f);
		System.out.println(prop.getProperty("username"));
		
		
		System.out.println("mobile login for home for one");
		System.out.println(u1);
	}
	@Test
	public void paraloginhome100() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream f=new FileInputStream("C:\\Selenium\\TestNGTutorial\\src\\test\\datadriven.properties");
		prop.load(f);
		System.out.println(prop.getProperty("username"));
		
		
		System.out.println("mobile login for home for one");
		//System.out.println(u1);
	}
	
	/*@Parameters({"URL"})
	@Test
	public void paraloginhome12(String u2)
	{
		System.out.println("mobile login for home for two");
		System.out.println(u2);
	}*/

}
