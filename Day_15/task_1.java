interface First
{
	abstract void  Disp1();
}
class Second
{
	public void fun1() 
	{
		System.out.println("Inside Fun");
	}
}
public class task_1 {

	public static void main(String[] args) {
		Second s2=new Second();
		First Ref=s2::fun1;
		Ref.Disp1();
	}

}
