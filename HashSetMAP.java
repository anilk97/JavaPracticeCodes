/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author anil
 */
public class HashSetMAP {
     public static void main(String args[])
    {
        
//        HashSet<String> hs=new HashSet<String>();
//        hs.add("Z");
//        hs.add("B");
//        hs.add("C");
//        hs.add("D");
//                hs.add("D");
//
//         System.out.println(hs);
//    
//    Iterator itr=hs.iterator();  
//while(itr.hasNext()){  
//System.out.println(itr.next());  
//}  
//
//
//LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
//        lhs.add(1);
//        lhs.add(9);
//        lhs.add(2);
//        lhs.add(6);
//         System.out.println(lhs);
//         int arr[]={1,5,6,6,7,9,50,3};
//         
//         TreeSet<Integer> lk=new TreeSet<Integer>();
//         for(int i=0;i<arr.length;i++)
//         {
//          lk.add(arr[i]);
//          
//         }
//        
//         System.out.println(lk);
    
//    Iterator itr1=lhs.iterator();  
//while(itr1.hasNext()){  
//System.out.println(itr1.next());  
//}  
        HashMap<String,Integer> hm1=new HashMap<String,Integer>();
        hm1.put("Z",129);
         hm1.put("B",2987);
         hm1.put("C",66);
         hm1.put("D",654);
//         System.out.println( hm1);
//         Set s= hm1.entrySet();
//         Iterator it1= s.iterator();
//         while(it1.hasNext())
//         {
//         System.out.println(it1.next());
//         }
         for(Map.Entry<String,Integer> i:hm1.entrySet())
             System.out.println("key="+i.getKey()+" Value="+i.getValue()+" Hashcode="+i.hashCode());
             
        
//      LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
//        lhm.put("Z",129);
//        lhm.put("B",2987);
//        lhm.put("C",66);
//        lhm.put("D",654);
//         System.out.println(lhm);
//         Set s=lhm.entrySet();
//         Iterator it1= s.iterator();
//         while(it1.hasNext())
//         {
//         System.out.println(it1.next());
//         }
        
    }
    }

