class Base
{
	private int num;
	public Base(int num) 
	{
		this.num=num;
		System.out.println("inside Of parameterised of Base");
	}
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num=num;
	}
}
class Sub extends Base
{
	private int num1;
	public Sub(int num1) 
	{
		super(10);
		this.num1=num1;
		System.out.println("inside Of parameterised of Sub");
	}
	public Sub() 
	{
		super(20);
		System.out.println("Inside Default of Sub");
	}
	public void setNum1(int num1) 
	{
		this.num1=num1;
	}
	public int getNum1() 
	{
		return num1;
	}
}
public class task_4 {
	public static void main(String args[]) 
	{
		Sub s1=new Sub(200);
		System.out.println(s1.getNum());
		System.out.println(s1.getNum1());
		Sub s2=new Sub();
		System.out.println(s2.getNum());
		System.out.println(s2.getNum1());		
	}

}
