import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : ToggleBit
// Description   : use to perfrom of 1 number toggle bit
// Input	      : Integer
// Output	      : Integer
// Date	          : 3/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public int ToggleBit(int iNo)
	{
		int iMask=0X10000001;
		int iResult=0,i=0,iCnt=0,iC=0;

		for(i=32;i<=1;i--)
		{
			iResult=iNo&iMask;
			iCnt++;
			if(iResult==1)
			{
				
				break;
			}
			
			iMask=iMask>>1;
		}
		System.out.println(iCnt);

		iMask=iMask>>iCnt-1;
		iResult=iNo^iMask;
		
		return iResult;
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number and position from user and
// toggle bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program72
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number");
		int iValue=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.ToggleBit(iValue);
		System.out.println("Updated number is : "+iRet);
		
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	10	
// output	:	11
//
///////////////////////////////////////////////////////