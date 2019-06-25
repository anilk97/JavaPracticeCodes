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
//public class GenericClass<T> {
//    T ob;
//    void add(T ob)
//    {
//    this.ob=ob;
//    }
//    T getVal()
//    {
//    return this.ob;
//    }
//    
//}
//class demo3
//{
//public static void main(String args[])
//{
//GenericClass<Integer> gl=new GenericClass<Integer>();
//gl.add(90);
//System.out.println(gl.getVal());
//GenericClass<String> g2=new GenericClass<String>();
//g2.add("hello");
//System.out.println(g2.getVal());
//
//}
//}
//public class GenericClass<T,V> {//Double parameter with generics
//    T ob;
//    V ob1;
//    void add(T ob,V ob1)
//    {
//    this.ob=ob;
//    this.ob1=ob1;
//    }
//    T getKey()
//    {
//    return this.ob;
//    
//    }
//    V getValue()
//    {
//    return this.ob1;
//    }
//    void showTypes()
//    {
//    System.out.println(ob.getClass().getName());
//    System.out.println(ob1.getClass().getName());
//    }
//}
//class demo3
//{
//public static void main(String args[])
//{
//GenericClass<String,Integer> gl=new GenericClass<String,Integer>();
//gl.add("A",12);
//System.out.println(gl.getValue());
//System.out.println(gl.getKey());
//GenericClass<String,Double> g2=new GenericClass<String,Double>();
//g2.add("hello",10.1);
//System.out.println(g2.getValue());
//System.out.println(g2.getKey());
//System.out.println(g2.hashCode());
//
//
//}
//}



// class MyClass{}//Bounding parameters in generics
//class A1 extends MyClass{}
//class B1 extends A1{}
//class C1 extends B1{}
//
//class GenericClass<T extends MyClass> {
//    T ob1;
//    GenericClass(T ob)
//    {
//    ob1=ob;
//    }
//    T get()
//    {
//    return ob1;
//    }
//    void showTypes()
//    {
// 
//  System.out.println("Type of T is: "+ob1.getClass().getName());
//  }
//  
//}
//class TestGen3
//{
// public static void main(String args[])
// {
// 
// C1 ob3=new C1();
// GenericClass<C1> g1=new GenericClass<C1>(ob3);
// g1.showTypes();
// //GenericClass<String> g2=new GenericClass<String>("Hello");
// //g2.showTypes();
// 
// }
//}

class GenericClass{
    
    public static <T> void   sortMe(T[] ar)
    {
        Arrays.sort(ar);
        for(T a:ar)
        {
        System.out.println(a);
        }
        
    
    }
    public static void main(String args[])
    {
    Integer[] ar={6,2,9,1,7};
     Double[] ar1={6.5,2.1,9.3,1.1,7.2};
      Character[] ar2={'z','a','x','y'};
    sortMe(ar);
    sortMe(ar1);
    sortMe(ar2);
    
    }



}
