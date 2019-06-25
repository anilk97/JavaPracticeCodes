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
public class StringBuilderEx {
    public static void main(String args[])
    {
    StringBuilder sb=new StringBuilder();
    sb.append("Anil");
    System.out.println(sb);
    System.out.println(sb.capacity());
    System.out.println(sb.charAt(3));
    System.out.println(sb.deleteCharAt(3));
   sb.ensureCapacity(50);
   System.out.println(sb.capacity());
     System.out.println(sb.insert(3,'l'));
     System.out.println(sb.indexOf("n"));
      System.out.println(sb.lastIndexOf("A"));
       System.out.println(sb.substring(0,2));
        System.out.println(sb.reverse());
        
     
    
    
    }
    
}
