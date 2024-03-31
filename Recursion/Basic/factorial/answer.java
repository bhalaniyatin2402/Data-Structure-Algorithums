public class PrintFactorial {
  public static int calcFactorial(int n) {
    if(n==0 || n==1) {
      return 1;
    }
    int fact_nm1 = calcFactorial(n - 1);
    int fact = n *  fact_nm1;
    return fact;
  }
  public static void main(String args[]) {
    int n = 5;
    int factorial = calcFactorial(n);
    System.out.print(factorial);
  }
}
