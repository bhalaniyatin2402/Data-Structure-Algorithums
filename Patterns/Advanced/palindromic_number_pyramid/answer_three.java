import java.util.*;

public class PalindromicNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    for(int i=1; i<=n; i++) {
      for(int j=1; j<=n+i; j++) {
        if(j<=n-i) {
          System.out.print("  ");
        } else if(j<=n) {
          System.out.print(n-j+1 + " ");
        } else {
          System.out.print(j-n + " ");
        }
      }
      System.out.println();
    }
  }
}
