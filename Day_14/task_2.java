interface Second
{
	public void Disp4();
}
public class task_2 {

	public static void main(String[] args)
	{
		Second Ref1=()->{System.out.println("Inside first implementation of Second interfacce");};
		Second Ref2=()->{System.out.println("Inside Second implementation of Second interfacce");};
		Ref1.Disp4();
		Ref2.Disp4();
	}

}
