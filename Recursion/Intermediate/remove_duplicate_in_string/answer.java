public class RemoveDuplicateInString {
  public static boolean arr[] = new boolean[26];

  public static void removeDuplicates(String str, int idx, String newString) {
    if(idx == str.length()) {
      System.out.print(newString);
      return;
    }

    char currChar = str.charAt(idx);
    if(arr[currChar - 'a']) {
      removeDuplicates(str, ++idx, newString);
    } else {
      arr[currChar - 'a'] = true;
      newString += currChar;
      removeDuplicates(str, idx, newString);
    }
  }

  public static void main(String args[]) {
    String str = "abbccdda";
    removeDuplicates(str, 0, "");
  }
}
