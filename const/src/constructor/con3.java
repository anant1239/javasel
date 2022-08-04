package constructor;

public class con3 {
	int radius;
	int height,base;
	double side;
	 
	//I want to create a constructor
	//Method overloading
	con3(int r)
	{
		radius=r;
	}
	con3(int h,int b)
	{
		height=h;
		base=b;
	}
	public static void main(String[] args)
	{
		con3 c1=new con3(5);
		
		double x=c1.radius*c1.radius*Math.PI;
		System.out.println("Area of circle");
		
		con3 c2=new con3(10,200);
		double y=c2.height*c2.base*0.5;
		System.out.println("Area of Triangle");
		
	}
	

}