/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author anil
 */
public class priorityQueue {
    
    public static void main(String args[])
    {
    
    PriorityQueue<String> p=new  PriorityQueue<String>();
    p.add("Anil");
    p.add("Anil1");
    p.add("Anil2");
    p.add("Anil3");
    System.out.println(p);
    System.out.println("head:"+p.peek());  
    Iterator itr=p.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
    
    
    }
    
}
