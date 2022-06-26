import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////
//
// Function name  : CountWhiteSpace
// Description    : use to perfrom of string count white space
// Input	      : String
// Output	      : String
// Date	          : 14/04/2022
// Author	      : Suraj Sanjay Thanage
//
///////////////////////////////////////////////////////////////////////

class StringX
{
	public int CountWhiteSpace(String str)
	{
		int iCnt=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept a string from user and count white space from string
/////////////////////////////////////////////////////////////////////////

class Program81
{
	public static void main(String Arg[])
	{		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX();
		
		int iRet=obj.CountWhiteSpace(str);
		
		System.out.println("Total White space of String is : "+iRet);
	
		
	}
}
/////////////////////////////////////////////////////////////////////
//
// Input	:	 India is my country
// output	:	 3	
//
////////////////////////////////////////////////////////////////////