import java.util.*;

public class HollowRectangleOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Hollow Rectangle Width: ");
    int width = sc.nextInt();
    System.out.print("Enter Hollow Rectangle Height: ");
    int height = sc.nextInt();

    for(int i=1; i<=height; i++) {
      for(int j=1; j<=width; j++) {
        if(i == 1 || i == height) {
          System.out.print("*");
        } else {
          if(j == 1 || j == width) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
