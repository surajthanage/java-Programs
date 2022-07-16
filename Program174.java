import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : MultDigit
// Description    : Multiplication of Digit that number
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
	
	public int MultDigit()
	{		
		int iMult=1;
		int iDigit,iCnt=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iMult*=iDigit;
			iNo=iNo/10;
		}
		return iMult;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept number from user and 
// return Multiplication of range digit.
////////////////////////////////////////////////////////////////////////////

class Program174
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number ");
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		int iRet=obj.MultDigit();
		System.out.println("Multiplication of all digit is :"+iRet);
	}
}