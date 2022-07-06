import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and count frequency of each character in string
/////////////////////////////////////////////////////////////////////////////////
class Program99
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		str=str.toLowerCase();			//conver lower case
		
		char arr[]=str.toCharArray();	//convert string to character array
		int Frequency[]=new int[26];
		int i=0;
		
		for(i=0;i<arr.length;i++)
		{
			Frequency[arr[i]-'a']++;
		}
		for(i=0;i<Frequency.length;i++)
		{
			if(Frequency[i]>0)
			{
				System.out.println((char)(i+'a')+" : "+Frequency[i]);
			}
		}
	}
}
///////////////////////////////////////////////////////
//
// Input	:	aaabbc
// output	:	a : 3		b:2		c:1
///////////////////////////////////////////////////////