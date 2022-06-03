import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Character
// Date	          : 6/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class PatternX
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number :");
		this.iNo=sobj.nextInt();
	}
	
	public void Display()
	{
		int iCnt=0;
		char ch='\0';
		for(iCnt=1,ch='A';iCnt<=iNo;iCnt++,ch++)
		{
			System.out.print("\t"+ch);
		}
		System.out.print("\t");
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept  number from user and display pattern
/////////////////////////////////////////////////////////////////////////

class Program4
{
	public static void main(String Arg[])
	{
		PatternX obj=new PatternX();
		
		obj.Accept();
		obj.Display();
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	 5 
// output	:	A 	B 	C 	D 	E	
//
///////////////////////////////////////////////////////