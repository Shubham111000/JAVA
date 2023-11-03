import static java.lang.System.out;
public class task_8_3 {
	public static void main(String []args) 
	{
		for (int i=0;i<=5;i++) 
		{
			for (int s=5;s>i;s--)
				out.print(" ");
			for (int j=1;j<=i;j++) 
			{
				out.print("* ");
			}
			out.println();
		}
		for (int i=4;i>0;i--) 
		{
			for (int s=5;s>i;s--)
				out.print(" ");
			for (int j=0;j<i;j++)
				out.print("* ");
			out.println();
		}
		
	}

}

