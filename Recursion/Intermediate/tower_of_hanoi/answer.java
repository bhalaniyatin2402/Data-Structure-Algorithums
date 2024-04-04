public class TowerOfHanoi {
  public static void towerOfHanoi(int n, String s, String h, String d) {
    if(n==1) {
      System.out.println("transfering disk " + n + " from " + s + " to " + d);
      return;
    }

    // transfer n-1 disk from src to helper using dest as helper
    towerOfHanoi(n-1, "S", "D", "H");

    // transfer n disk from src to dest
    System.out.println("transfering disk " + n + " from " + s + " to " + h);

    // transfer n-1 disk from helper to src using as helper
    towerOfHanoi(n-1, "H", "S", "D");
  }

  public static void main(String args[]) {
    int n=3;
    towerOfHanoi(n, "S", "H", "D");
  }
}
