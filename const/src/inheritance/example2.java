package inheritance;

public class example2 extends example1 
{
	public int sum(int a, int b)
	{
		return a+b;
		
	}
	public int div(int a, int b)
	{
		return a/b;
		
	}
	public int mod(int a, int b)
	{
		return a%b;
	}
	public static void main(String[] args)
	//This implementation of an abstact class is present in example 2 so we have to create the object in the concrete class
	{
		example2 ex= new example2();
		System.out.println(ex.sum(10,10));
		System.out.println(ex.div(10,5));
		System.out.println(ex.mod(12,6));
	}
}


