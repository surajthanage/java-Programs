import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : StrPalindrome
// Description    : check palindrome string
// Input	      : String
// Output	      : boolean
// Date	          : 7/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class StringX
{
	public String str1;
	
	public StringX(String src)
	{
		this.str1=src;
	}
	
	public boolean StrPalindrome()
	{	
		char Arr[]=str1.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=Arr.length-1;i>=0;i--)
		{
			sb.append(Arr[i]);
		}
		String str=sb.toString();
		if(str1.equals(str))
			return true;
		else 
			return false;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept two string from user and
//check string palindrome or not
////////////////////////////////////////////////////////////////////////////

class Program185
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		StringX obj=new StringX(str1);
		
		boolean bRet=obj.StrPalindrome();
		if(bRet==true)
		System.out.println("String are palindrome..");
		else
		System.out.println("String are not palindrome..");
	}
}