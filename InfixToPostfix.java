/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;

import java.util.Stack;



class InfixToPostfix { 
    
    static int postfix(String exp)
    {
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
    char c=exp.charAt(i);
    if(Character.isDigit(c))
    {
    //stack.push(c-'0');
        stack.pop();
    }
    else
    {
    
    
    }
    }
    return 0;
    }
  
}
