// how long inner loop = n+i-1
// space before print the number = (i+j < (n+1))
// number to print = (n-j)+1 || (j-n)+1

import java.util.*;

public class PalindromicNumberPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    // first approch
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=(n+i-1); j++) {
        if(i+j < (n+1)) {
          System.out.print("  ");
        } else {
          System.out.print((Math.abs(n-j) + 1)+" ");
        }
      }
      System.out.println();
    }
  }
}
