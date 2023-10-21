class A
{
	private int num;
	public A()
	{
		this.num=100;
		System.out.println("Inside deafault of A");
	}
	public int  Disp() 
	{
		return num;
	}
}
class B extends A
{
	private int num1;
	public B()
	{
		this.num1=10;
		System.out.println("Inside deafault of B");
	}
	public int  Disp() 
	{
		return num1;
	}
}
public class task_7 {

	public static void main(String[] args) 
	{
		B obj1=new B();
		System.out.println(obj1.Disp());
	}

}
