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
public class palindrome {
    public static void main(String args[])
    {
   
//    int len=s1.length()-1;
//    while(len>=0)
//    {
//    System.out.println(s1.charAt(len));
//    len--;
    
    //}
         String s1="mdm";
    StringBuilder sb=new StringBuilder(s1);
//     working String s="";
//    s+=sb.reverse();
//    if(s.equals(s1))
    StringBuilder sb1=new StringBuilder(sb.reverse());
    
    if((sb.equals(sb1)))
    {
     System.out.println("Palindrome");
    }
    else{
        System.out.println(" not Palindrome");
    }
    
}
}
    
    

