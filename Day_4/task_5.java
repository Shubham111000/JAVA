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
class Sub1 extends Base
{
	private int num1;
	public Sub1(int num1) 
	{
		super(10);
		this.num1=num1;
		System.out.println("inside Of parameterised of Sub1");
	}
	public Sub1() 
	{
		super(20);
		System.out.println("Inside Default of Sub1");
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
class Sub2 extends Sub1
{
	private int num2;
	public Sub2(int num2) 
	{
		super(100);
		this.num2=num2;
		System.out.println("inside Of parameterised of Sub2");
	}
	public Sub2() 
	{
		
		System.out.println("Inside Default of Sub2");
	}
	public void setNum2(int num2) 
	{
		this.num2=num2;
	}
	public int getNum2() 
	{
		return num2;
	}
}

public class task_5 {

	public static void main(String[] args) {
		Sub2 s2=new Sub2(1000);
		System.out.println(s2.getNum());
		System.out.println(s2.getNum1());
		System.out.println(s2.getNum2());
		Sub2 s3= new Sub2();
		System.out.println(s3.getNum());
		System.out.println(s3.getNum1());
		System.out.println(s3.getNum2());
		

	}

}
