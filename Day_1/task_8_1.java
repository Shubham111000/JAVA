import static java.lang.System.out;
public class task_8_1 {

	public static void main(String[] args) {
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

	}

}
