// spaces outside = j>(i) && j<=(2n-i)
// spaces inside left = i>2 && j>1 && j<i
// spaces inside right = i>2 && j<n && j>(2n-i+1)

import java.util.*;

public class HollowButterfly {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();
    int k = 2*n;

    // my approch
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=k; j++) {
        if((j>i && j<=k-i) || (i>2 && j>1 && j<i) || (i>2 && j>k-i+1 && j<k)) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
    for(int i=n; i>=1; i--) {
      for(int j=1; j<=k; j++) {
        if((j>i && j<=k-i) || (i>2 && j>1 && j<i) || (i>2 && j>k-i+1 && j<k)) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
