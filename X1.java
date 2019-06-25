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
public class X1 implements AutoCloseable{
    public void close()
    {
        System.out.println("Closing x class instance");
    }
    
    
}
class Test1
{
public static void main(String args[])
{
try(X1 o=new X1())
{
 System.out.println("try executed");

}
catch(Exception e)
{

}
}
}
