import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
// Accept string from user and Display character 
/////////////////////////////////////////////////////////////////////////
class Program86
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 NITIN
// output	:	 N  I  T   I  N  
//				
///////////////////////////////////////////////////////