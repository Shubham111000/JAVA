/*
5) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Myclass implements Serializable
{
	String nameofobject;

	public Myclass(String nameofobject)
	{
		this.nameofobject = nameofobject;
	}

	@Override
	public String toString() {
		return "Myclass [nameofobject=" + nameofobject + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
public class task_5 {
	
	
	public static void main(String[] args) {
		Myclass e1=new Myclass("First");
		Myclass e2=new Myclass("Second");
		Myclass e3=new Myclass("Third");
		Myclass e4=new Myclass("Forth");
		Myclass e5=new Myclass("Fifth");
		FileOutputStream fos=null;
		FileInputStream fis=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		List<?>mylist1=null;
		List<Myclass>mylist=new ArrayList<Myclass>();	
		mylist.add(e1);
		mylist.add(e2);
		mylist.add(e3);
		mylist.add(e4);
		mylist.add(e5);
		try {
			fos=new FileOutputStream("abc.text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			oos=new ObjectOutputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			oos.writeObject(mylist);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis=new FileInputStream("abc.text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			ois=new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			mylist1=(List<?>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 Iterator <?> itr=mylist1.iterator();
		 while(itr.hasNext()) 
		 {
			System.out.println( itr.next());
		 }

	}

}
