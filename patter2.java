/* pattern:-
 1
121
1213121
121312141213121
1213121412131215121312141213121
 */

package javapep;

/**
 *
 * @author anil
 */
public class patter2 {
    
    public static void main(String args[])
    {
    int n=5;
    String s="1";
    System.out.println(s);
    for(int i=2;i<=n;i++)
    {
    s=s+i+s;
     System.out.println(s);
    
    }
//   char c='A';
//   int d=c;
//    
//    System.out.println(d);
    
    
    }
    
}
