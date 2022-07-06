import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////
//
// Function name  : CountChar
// Description    : use to perfrom of string Count character
// Input	      : String
// Output	      : String
// Date	          : 16/04/2022
// Author	      : Suraj Sanjay Thanage
//
////////////////////////////////////////////////////////////////////

class StringX
{
	public int CountChar(String str,char ch)
	{
		int i=0,iCnt=0;
		
		for(i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept string and character from user and Count character frequency
/////////////////////////////////////////////////////////////////////////

class Program85
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=sobj.nextLine();
		
		System.out.println("Enter character you  want to coutn in that string");
		char cValue=sobj.next().charAt(0);
		
		StringX obj=new StringX();
		
		int iRet=obj.CountChar(str,cValue);
		System.out.println("Frequency of character is :"+iRet);
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 NITIN
// output	:	 String is palindrome.
//				
///////////////////////////////////////////////////////