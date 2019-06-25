/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.Arrays;

/**
 *
 * @author anil
 */
public class HAshedIn {
    public static void main(String args[])
    {
    String s[]={"MasheIn","MashCode","Masze"};
    String k1=s[0];
    String res="";
    
   
    for(int i=0;i<k1.length();i++)
    {
    for(int j=i+1;j<=k1.length();j++)
    {
        
         String sub1 = k1.substring(i,j);
        for(int k=1;k<s.length;k++)
        {
        
        if (!s[k].contains(sub1)) 
        {
          break; 
        }
                      
        
        
        if((k == s.length && res.length() < sub1.length())) 
        {
         res = sub1;
         System.out.println(res);
        }
        }         
        
        
    
    
    }}
    
   
    }
}
    

