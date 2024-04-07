public class PrintAllPermutationsOfString {
  public static void permutations(String str, String combination) {
    if(str.length() == 0) {
      System.out.println(combination);
      return;
    }

    for(int i=0; i<str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str. substring(i+1);
      permutations(newStr, combination+str.charAt(i));
    }
  }

  public static void main(String args[]) {
    String str = "abc";
    permutations(str, "");
  }
}
