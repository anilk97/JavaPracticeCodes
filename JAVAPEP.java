/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.ArrayList;

/**
 *
 * @author anil
 */
public class JAVAPEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       
        
      ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(10);
       al.add(20);
        al.add(30);
         al.add(40);
         System.out.println(al);
        System.out.println(al.get(2));
        al.set(2,90);
         System.out.println(al);
         al.add(1,60);
         System.out.println(al);
          System.out.println(al.indexOf(60));
        
    
     System.out.println(al.subList(2,4));//sublist
     
    ArrayList<Integer> al1=new ArrayList<Integer>();
    al1=al;
//    System.out.println(al1);
     //System.out.println(al1);
    //System.out.println(al1.removeAll(al1));
     //System.out.println(al1);
    // al.retainAll(al1);//it will retains all the members which are in al
      //System.out.println(al);
//    al1.clear();
//       System.out.println(al1);
    
    
        
    }
    
}
