import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : Revstr
// Description    : Display string reverse 
// Input	      : String
// Output	      : Integer
// Date	          : 3/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class StringX
{
	public String str;
	public char Arr[];
	
	public StringX(String str1)
	{
		this.str=str1;
		this.Arr=str.toCharArray();
	}
	
	public void Revstr()
	{
		int iCnt=0;
		
		for(int i=Arr.length-1;i>=0;i--)
		{
			System.out.print(Arr[i]);
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and check whether it 
// contain vowels in it or not.
////////////////////////////////////////////////////////////////////////////

class Program165
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX(str);
		obj.Revstr();
		
	}
}

