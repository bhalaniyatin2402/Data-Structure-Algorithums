import java.util.*;

public class NumberPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    for(int i=1; i<=n; i++) {
      for(int j=1; j<=5; j++) {
        if((n-j+1)>i) {
          System.out.print(" ");
        } else {
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }
  }
}
