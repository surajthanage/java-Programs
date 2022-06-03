import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : DisplayNonFact
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Integer
// Date	          : 10/04/2022
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
	
	public void DisplayNonFact()
	{
		int iCnt=0;
		for(iCnt=1;iCnt<iNo;iCnt++)
		{
			if(iNo%iCnt!=0)
			{
				System.out.println("\t"+iCnt);
			}
		}
	}
}

/////////////////////////////////////////////////////
// Accept  number to perfrom Display non factorial
/////////////////////////////////////////////////////

class Program19
{
	public static void main(String Arg[])
	{
		NumberX obj=new NumberX();
		obj.Accept();
		obj.DisplayNonFact();
		
	}
}

///////////////////////////////////////////////
//
// Input	:	12
// output	:	5 7 9 10 11
//			
////////////////////////////////////////////////