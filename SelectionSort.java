/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

/**
 *
 * @author anil
 */
public class SelectionSort {
    
    public static void main(String args[])
    {
    int arr[]={5,7,4,9,3,2,1};
    
    for(int i=0;i<arr.length;i++)
    {
    int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smaller = arr[index];  
            arr[index] = arr[i];
            arr[i] = smaller;
    }
    
    for(int j=0;j<arr.length;j++)
    {
     System.out.println(arr[j]);   
    }
    
    }
    
    
    
    
    
}
