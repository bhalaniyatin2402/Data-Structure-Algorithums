import java.util.*;

public class DiamondPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    // upper half
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=(n+i-1); j++) {
        if(i+j < n+1) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
    // lower half
    for(int i=n; i>=1; i--) {
      for(int j=1; j<=(n+i-1); j++) {
        if(i+j < n+1) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
