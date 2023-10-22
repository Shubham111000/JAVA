class Display
{
	void disp() 
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}
public class task_5 {

	public static void main(String[] args) {
		Display s=new Display();
		Runnable ref=()->{s.disp();};
		Runnable ref2=()->{s.disp();};
		ref.run();
		ref2.run();

	}

}
