/*
 Anonymous Inner class example:-
 */

package javapep;

/**
 *
 * @author anil
 */
public interface A {//cannot create objects of interface
    void meth();
    
    
}
 interface B
{
void meth1();
}

abstract class C{
abstract void meth2();
void meth3()
{
System.out.println("hello meth3 abstract");

}


}


class test
{
public static void main(String args[])
{
A ob = new A()//Anonymous in a class it is only making a reference of interface A not creating object of A
{

public void meth()
{
System.out.println("Anonymous implementation");

}
};

B ob1 = new B()//Anonymous in a class it is only making a reference of interface A not creating object of A
{

public void meth1()
{
System.out.println("Anonymous implementation in Interface B");

}
};
B o2=()->{//lamba implementation it can be implemented with function interface only
    //And function interface can only hold one methode
System.out.println("Lambda expressions");

};
o2.meth1();


test ob2 = new test(){

void meth2()
{

System.out.println("Abstract implementation");
}
};
ob.meth();
ob1.meth1();
//ob2.meth2();
}


}

