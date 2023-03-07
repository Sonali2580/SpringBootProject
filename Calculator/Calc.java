//2. Create a spring boot project which create a calculator rest api to perform
 //  4 basic calculator operations
package edu.learning.thursdaylab.logic;

public class Calc {
	public static int addNo(int num1,int num2)
	{
		return num1+num2;
	}
	public static int subNo(int num1,int num2)
	{
		return num1-num2;
	}
	
	public static int multiNo(int num1,int num2)
	{
		return num1*num2;
	}
	
	public static int divNo(int num1,int num2)throws ArithmeticException
	
	{
		if (num2==0)
		{
			throw new ArithmeticException("Cannot divide by zero");
		}
		return num1/num2;
	}




}
