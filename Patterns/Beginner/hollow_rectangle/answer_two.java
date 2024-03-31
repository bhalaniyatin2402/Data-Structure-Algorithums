import java.util.*;

// solution
public class HollowRectangleTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Hollow Rectangle width: ");
    int w = sc.nextInt();
    System.out.print("Enter Hollow Rectangle Height: ");
    int h = sc.nextInt();

    for(int i=1; i<=h; i++) {
      for(int j=1; j<=w; j++) {
        if(i==1 || i==h || j==1 || j==w) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
