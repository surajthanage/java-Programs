import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////
//
// Function name  : RemoveWhiteSpace
// Description    : use to perfrom of string Remove White Space
// Input	      : String
// Output	      : String
// Date	          : 15/04/2022
// Author	      : Suraj Sanjay Thanage
//
///////////////////////////////////////////////////////////////////////

class StringX
{
	public String StrCpyRemWhiteSp(String str1,String str2)
	{
		int iCnt=0,i=0;
		
		for(i=0;i<=str1.length()-1;i++)
		{
			if((str1.charAt(i)>='a') &&(str1.charAt(i)<='z')||(str1.charAt(i)>='A') &&(str1.charAt(i)<='Z'))
			{
				str2=str2+str1.charAt(i);
			}
			else if(str1.charAt(i)>=' ')
			{
				str1.charAt(i);
			}
		}
		return str2;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept a string from user and copy string wit removing white space
/////////////////////////////////////////////////////////////////////////

class Program84
{
	public static void main(String Arg[])
	{
		String Str2=" ";
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter String");
		String Str1=sobj.nextLine();
		
		StringX obj=new StringX();
		
		String sRet=obj.StrCpyRemWhiteSp(Str1,Str2);
		System.out.println("After removing white space string are :"+sRet);
	}
}
/////////////////////////////////////////////////////////////////////
//
// Input	:	 India is my country
// output	:	 	indiaismycountry
//
////////////////////////////////////////////////////////////////////