package labex2;

import java.util.*;

class Student{

    
    int a,b,c,d,e;
    String  Grade;
    int gradepoints;
    String lettergrade;
   
    void getmarks()
    {
     
       Scanner obj=new Scanner(System.in);
      System.out.println("Enter Mark of the subject 1");
       a=obj.nextInt();
        System.out.println("Enter Mark of the subject 2");
       b=obj.nextInt();
        System.out.println("Enter Mark of the subject 3");
       c=obj.nextInt();
        System.out.println("Enter Mark of the subject 4");
       d=obj.nextInt();
         System.out.println("Enter Mark of the subject 5");
        e=obj.nextInt();
    }
    void caltotal()
    {
      double avg=((a+b+c+d+e)/5);
        if((avg<=100) && (avg>=91)){
               Grade="Outstanding";
               gradepoints=10;
                lettergrade="O";
      }         

     
       else if((avg<=90) && (avg>=81))
       {
           Grade="Excellent";
           gradepoints=9;
           lettergrade="A+";
       } 
       else if(avg<=80 && avg>=71)
       {
            Grade="VeryGood";
           gradepoints=8;
           lettergrade="A";
       }  
       else if(avg<=70 && avg>=61)
       {
            Grade="Good";
           gradepoints=7;
           lettergrade="B+";
       }  
       else if((avg<=60) && (avg>=51))
              {   
            Grade="Average";
           gradepoints=6;
           lettergrade="B";
               }  
       else if(avg<50)
               {
               gradepoints=0;
               lettergrade="RA";
               }
       
    }
    void displaygrade()
    {
       
        
         System.out.println("Total mark of the student:"+(a+b+c+d+e));
        System.out.println("average mark of the student:"+(a+b+c+d+e)/5);
     
              System.out.println("Grade:"+ Grade);
          System.out.println("Grade points:"+gradepoints);
          System.out.println("Letter Grade:"+lettergrade);
         
       
        
       
    }
        
}
/*
 *
 * @author Desktop Pc
 */
public class gradeprgm {
    public static void main(String[] args){
       
      Student obj=new Student();
    
         obj=new Student();
         obj.getmarks();
         obj.caltotal();
         obj.displaygrade();
     }
        
    }