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
public class StringB {
    public static void main(String args[])
    {
//   StringBuffer sb=new StringBuffer("hello");
//     StringBuilder sb9=new StringBuilder("hello");
//     StringBuffer sb1=new StringBuffer();
//      StringBuffer sb2=new StringBuffer(100);
//       StringBuffer sb3=new StringBuffer(2);
//    System.out.println(sb.length());//5
//     System.out.println(sb.capacity());//bydefault capacity of stringbuffer is 16 =21
//   System.out.println(sb1.capacity());//16
//    System.out.println(sb2.capacity());//100
//    System.out.println(sb3.capacity());//2
//    sb.append("12345678901234567890");//44 double the size of sb and add two more for null of each string at end
//    System.out.println(sb.length());
//    System.out.println(sb.capacity());

        String s1="hello";
        String s2="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String s3=new String("hello");
        String s4=new String("hello");
         System.out.println(s3==s4);
         System.out.println(s1==s3);
         
         
        
        
    
    
    
    
   
    
    
    
    }
    
}
