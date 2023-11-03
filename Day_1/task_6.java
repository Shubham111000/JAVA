import java.util.*;
import static java.lang.System.out;
import java.lang.*;

public class task_6{

	public static void main(String[] args) {
		for (int i=3;i<=30;i++) 
		{
			boolean result=isPrime(i);
			if(result==true)
				out.println(i);
		}

	}
	public static boolean isPrime(int i)
	{
		int count=2;
		for(int j=2;j<i;j++) 
		{
			if(i%j==0)
				count++;
		}
		if (count>2)
			return false;
		return true;
	}

}
