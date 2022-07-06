import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
// Accept string from user and count number of word
/////////////////////////////////////////////////////////////////////////
class Program88
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		String arr[]=str.split(" ");
		
		System.out.println("Number of words are :"+arr.length);
		
	}
}
///////////////////////////////////////////////////////
//
// Input	:	India is  my country
// output	:	4
///////////////////////////////////////////////////////