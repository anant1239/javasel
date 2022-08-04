package constructor;

public class con2 {
	int depNo;
	String depName;
	
	con2(int a, String b)
	{
		depNo=a;
		depName=b;
		System.out.println(depNo);
		System.out.println(depName);
	}
	public static void main(String[] args) {
		new con2(10,"Anant");
	}

}
