import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountRange
// Description    : Count Range of Digit that number
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
	
	public int CountRange(int a,int b)
	{		
		int iDigit,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			if(iDigit>a&&iDigit<b)
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
// return count of range digit.
////////////////////////////////////////////////////////////////////////////

class Program173
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number ");
		
		int iValue=sobj.nextInt();
		System.out.println("Enter starting digit ");
		
		int iValue1=sobj.nextInt();
		System.out.println("Enter ending digit ");
		
		int iValue2=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		int iRet=obj.CountRange(iValue1,iValue2);
		System.out.println("Total Digit of range of digit is :"+iRet);
	}
}