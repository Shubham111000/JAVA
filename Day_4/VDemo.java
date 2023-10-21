
interface Vehicle
{
	void Start();
}
class TwoWheeler implements Vehicle
{
	public void Start()
	{
		System.out.println("Two wheeler Started");
	}
}
class ThreeWheeler implements Vehicle
{
	public void Start()
	{
		System.out.println("Three wheeler Started");
	}
}
class FourWheeler implements Vehicle
{
	public void Start()
	{
		System.out.println("Four wheeler Started");
	}
}
public class VDemo {

	public static void main(String[] args) 
	{
		Vehicle arr[]=new Vehicle[3];
		arr[0]=new TwoWheeler();
		arr[1]=new ThreeWheeler();
		arr[2]=new FourWheeler();
		for (int i=0;i<arr.length;i++) 
		{
			arr[i].Start();
		}
	}

}
