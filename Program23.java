import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : FactDiff
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Integer
// Date	          : 11/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class NumberX
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number ");
		this.iNo=sobj.nextInt();
	}
	
	public int FactDiff()
	{
		int iCnt=0,iSum=0,iNSum=0;
		for(iCnt=1;iCnt<iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				iSum=iSum+iCnt;
			}
			else
			{
				iNSum=iNSum+iCnt;
			}
		}
		return (iSum-iNSum);
	}
}

/////////////////////////////////////////////////////////////////////////////
// Accept  number to perfrom Differnce between factorial and non factorial
/////////////////////////////////////////////////////////////////////////////

class Program23
{
	public static void main(String Arg[])
	{
		NumberX obj=new NumberX();
		obj.Accept();
		int iRet=obj.FactDiff();
		System.out.println("Summation of non factor is : "+iRet);
	}
}

///////////////////////////////////////////////
//
// Input	:	12		10
// output	:	-34		-29
//			
////////////////////////////////////////////////