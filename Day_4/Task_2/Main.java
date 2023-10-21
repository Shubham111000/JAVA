package Task_2;

public class Main {

	public static void main(String[] args) 
	{
		MyClass m1=new MyClass(200);
		System.out.println(MyClass.getString());
		System.out.println(m1.getNum());
		MyClass.setString("Bye");
		System.out.println(MyClass.getString());
		m1.setNum(500);
		System.out.println(m1.getNum());
	}

}
