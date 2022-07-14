import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountCapital
// Description    : Count capital character in string
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
	
	public int CountCapital()
	{
		int iCnt=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='A'&&Arr[i]<='Z')
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and count
// number of capital characters.
////////////////////////////////////////////////////////////////////////////

class Program161
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX(str);
		int iRet=obj.CountCapital();
		System.out.println("Number of capital letter is : "+iRet);	
	}
}

