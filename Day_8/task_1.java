/*
  1) define your exception class by name "MyArithException"
 
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will raise the  exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.
	[ this method shouldn't handle the exception]
*/
import java.util.*;
class MyArithException extends Exception
{
	public String toString() 
	{
		return "["+"MyArithException"+"]";
	}
}
class Calculator
{
	int CalDouble(int a) throws MyArithException
	{
		if(a<=0) {throw new MyArithException();}
		else
			return a*2;
	}
}
public class task_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		Calculator c=new Calculator();
		try 
		{
			System.out.println(c.CalDouble(a));
		}
		catch(MyArithException ae) 
		{
			ae.printStackTrace();
			System.out.println("negative number is not allowed");
		}
	}
	}
