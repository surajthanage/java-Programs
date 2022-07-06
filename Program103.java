import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and check anagaram
/////////////////////////////////////////////////////////////////////////////////
class Program103
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		str1=str1.toLowerCase();			//conver lower case
		
		char arr[]=str1.toCharArray();	//convert string to character array
		int Frequency[]=new int[26];
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		
		str2=str2.toLowerCase();			//conver lower case
		
		char brr[]=str2.toCharArray();	//convert string to character array
		
		if(str1.length()!=str2.length())
		{
			System.out.println("String are not anagram as length is different");
			return;
		}
		
		int i=0;
		
		for(i=0;i<arr.length;i++)
		{
			Frequency[arr[i]-'a']++;
			Frequency[brr[i]-'a']--;
		}
		
		for(i=0;i<Frequency.length;i++)
		{
			if(Frequency[i]!=0)
			{
				break;
			}
		}
		if(i==26)
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("String are not anagram");
		}
	}
}
///////////////////////////////////////////////////////
//
// Input	:	race   care
// output	:	string is anagram
///////////////////////////////////////////////////////