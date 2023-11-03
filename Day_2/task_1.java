public class task_1 {

	public static void main(String[] args) {
		
		Shape s1=new Shape();
		System.out.println(s1.getLength());
		System.out.println(s1.getWidth());
	}

}
class Shape
{
	private int width;
	private int length;
	public int getWidth() 
	{
		return width;
	}
	public int getLength() 
	{
		return length;
	}
}
