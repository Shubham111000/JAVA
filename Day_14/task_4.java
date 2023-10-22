interface Calculator
{
public abstract int multiply(int a,int b);	
}

public class task_4 {

	public static void main(String[] args) 
	{
		Calculator ref=(int a,int b)->{return a*b;};
		System.out.println(ref.multiply(100,10));
	}

}
