public class FriendsPairing {
  public static int countPair(int n) {  // 4, 
    if(n <= 1) {
      return  1;
    }

    // single
    int way1 = countPair(n-1);

    // pair
    int way2 = countPair(n-2) * (n-1);

    return way1 + way2;
  }
  public static void main(String args[]) {
    int n = 4;
    System.out.println(countPair(n));
  }
}
