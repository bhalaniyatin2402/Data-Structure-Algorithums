public class countTotalPathInMaze {
  public static int countPath(int i, int j, int n, int m) {
    // if path reach to end of maze at right or bottom return 0. end of path
    if(i==n || j==m) {
      return 0;
    }
    // if path reach to distination return 1. add counnt by 1
    if(i==n-1 && j==m-1) {
      return 1;
    }

    // move right side 
    int countRight = countPath(i+1, j, n, m);

    // move downward side
    int countDownward = countPath(i, j+1, n, m);

    // total count
    int totalCount = countRight + countDownward;

    return totalCount;
  }

  public static void main(String args[]) {
    int n = 3, m = 3;
    int count = countPath(0, 0, n, m);
    System.out.println(count);
  }
}
