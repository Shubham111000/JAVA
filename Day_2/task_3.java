public class task_3 {	
	public static void main(String [] args) 
	{
		System.out.println(EMP.getCnt());
	}

}
class EMP
{
	private static int cnt=10;
	public static int getCnt() 
	{
		return cnt;
	}
}