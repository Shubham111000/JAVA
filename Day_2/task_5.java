public class task_5 {
	public static void main(String []args) 
	{
		System.out.println(A.getA());
		System.out.println(B.getB());
		System.out.println(C.getC());
		A s1=new A();
		B s2=new B();
		C s3=new C();
		System.out.println(s1.getAa());
		System.out.println(s2.getBb());
		System.out.println(s3.getCc());
	}

}
class A
{
	private static int a=10;
	private int aa;
	public static int getA() 
	{
		return a;
	}
	public int getAa() 
	{
		return aa;
	}
}
class B
{
	private static int b=20;
	private int bb;
	public static int getB() 
	{
		return b;
	}
	public int getBb() {
		return bb;
	}
}
class C
{
	private static int c=30;
	private int cc;
	public static int getC() 
	{
		return c;
	}
	public int getCc() 
	{
		return cc;
	}
}
