public class Insertion {
  // print array
  public static void printArray(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  // insertion sort
  public static void main(String args[]) {
    int[] arr = {9, 3, 2, 6, 8};

    for(int i=1; i<arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      
      while(j >= 0 && arr[j] > current) {
        arr[j+1] = arr[j];

        j--;
      }

      arr[j+1] = current;
    }
    printArray(arr);
  }
}
