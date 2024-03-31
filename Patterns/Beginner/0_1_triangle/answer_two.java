import java.util.*;

public class Triangle_0_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();
    int value = 1;

    // solution
    // outer loop
    for(int i=1; i<=n; i++) {
      // inner loop
      for(int j=1; j<=i; j++) {
        if((i+j) % 2 == 0) { // even
          System.out.print(1+" ");
        } else { // odd
          System.out.print(0+" ");
        }
      }
      System.out.println();
    }
  }
}
