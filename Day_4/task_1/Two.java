package task_1;

public class Two {

	public static void main(String[] args) {
		First f1=new First(10,20);
		Second s2=new Second("Hello","good Morning");
		System.out.println(f1.getNum());
		System.out.println(f1.getNum2());
		System.out.println(s2.getS1());
		System.out.println(s2.getS2());
		f1.setNum(100);
		s2.setS2("Good NIght");
		System.out.println(f1.getNum());
		System.out.println(s2.getS2());
	}

}
