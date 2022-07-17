import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : StrCampX
// Description    : compair tow string are equal or not
// Input	      : String
// Output	      : boolean
// Date	          : 7/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class StringX
{
	public String str1;
	public String str2;
	
	public StringX(String src,String dest)
	{
		this.str1=src;
		this.str2=dest;
	}
	
	public boolean StrCampX()
	{	
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		int iCnt=0;	
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
			}
		}
		return true;
		
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept two string from user and
// compair both string equal or not
////////////////////////////////////////////////////////////////////////////

class Program182
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		
		StringX obj=new StringX(str1,str2);
		
		boolean bRet=obj.StrCampX();
		if(bRet==true)
		System.out.println("String are equal :");
		else
		System.out.println("String are not equal :");

	}
}