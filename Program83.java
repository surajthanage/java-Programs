import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////
//
// Function name  : CountSmall
// Description    : use to perfrom of string count Small character
// Input	      : String
// Output	      : String
// Date	          : 15/04/2022
// Author	      : Suraj Sanjay Thanage
//
///////////////////////////////////////////////////////////////////////

class StringX
{
	public int CountSmall(String str)
	{
		int iCnt=0,i=0;
		
		for(i=0;i<=str.length()-1;i++)
		{
			if((str.charAt(i)>='a') &&(str.charAt(i)<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept a string from user and count small chracter from string
/////////////////////////////////////////////////////////////////////////

class Program83
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter String");
		String Str=sobj.nextLine();
		
		StringX obj=new StringX();
		
		int iRet=obj.CountSmall(Str);
		System.out.println("Number of small character is :"+iRet);
	}
}
/////////////////////////////////////////////////////////////////////
//
// Input	:	 AbCdEHfg
// output	:	 	4
//
////////////////////////////////////////////////////////////////////