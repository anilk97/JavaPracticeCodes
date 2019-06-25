/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// to run assertion coder uses it to debugging purpose ---------- java-enableassertion assertion
package javapep;

/**
 *
 * @author anil
 */
import java.util.*;
public class assertion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    assert age>=18:"Not a valid voter";
    System.out.println("check assertion on age"+age);
    }
    
    
}
