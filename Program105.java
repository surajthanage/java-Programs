import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and check anagaram
/////////////////////////////////////////////////////////////////////////////////
class Program105
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		
		char arr[]=(str1.toLowerCase()).toCharArray();	//convert string to character array	
		char brr[]=(str2.toLowerCase()).toCharArray();	//convert string to character array
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		if(Arrays.equals(arr,brr))
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