package task_3;

public class CheckDemo {

	public static void main(String[] args) {
		Check c1=new Check(10,20,30,40);
		System.out.println(c1.num2);   //it is default and can access anywhere in same package
		System.out.println(c1.num3);  //it is protected so we can access in same package and as well as only in child class of outside of package
		System.out.println(c1.num4); //it is public so can access anywhere
		//System.out.println(c1.num1); //will get an error because it is private
		c1.Disp(); //for accessing private member

	}

}
