package Day_8_ClientDev.Client;

import Day_8_ClientDev.Dev.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num) throws NumberNotDivisibleBySevenException
	{
		if(num%7!=0) {throw new NumberNotDivisibleBySevenException();}
		else System.out.println("the number is divisible by 7"); 
	}

}
