interface Fifth
{
	abstract int add(int a,int b);
}
class Math1
{
	public int calc(int a,int b)
{
		return a+b;
}
}

public class task_3 {

	public static void main(String[] args) {
		Math1 m =new Math1();
		Fifth Ref1=(a,b)->{return(m.calc(a,b));};
		Fifth ref2=m::calc;
		System.out.println(Ref1.add(10,20));
		System.out.println(Ref1.add(100,200));
	}

}
