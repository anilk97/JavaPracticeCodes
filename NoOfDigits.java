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
public class NoOfDigits {
    public static void main(String args[])
    {
    String s="abvkndah123bsbdak678 asjhak jda";
    char arr[]= new char[s.length()];
    arr=s.toCharArray();
    int i=0;
    int wc=0,dc=0,lc=0;
    while(arr.length>i)
    {
    if(Character.isWhitespace(arr[i]))
    {
        wc++;
    
    }
    else if(Character.isDigit(arr[i]))
    {
    dc++;
    System.out.println();
    }
    else if(Character.isLetter(arr[i]))
    {
    lc++;
    }
    i++;
    }
    System.out.println("whiteSpace count="+wc);
    System.out.println("digit count="+dc);
    System.out.println("letter count="+lc);
    
    
    }
    
}
