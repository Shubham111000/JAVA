
public class Singleton {
	private static Singleton singleton=new Singleton();
	private int num;
	private Singleton() 
	{
		System.out.println("Inside default");
	}
	public int getNum()
	{
		return num;
	}
	public void SetNum(int num) 
	{
		this.num=num;
	}
	public static Singleton getSingleton()
	{
		return singleton;
	}
}

