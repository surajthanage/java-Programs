import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayPattern
// Description    : Accept string and display pattern
// Output	      : string
// Date	          : 10/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class PatternX
{
	public String str;
	
	public PatternX(String s)
	{
		this.str=s;
	}
	
	public void DisplayPattern()
	{
		char Arr[]=str.toCharArray();
		int i=0,j=0;
		for(i=Arr.length-1;i>0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(Arr[j]+"\t");
			}
			System.out.println(" ");
		}
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(Arr[j]+"\t");
			}
			System.out.println(" ");
		}
	}	
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and 
// Dsplay pattern
/////////////////////////////////////////////////////////////////////////

class Program199
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		PatternX pobj=new PatternX(str);

		pobj.DisplayPattern();
		
		
	}
}

//////////////////////////////////////////////////////////////////////
// Input  : Hello
// Output :	
//			H	e	l	l	o
//			H	e	l	l	
//			H	e	l	
//			H	e
//			H	
//			H	e		
//			H	e	l	
//			H	e	l	l
//			H	e	l	l	o
//////////////////////////////////////////////////////////////////////