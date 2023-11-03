public class task_4 {
	public static void main(String args[]) 
	{
		DemoOb obj1=new DemoOb();
		DemoOb obj2=obj1;	
		obj2=new DemoOb();
	}

}
class DemoOb
{
	DemoOb()
	{
		System.out.println("inside Default constructor");
	}
}



/*
 first we have created the reference obj1 and assign this to one object on heap and then we have
 Initialized another reference obj2 with same object and then we assign the new object on heap and 
 give reference to obj2 now it will refer to the new object and stop referring the old object
*/
