import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : CountSmall
// Description    : Count Small character in string
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
	
	public int CountSmall()
	{
		int iCnt=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='a'&&Arr[i]<='z')
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and count
// number of Small characters.
////////////////////////////////////////////////////////////////////////////

class Program162
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX(str);
		int iRet=obj.CountSmall();
		System.out.println("Number of Small letter is : "+iRet);	
	}
}

