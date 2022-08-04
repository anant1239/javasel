package constructor;

public class con4 {
	int a,b,c;
public con4()
{
	a=10;
	b=10;
	c=a+b;
	System.out.println(c);
	
}
//parametrised	
	public con4(int x, int y, int z)
	{
		a=x;
		b=y;
		z=x+y;
		System.out.println(z);
	}
}