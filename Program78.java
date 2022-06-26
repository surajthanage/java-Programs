import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name  : RevString
// Description    : use to perfrom of string and return reverse
// Input	      : String
// Output	      : String
// Date	          : 14/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class Reverse
{
	public String RevString(String str1,String str2)
	{
		char ch;
		int i=0;
		
		
		for(i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str2=str2+ch;
		}
		return str2;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept  string from user and display reverse string
/////////////////////////////////////////////////////////////////////////

class Program78
{
	public static void main(String Arg[])
	{
		String str2=" ";
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter String  ");
		String str1=sobj.nextLine();
		
		Reverse obj= new Reverse();
		String sRet=obj.RevString(str1,str2);
		System.out.println("Reverse string is : "+sRet);
		
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 ABCDE
// output	:	 EDCBA
//				
///////////////////////////////////////////////////////