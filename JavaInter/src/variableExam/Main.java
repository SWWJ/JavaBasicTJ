package variableExam;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
//   # 4-14

Scanner sc = new Scanner(System.in);

System.out.print("1부터 n까지의 합을 구합니다.n의 값:");
int n = sc.nextInt();

int total = n;

for(int i = 1; i <= total; i++) {
 total = total + i;
}
System.out.println("1부터 " + n + "까지의 합은 " + total + "입니다.");
  }
}