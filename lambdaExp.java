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
interface AA
{
    int returnval();

}
interface AA1
{
   void printParm(int a);

}
interface AA2
{
    int sum(int a,int b);

}
interface AA3
{
    void printSum(int a,double d);

}
interface AA4
{
    String greeting(String name);

}
public class lambdaExp {
    public static void main(String args[])
    {
    AA ob1=()->5;//{return 5}
    int ret=ob1.returnval();
    System.out.println(ret);
   
     AA1 ob2=(int x)->{ System.out.println("Parameter is="+x);};
     ob2.printParm(50);
     
     AA2 ob3=(int x,int y)->{return x+y;};
     
     System.out.println("sum is="+ob3.sum(50,70));
     
     
     AA3 ob4=(x,y)->{ System.out.println("int + double sum is="+(x+y));};
     
     ob4.printSum(50,70.0);
     
     
     
   AA4 ob5=s->"hello"+s;//{return name;};
     System.out.println(ob5.greeting("ANil"));
     
    
    
    }
    
}
