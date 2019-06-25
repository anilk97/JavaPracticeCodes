/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapep;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author anil
 */
public class DateTime {
    public static void main(String args[])
    {
//        LocalDate ld=LocalDate.now();
//    System.out.println(ld);
//    LocalTime lt=LocalTime.now();
//    System.out.println(lt);
//    
//    LocalDateTime ldt =LocalDateTime.now();
//    System.out.println(ldt);
//    
//     LocalDate ld1= LocalDate.of(2019,Month.JULY,13);
//     System.out.println(ld1);
//    
//     LocalDate ld2=ld1.plusDays(3);
//      System.out.println(ld2);
//      
//       LocalDate ld5=ld1.minusDays(3);
//      System.out.println(ld5);
//      
//       System.out.println(ld2.getDayOfMonth());
//        System.out.println(ld2.getDayOfWeek());
//                 System.out.println(ld1.isAfter(ld2));
//      
//     LocalDate ld3=LocalDate.parse("2016-05-30");
//      System.out.println(ld3);
//      
//       System.out.println(ld3.isLeapYear());
//    
//       DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy,HH:mm:ss");
//       String s=ldt.format(dtf);
//        System.out.println(s);
        
        Period p=Period.ofDays(10);
         System.out.println(p);
         
         LocalTime lt1=LocalTime.now();
         LocalTime lt2=lt1.plusHours(5);
         Duration d=Duration.between(lt1,lt2);
         System.out.println(d.get(ChronoUnit.SECONDS));
         System.out.println(d.toHours());//check hours between lt1 n lt2
         System.out.println(d.toMinutes());
         
        
       
    
    }
    
}
