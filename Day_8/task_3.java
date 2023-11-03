import java.util.*;

class MyException extends Exception
{
	
}
class Demo
{
	public void show1() 
	{
		try {
		show2();}
		catch(MyException ae) 
		{
			ae.printStackTrace();
			System.out.println("Enter the number which is less than 10");
		}
	}
	public void show2() throws MyException
	{
		show3();
	}
	public void show3() throws MyException
	{
		System.out.println("Enter the number");
		if(new Scanner(System.in).nextInt()>=10) 
		{
			throw new MyException();
		}
		else
			System.out.println("Number is less than 10");
	}
}
public class task_3 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.show1();
	}

}
