import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
// Accept string from user and Display number of small character 
/////////////////////////////////////////////////////////////////////////
class Program87
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		int iCnt=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				iCnt++;
			}
		}
		System.out.println("Number of Small character is :"+iCnt);
		
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 HEllo
// output	:	3 
//				
///////////////////////////////////////////////////////