interface Third
{
	abstract void Show(int num);
}
class Sample
{
	public void disp(int num) 
	{
		System.out.println(num);
	}
}
public class Task_2 {

	public static void main(String[] args)
	{
		Sample s=new Sample();
		Third Ref=s::disp;
		Ref.Show(10);
	}
	

}
