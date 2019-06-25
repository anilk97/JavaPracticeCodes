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
public class InsertionSort {
     public static void main(String args[])
    {
    int arr[]={5,7,4,9,3,2,1};
     int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int num = arr[j];  
            int i = j-1;  
            while ((i>-1)&&(arr[i]>num)) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1]=num;  
        }  
    for(int j=0;j<arr.length;j++)
    {
     System.out.println(arr[j]);   
    }
    }
     
      
    
}
