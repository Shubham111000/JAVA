interface Sixth
{
abstract void Disp5();	
}
class Sample
{
	public static void Fun1() 
	{
		System.out.println("Inside of Fun1");
	}
	
}
	
public class task_4 {

	public static void main(String[] args) 
	{
		Sixth Ref=Sample::Fun1;
		Ref.Disp5();
	}

}
