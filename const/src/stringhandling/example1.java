package stringhandling;

public class example1 {
	
	public static void main(String[] args) {

	String company = "Moolya";
	//already there is a string which is using moolya later i want to add software to it without changeing the exisiting variable

	//I am creating a String variable to store a value called Moolya
    //I got a situation where i have to add something to the store value // what can i do
	//I want to add some more details in the value of the existing string // software
	
	StringBuffer s=new StringBuffer(company);
	System.out.println(s.append(" Software"));
	
	//I want to know character a in moolya is at what index
	
	System.out.println(s.indexOf("a"));
	//I want to findout what the last index
	
	//Moolya software
	System.out.println(s.lastIndexOf("f"));
	
	//I want to findout the length of the String
	System.out.println(s.length());
	
	//s what is the value in s // Moolya software
	//Now i want to cut till first 6 character
	System.out.println(s.substring(7));
	
	
	Double dd=00.100;
	String str=String.valueOf(dd);
	System.out.println(str);
	
    System.out.println(str.substring(2));
    String str1=(str.substring(2));
	Double dd1=Double.parseDouble(str1);
	double roundoff=(double)Math.round(dd1 * 100.0)/100.0;
	System.out.println(roundoff);
	
	//Now i want to delete a char
	System.out.println(s.deleteCharAt(14));
	System.out.println(s.insert(14, "e"));
	
	String s1="Sachin";
	StringBuffer s11=new StringBuffer(s1);
	System.out.println(s11.reverse());
	
	String name = new String("Anant");
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	
	String name1 = "anant dubey";
	String name2 = "ANANT DUBEY";
	
	//equals ignore case // This will ignore to check weather a string is lowercase or uppercase
	if(name1.equalsIgnoreCase(name2))
	System.out.println("Name is same");
	else
		System.out.println("Name is not same");
	
}
}