interface First
{
	abstract void Disp1();
	public static void Disp3() 
	{
		System.out.println("Inside Disp3 of First");
	}
	public default void Disp2() 
	{
		System.out.println("Inside Disp2 of First");
	}	
}
public class task_1 {

	public static void main(String[] args)
	{
		First ref=()->{System.out.println("Inside Disp1 of First");};
		First ref1=()->{System.out.println("Inside Disp1 of First");};
		ref.Disp1();
		ref.Disp2();
		First.Disp3();
		System.out.println(ref.getClass().getName());
		System.out.println(ref1.getClass().getName());
		
	}

}
