package Day_8_ClientDev.Client;
import java.util.*;

import Day_8_ClientDev.Dev.NumberNotDivisibleBySevenException;
public class Demo 
{

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=Sc.nextInt();
		MyMath m=new MyMath();
		try{m.disp(a);}
		catch(NumberNotDivisibleBySevenException ae) 
		{
			ae.printStackTrace();
			System.out.println("Enter the number which is divisible by 7");
		}
	}

}
