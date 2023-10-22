interface MyInterface
{
public void fun();	
}
public class task_3 
{
	public static void perform(MyInterface ref) 
	{
		ref.fun();
	}


	public static void main(String[] args) 
	{
		MyInterface ref1=()->{System.out.println("Inside of first implementation of MyInterface");};
		perform(ref1);
	}
}
