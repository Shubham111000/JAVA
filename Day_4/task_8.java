class A
{
	private int num;
	public A()
	{
		this.num=1000;
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
	public int  Disp(int k) 
	{
		return k;
	}
}
public class task_8 {

	public static void main(String[] args) 
	{
		B obj1=new B();
		System.out.println(obj1.Disp());
		System.out.println(obj1.Disp(100));
	}

}
