import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountDiff
// Description    : Difference between even or odd of Digit that number
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
	
	public int CountDiff()
	{		
		int iSumEven=0,iSumOdd=0;
		int iDigit,iCnt=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSumEven+=iDigit;
			}
			else
			{
				iSumOdd+=iDigit;
			}
			iNo=iNo/10;
		}
		return(iSumEven-iSumOdd);
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept number from user and 
// return difference between Even or Odd digit.
////////////////////////////////////////////////////////////////////////////

class Program175
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number ");
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		int iRet=obj.CountDiff();
		System.out.println("Difference of even or odd digit is :"+iRet);
	}
}