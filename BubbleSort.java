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
public class BubbleSort {
    public static void main(String args[])
    {
    int arr[]={5,7,4,9,3,2,1};
    
    int temp;
    for(int i=0;i<7;i++)
    {
    for(int j=0;j<7-i-1;j++)
    {
    if(arr[j]>arr[j+1])
    {
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    
    }
    
    }
    }
    
    for(int j=0;j<arr.length;j++)
    {
     System.out.println(arr[j]);   
    }
    }
    
    
    }

