/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;
import java.util.Stack;

/**
 *
 * @author anil
 */
public class PostfixEval {
    static int postfix(String exp)
    {
        Stack<Integer> stack=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
    char c=exp.charAt(i);
    if(Character.isDigit(c))
    {
    //stack.push(c-'0');
        stack.push(Integer.parseInt(""+c));
    }
    else
    {
    int val1=stack.pop();
     int val2=stack.pop();
    
     switch(c)
     {
         case '^':
         {
         stack.push((int)(Math.pow(val2,val1)));
         break;
         }
         case '+':
         {
         stack.push(val2+val1);
         break;
         }
          
           case '-':
         {
         stack.push(val2-val1);
         break;
         }
            case '*':
         {
         stack.push(val2*val1);
         break;
         }
             case '/':
         {
         stack.push(val2/val1);
         break;
         }
     
     }
    }
    
    }
    return stack.pop();
    
    }
    public static void main(String args[])
    {
    String exp="92+342^*-";
    System.out.println(postfix(exp));
    
    }
    
}
