/*
 Singleton Class Implementation:
its restricts to create new objects
 */

package javapep;

/**
 *
 * @author anil
 */
public class SingleEx {
    private static SingleEx ob=null;//private object of  singleton class
    private SingleEx(){}//private constructor of singleton class
         public static SingleEx getInstance()//public static mmethod that accesses object
         {
         if(ob==null)
         {
         ob=new SingleEx();
         
         }
         return ob;
         }
    
    
    
    }
    
    
    
class y
{
public static void main(String args[]){
    SingleEx ob=SingleEx.getInstance();

}

}
