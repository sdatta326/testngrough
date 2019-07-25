package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void show1()
	{
		System.out.println("before all class");
	}
	@AfterClass
	public void show2()
	{
		System.out.println("after all class");
	}
	@Test
	public void weblogincar()
	{
		System.out.println("web login");
	}
	@Test
	public void mobilelogincar_for_one()
	{
		System.out.println("mobile login for one");
	}
	@AfterSuite
	public void  apilogincar_for_five()
	{
		System.out.println("I will execute at the end of suite");
	}
	@Test
	public void mobilelogincar_for_two()
	{
		System.out.println("mobile login for two");
	}
	@Parameters({"URL"})
	@Test
	public void paraloginhome12(String u3)
	{
		System.out.println("CAR login for home for three");
		System.out.println(u3);
	}
	@Test
	public void  apilogincar_for_three()
	{
		System.out.println("api login");
	}
	@BeforeMethod
	
	public void bfemethod()
		{
		System.out.println("put this before every method");
		}
	@BeforeTest
	public void tc4()
	{
		 System.out.println("first print hello world3 from day3");
	}
	@AfterTest
	public void  apilogincar_for_four()
	{
		System.out.println("last folder");
	}
	@Test(dataProvider="getdata")
	public void  gettingdata(String u,String p)
	{
		System.out.println("username"+u);
		System.out.println("password"+p);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		 Object[][] a=new Object[3][2];
		 a[0][0]="usernam1";
		 a[0][1]="password1";
		 a[1][0]="username2";
		 a[1][1]="password2";
		 a[2][0]="username3";
		 a[2][1]="password3";
		 return a;
	}
	

}
