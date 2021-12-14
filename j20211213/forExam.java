package j20211213;

import java.util.Scanner;

public class forExam {
    public static void main(String[] args) {
        
       // 'Lines ?' 3 
       // *
       // **
       // ***

       int star = 0;
       Scanner sc = new Scanner(System.in);

       System.out.print("Lines? ");

       star = sc.nextInt(); 

    //    for(int j = 0; j < star; j++) {
    //     for(int i = 0; i < star; i++) {
    //           System.out.print("*");
    //      }
    //      System.out.println("");
    //     }

        for(int i = 0; i < star; i++) {
              System.out.println("*");
              for(int j = -1; j < i; j++) {
                System.out.print("*");
              }
        }

       
    //    for(int i = 0; i < star; i++) {
    //        System.out.println("*");
    //        for(int j = -1; j < i; j++) {
    //         System.out.print("*");
    //        }
    //     }
       
    }
}
