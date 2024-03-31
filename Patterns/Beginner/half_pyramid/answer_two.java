import java.util.*;

// first part of half pyramid
public class HalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    // my approch
    for(int i=n; i>=1; i--) { // 4, 3, 2, 1
      for(int j=1; j<=n; j++) { // 
        if(i-j <= 0) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    // solution
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=(n-i); j++) {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
