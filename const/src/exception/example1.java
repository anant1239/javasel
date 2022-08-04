package exception;

public class example1 {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			
			System.out.println(a/b);
			}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("I cannot divide by 0");
		}
	}
	
	}
	