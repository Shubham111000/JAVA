
public class Main {

	public static void main(String[] args) 
	{
		//System.out.println(Singleton.singleton);
		Singleton ref1=Singleton.getSingleton();	
		System.out.println(ref1.getNum());
		ref1.SetNum(100);
		System.out.println(ref1.getNum());
		//Singleton ref2=new Singleton();	
		
	}

}
