/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

class ExcepArray extends Exception
{
	ExcepArray(String s)
	{
	super(s);
	}
}
class t{
public static void main(String args[]) throws ExcepArray
{
	int arr1[]={1,5,7,8,9,10};
int arr2[]={1,5,7,8,9};
try
{
	int sum1=0;
	if(arr1.length==arr2.length)
	{
		for(int i=0;i<arr1.length;i++)
		{
			sum1=sum1+arr1[i]+arr2[i];
		}
                System.out.println("sumof two arrays ="+sum1);
                
	}
        else{
	
		 throw new ExcepArray("Not same size");  
                        }
}catch(Exception  e)
{
	System.out.println("Exception occured: "+e.getMessage());
}
	
}
}




