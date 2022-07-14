import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountDiff
// Description    : Count Difference capital and small character in string
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
	
	public int CountDiff()
	{
		int iCnt1=0,iCnt2=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='a'&&Arr[i]<='z')
			{
				iCnt1++;
			}
		}
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='A'&&Arr[i]<='Z')
			{
				iCnt2++;
			}
		}
		
		return (iCnt1-iCnt2);
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and count
// number of Diff characters.
////////////////////////////////////////////////////////////////////////////

class Program163
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX(str);
		int iRet=obj.CountDiff();
		System.out.println("Difference of small and capital character in string is : "+iRet);	
	}
}

