package exception;

public class example2{
	
	public static void main(String[] args) {
		int a[]= {2,3,4};
		try
		{
			for(int i=0;i<=3;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//after the exception has come up and still if you need the program to execute might be to handle exception or move with the program
		finally
		{
			System.out.println("All the exceptions are handled");
		}
	}
}	
