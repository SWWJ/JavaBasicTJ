package variableExam;

import java.util.Scanner;

public class TriaExam {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double h = 0;
    double b = 0;

    System.out.print("높이를 입력하세요 > "); h = sc.nextDouble();
    System.out.print("밑변의 길이를 입력하세요 > "); b = sc.nextDouble();
    double a = h*b/2;

    System.out.println(a);
    // System.out.printf("넓이는 : %d", a);
    }
}