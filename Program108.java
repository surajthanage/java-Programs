import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept row and column from user and Addition of even element
/////////////////////////////////////////////////////////////////////////////////
class Program108
{
	public static void main(String Arg[])
	{
		int i=0,j=0,iEvenSum=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int irow=sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int icol=sobj.nextInt();
		
		int Arr[][]=new int[irow][icol];
		
		System.out.println("Enter the element");
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
		
		System.out.println("Element of array is ");
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]%2==0)
				{
					iEvenSum=iEvenSum+Arr[i][j];
				}
			}
		}
		System.out.println("Addition is : "+iEvenSum);
	}
}

///////////////////////////////////////////////////////
//
// Input	:	row=3		col=3
//				1	2	3	4	5	6	7	8	9	
// output	:	20
///////////////////////////////////////////////////////