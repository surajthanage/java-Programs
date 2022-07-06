import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name  : CheckPalindrome
// Description    : use to perfrom of string Check Palindrome
// Input	      : String
// Output	      : String
// Date	          : 14/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class StringX
{
	public boolean CheckPalindrome(String str1,String str2)
	{
		char ch;
		
		String str3=str1;
		for(int i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str2=str2+ch;
		}
		
		if(str3==str2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept  string from user and display reverse string
/////////////////////////////////////////////////////////////////////////

class Program79
{
	public static void main(String Arg[])
	{
		String str2=" ";
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string");
		String str1=sobj.nextLine();
		
		StringX obj=new StringX();
		
		boolean bRet=obj.CheckPalindrome(str1,str2);
	
		if(bRet==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}	
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 NITIN
// output	:	 String is palindrome.
//				
///////////////////////////////////////////////////////