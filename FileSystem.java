/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

/**
 *
 * @author anil
 */
public class FileSystem {
    public static void main(String args[]) throws Exception
    {
//    String filen = "test.txt";
//FileInputStream fin  = new FileInputStream(filen);
        
        
FileInputStream f1 = new FileInputStream("D:\\anil.txt");//it stores the data into byte array
// int a;
// while((a=f1.read())!=-1)
// {
// System.out.print((char)a);
// 
// }

//byte ba[]=new byte[20];
//f1.read(ba);
//for(byte i:ba)
//{
//System.out.print((char)i);
//}



//FileReader f2=new FileReader("D:\\anil.txt");//it stores the data into char array
//char c[]=new char[20];
//f2.read(c);
//for(char m:c)
//{
//System.out.print((char)m);
//}
//File f4=new File("D:\\anil.txt");
//System.out.println(f4.getName());
//System.out.println(f4.exists());
//System.out.println(f4.getPath());
//System.out.println(f4.canWrite());
//System.out.println(f4.getParent());
//System.out.println(f4.isDirectory());
//System.out.println(f4.canWrite());
//System.out.println(f4.isFile());

File f7=new File("abc");
f7.mkdir();
System.out.println(f7.exists());

String s=f7.getPath();
System.out.println(s);
File f8=new File(s+"\\a.txt");
f8.createNewFile();





    
    }
    
}
