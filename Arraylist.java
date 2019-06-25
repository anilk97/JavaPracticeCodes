/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author anil
 */
public class Arraylist {
    
    
    
    int nPage;
               String author;
               int edition;
               Arraylist(int n,String author ,int edition)
               {
                   this.author=author;
                   this.nPage=n;
                   this.edition=edition;
               
               }
}
class demo{
                static int display( ArrayList<Arraylist> al)
               {
                   
                   System.out.println("nPage"+" "+"author"+" " +"edition");
                     Arraylist b;
               Iterator it =al.iterator();
               while(it.hasNext())
               {
                   b=(Arraylist)it.next();
                System.out.println(b.nPage+" "+b.author+" "+b.edition);
                   //System.out.println(al);
               
               }
               return 0;
               }
    public static void main(String args[])
    {
//        ArrayList<String> al= new ArrayList<>();
//        al.add("Anil");
//         al.add("Vivek");
//          al.add("Pankaj");
//           al.add("Arvind");
//           System.out.println(al);
           
//           Iterator it =al.iterator();
//           while(it.hasNext())
//                System.out.print(it.next());
           
//           if(al.contains("anil"))
//           {
//            System.out.println("yes");
//           }
//           else
//           {
//            System.out.println("NO");
//           }
           
//           for(String a:al)
//                System.out.print(a);
           
           
//           for(int i=0;i<al.size();i++)
//           {
//            System.out.print(al.get(i));
//           }
               
          Arraylist a=new  Arraylist(50,"anil",1997); 
          Arraylist b=new  Arraylist(51,"pankaj",1998); 
          Arraylist c=new  Arraylist(52,"deepak",1999); 
        ArrayList<Arraylist> al= new ArrayList<Arraylist>(); //Generic type arraylist
        al.add(a);
         al.add(b);
          al.add(c);
          display(al);
        
        
        
    }
    
}

