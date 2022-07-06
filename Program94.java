import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and return reverse each word in string
/////////////////////////////////////////////////////////////////////////////////
class Program94
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();
		String arr[]=newstr2.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb=new StringBuffer(arr[i]);
			System.out.println(sb.reverse());
		}
	}
}
///////////////////////////////////////////////////////
//
// Input	:	India is  
// output	:	aidna 
//				si
///////////////////////////////////////////////////////