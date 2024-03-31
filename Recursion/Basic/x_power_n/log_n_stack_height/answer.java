public class PrintXPowerNWithLogNStack {
  public static int calcPower(int x, int n) {
    if(n==0) {
      return 1;
    }
    if(n % 2 == 0) {
      return calcPower(x, n/2) * calcPower(x, n/2);
    } else {
      return calcPower(x, n/2) * calcPower(x, n/2) * x;o
    }
  }
  public static void main(String args[]) {
    int x = 2, n = 5;
    int result = calcPower(x, n);
    System.out.print(result);
  }
}
