import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : ChkVowel
// Description    : Check vowels character
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
	
	public boolean ChkVowel()
	{
		int iCnt=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='i'||Arr[i]=='o'||Arr[i]=='u')
			{
				iCnt++;
				break;
			}
		}
		if(iCnt>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and check whether it 
// contain vowels in it or not.
////////////////////////////////////////////////////////////////////////////

class Program164
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		StringX obj=new StringX(str);
		boolean bRet=obj.ChkVowel();
		if(bRet==true)
		{
			System.out.println("string contain vowels ");	
		}
		else
		{
			System.out.println("string contain not vowels ");	
		}
	}
}

