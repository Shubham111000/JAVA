public class task_2 {

	public static void main(String [] args) 
	{
			Myclass s1=new Myclass();
			Myclass s2=new Myclass(10);
			Myclass s3=new Myclass(10,20);
	}
}
class Myclass
{
	Myclass()
	{
		System.out.println("inside Default Constructor");
	}
	Myclass(int k)
	{
		System.out.println("inside one parameter Constructor");
	}
	Myclass(int j,int k)
	{
		System.out.println("inside two parameter Constructor");
	}
}
