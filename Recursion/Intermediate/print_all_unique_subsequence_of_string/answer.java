import java.util.HashSet;

public class PrintAllUniqueSubsequencesOfString {
  public static void subsequence(String str, int idx, String newString, HashSet<String> uniqueStr) {
    if(idx == str.length()) {
      if(uniqueStr.contains(newString)) {
        return;
      } else {
        System.out.println(newString);
        uniqueStr.add(newString);
        return;
      }
    }

    char currChar = str.charAt(idx);

    // to be part of string
    subsequence(str, idx+1, newString+currChar, uniqueStr);  

    // not to be a part of string
    subsequence(str, idx+1, newString, uniqueStr);

  }
  public static void main(String args[]) {
    String str = "aaa";
    HashSet<String> uniqueStr = new HashSet<>();
    subsequence(str, 0, "", uniqueStr);
  }
}
