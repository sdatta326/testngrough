package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class second {
	
	@Test
	public void display()
	{
		System.out.println("display car loan interest");
	}
	@Test(groups= {"smoke"})//only this test case from this class file related folder will be executed not the other testcases of this class folder
	public void display2()
	{
		System.out.println("display2 car loan related things SECOND SMOKING");
		Assert.assertTrue(false);
	}
	@Test(dataProvider="getdata")
	public void disout(String u,String p)
	{
		System.out.println("ALL INPUTS loan related things disout "+"  "+u+" "+p);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][]  o=new Object[3][2];
		
		o[0][0]="nocredit_username";
		o[0][1]="nocredit_password";
		o[1][0]="credit_username";
		o[1][1]="credit_password";
		o[2][0]="fraudcredit_username";
		o[2][1]="fraudcredit_password";
		return o;
		
	}

}
