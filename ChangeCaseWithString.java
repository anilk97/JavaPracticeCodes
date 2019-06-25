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
public class ChangeCaseWithString {
    public static void main(String args[])
    {
   

         String s1="tHis IS aN EXamPLE";
         char ar[]=new char[s1.length()];
         ar=s1.toCharArray();
         for(int i=0;i<ar.length;i++)
         {
         if(Character.isUpperCase(ar[i]))
         {
         ar[i]=Character.toLowerCase(ar[i]);
         }
         else if(Character.isLowerCase(ar[i]))
         {
         ar[i]=Character.toUpperCase(ar[i]);
         } 
         
         }
         String se=new String(ar);
         System.out.println(se);
    
    
}
}
    
    

