import java.util.*;

public class Triangle_0_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();
    int value = 1;

    // my approach
    for(int i=1; i<=n; i++) {
      int num = value;
  
      for(int j=1; j<=i; j++) {
        System.out.print(num+" ");
        num = num == 1 ? 0 : 1;
      }

      value = value == 1 ? 0 : 1;
  
      System.out.println();
    }
  }
}
