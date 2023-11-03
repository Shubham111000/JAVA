/*
 9) Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Employee implements Serializable
{
	int empid;
	String empname;
	String design;
	int basic;
	public Employee(int empid, String empname, String design, int basic) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.design = design;
		this.basic = basic;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public String toString() 
	{
		return "Employee[empid = "+empid+" empname ="+empname+" design "+design+" basic "+basic+"]";
	}
	public void disp() 
	{
		System.out.println(toString());
	}
	
}
public class task_9 {
	

	public static void main(String[] args) 
	{
		Employee e1=new Employee(164761,"Shubham","CEO",67676);
		Employee e2=new Employee(166476,"Yash","Joint CEO",57676);
		Employee e3=new Employee(164765,"Sushil","MD",47676);
		Employee e4=new Employee(166456,"Ajinkya","Joint MD",37676);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		List<Employee> mylist=new ArrayList<Employee>();
		mylist.add(e1);
		mylist.add(e2);
		mylist.add(e3);
		mylist.add(e4);
		try {
			
		fos=new FileOutputStream("abc.txt");
		try 
		{
		
			oos =new ObjectOutputStream(fos);
			oos.writeObject(mylist);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<?> mylist1=null;
		try {
			fis=new FileInputStream("abc.txt");
			try {
				ois=new ObjectInputStream(fis);
				try 
				{
					mylist1=(List<Employee>) ois.readObject();
				} 
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Iterator<?> itr=mylist1.iterator();	
		while(itr.hasNext()) 
		{
			((Employee) itr.next()).disp();
		}
		
		
	}

}

