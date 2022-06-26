import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////
//
// Function name  : CountCapital
// Description    : use to perfrom of string count capita character
// Input	      : String
// Output	      : String
// Date	          : 15/04/2022
// Author	      : Suraj Sanjay Thanage
//
///////////////////////////////////////////////////////////////////////

class StringX{
	public int CountCapital(String str)
	{
		int i=0,iCnt=0;
		
		for(i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				iCnt++;
			}
		}
		return iCnt++;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept a string from user and count capital chracter from string
/////////////////////////////////////////////////////////////////////////

class Program82
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter String");
		String Str=sobj.nextLine();
		
		StringX obj=new StringX();
		
		int iRet=obj.CountCapital(Str);
		System.out.println("Number of capital character is :"+iRet);
	}
}

/////////////////////////////////////////////////////////////////////
//
// Input	:	 ASDcvbASD
// output	:	 	6
//
////////////////////////////////////////////////////////////////////