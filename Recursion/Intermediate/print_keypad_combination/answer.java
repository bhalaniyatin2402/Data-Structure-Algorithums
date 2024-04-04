public class PrintKeypadCombination {
  public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static void keypadComb(String str, int idx, String combination) {
    if(idx == str.length()) {
      System.out.println(combination);
      return;
    }

    char currChar = str.charAt(idx);
    String keys = keypad[currChar - '0'];

    for(int i=0; i<keys.length(); i++) {
      keypadComb(str, idx+1, combination+keys.charAt(i));
    }
  }

  public static void main(String args[]) {
    String str = "23";
    keypadComb(str, 0, "");
  }
}
