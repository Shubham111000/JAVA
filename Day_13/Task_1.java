import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable
{
	int CustomerId;
	String CustomerName;
	String Address;
	int Age;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age)
	{
		Age = age;
	}
	public String toString() 
	{
		return "Customer[ CustomerName= "+CustomerName+" Address ="+Address+" CustomerId = "+CustomerId+" Age ="+Age+"]";
	}
}
public class Task_1{

	public static void main(String[] args) 
	{
		Customer ref=new Customer();
		ref.setAge(100);
		ref.setAddress("Solapur");
		ref.setCustomerId(104466462);
		ref.setCustomerName("Shubham");
		System.out.println("Name = "+(ref.getCustomerName())+" CustomerID = "+(ref.getCustomerId())+" Address ="+(ref.getAddress())+" Age ="+(ref.getAge()));
		try
		{
			FileOutputStream fis=new FileOutputStream("abc.txt");
			try 
			{
				ObjectOutputStream OOS=new ObjectOutputStream(fis);
				OOS.writeObject(ref);
			}
			catch(Exception ee) 
			{
				ee.printStackTrace();
			}
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");
			try 
			{
				ObjectInputStream OOS=new ObjectInputStream(fis);
				Customer ref2=(Customer)OOS.readObject();
				System.out.println(ref2);
			}
			catch(Exception ee) 
			{
				ee.printStackTrace();
			}
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}

}
