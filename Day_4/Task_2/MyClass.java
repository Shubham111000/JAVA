package Task_2;

public class MyClass {
	private static String string="Hello";
	private int num;
	public MyClass(int num) 
	{
		this.num = num;
	}
	public static String getString() 
	{
		return string;
	}
	public static void setString(String string) 
	{
		MyClass.string=string;
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
