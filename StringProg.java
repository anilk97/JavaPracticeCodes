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
public class StringProg {
    public static void main(String args[])
    {
    String s1="is";
    String s2="this is an issue that is to be resolved";
    int count=0,i=-1;
    while((i=s2.indexOf(s1,i+1))>=0)
    {
    count++;
    }
    System.out.println(count);
    }
}
    
    

