<<<<<<< HEAD
package Day_8_ClientDev.Client;

import Day_8_ClientDev.Dev.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num) throws NumberNotDivisibleBySevenException
	{
		if(num%7!=0) {throw new NumberNotDivisibleBySevenException();}
		else System.out.println("the number is divisible by 7"); 
	}

}
=======
package Day_8_ClientDev.Client;

import Day_8_ClientDev.Dev.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num) throws NumberNotDivisibleBySevenException
	{
		if(num%7!=0) {throw new NumberNotDivisibleBySevenException();}
		else System.out.println("the number is divisible by 7"); 
	}

}
>>>>>>> ad6f6e4335234563d615a8ba5830d40196014a1a
