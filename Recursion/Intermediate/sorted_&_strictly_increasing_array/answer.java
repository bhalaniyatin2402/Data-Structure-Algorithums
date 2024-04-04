public class SortedAndStrictlyIncreasingArray {
  public static void isSorted(int[] arr, int idx) {
    if(idx == arr.length - 1) {
      System.out.print("this array is sorted and strictly increasing");
      return;
    }

    if(arr[idx] < arr[idx + 1]) {
      System.out.print("this array  is neither sorted nor strictly increasing");
      return;
    }

    checkArr(arr, ++idx);
  }
  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5};
    int idx = 0;
    isSorted(arr, idx);
  }
}
