import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountEvenDigit
// Description    : Count Even digit of that number
// Input	      : Integer
// Output	      : Integer
// Date	          : 5/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class NumberX
{
	public int iNo;
	
	public NumberX(int a)
	{
		this.iNo=a;
	}
	
	public int CountEvenDigit()
	{		
		int iDigit,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept number from user and 
// return count of even digit.
////////////////////////////////////////////////////////////////////////////

class Program171
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		int iRet=obj.CountEvenDigit();
		System.out.println("Total number of even digit is :"+iRet);
	}
}