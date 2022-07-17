import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : StrRev
// Description    : accept string and return reverse by toggle case;
// Input	      : String
// Output	      : String
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
	
	public String StrRev()
	{	
		char Arr[]=str1.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=Arr.length-1;i>=0;i--)
		{
			sb.append(Arr[i]);
		}
		String str=sb.toString();
		String str2=str.toUpperCase();
		return str2;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept two string from user and
// return toggal case reverse string
////////////////////////////////////////////////////////////////////////////

class Program184
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		StringX obj=new StringX(str1);
		
		String str=obj.StrRev();
		System.out.println("String Reverse string are :"+str);
	}
}