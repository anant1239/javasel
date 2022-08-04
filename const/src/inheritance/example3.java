package inheritance;


public class example3 extends example4{
	void wel()
	{
		System.out.println("Welcome to MoolyaEd");
	}
	public static void main(String[] args) {
		example3 ex=new example3();
		ex.wel();
		example4 ex1=new example4();
		ex.wel();
	}

}
class example4
{
	void wel()
	{
		System.out.println("Welcome to Moolya");
	}
}