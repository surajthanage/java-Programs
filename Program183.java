import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : StrNCampX
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
	public int iNo;
	
	public StringX(String src,String dest,int no)
	{
		this.str1=src;
		this.str2=dest;
		this.iNo=no;
	}
	
	public boolean StrNCampX()
	{	
		if(str2.length()>iNo)
		{
			iNo=str2.length();
		}
		
		int iCnt=0;	
		for(int i=0;i<iNo;i++)
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

class Program183
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		System.out.println("Enter  number you want to compair no of string chracter");
		int iValue=sobj.nextInt();
		
		StringX obj=new StringX(str1,str2,iValue);
		
		boolean bRet=obj.StrNCampX();
		if(bRet==true)
		System.out.println("String are equal :");
		else
		System.out.println("String are not equal :");

	}
}