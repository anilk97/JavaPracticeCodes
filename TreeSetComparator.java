/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author anil
 */

public class TreeSetComparator implements Comparator <TreeSetComparator> {
    int regNum;
    String name;
    double CGPA;
    boolean placed;
    TreeSetComparator(int regNumber, String name,double CGPA, boolean placed)
            {
                this.regNum=regNumber;
                this.name=name;
                this.CGPA=CGPA;
                this.placed=placed;
                
            
            }
    public int compare(TreeSetComparator tr, TreeSetComparator tr1)
    {
    if(tr.CGPA==tr1.CGPA)
    {
    return 0;
    
    }
    if(tr.CGPA>tr1.CGPA)
    {
    return 1;
    }
    else
    {
    return -1;
    }
    }
//     public String  toString() it will print object values as assigned to objects
//    {
//    return "\n regNo="+regNumber+"name="+name+"CGPA="+CGPA+"Place="+placed;
//    }
     public static void main(String args[])
     {
         TreeSetComparator tr=new TreeSetComparator(11503173,"Anil kushwaha",9.5,false);
         TreeSetComparator tr1=new TreeSetComparator(11503174,"Anil kushwaha1",9.53,true);
     TreeSet<TreeSetComparator> t=new TreeSet<TreeSetComparator>();
     t.add(tr);
      t.add(tr1);
   
     {
     
     }
     
     System.out.println(t);
     Iterator it=t.iterator();
     TreeSetEXp b;
     while(it.hasNext())
     {
         b=(TreeSetEXp)it.next();
      System.out.println(" CGPA= "+b.CGPA+" REG= "+b.regNum+" NAme= "+b.name+" Placed-- "+b.placed);
     }
     
      
     
     
     }

    

  
    
}
