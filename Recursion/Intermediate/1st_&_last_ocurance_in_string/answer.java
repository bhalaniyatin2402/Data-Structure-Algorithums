public class FirstAndLastElementOcuranceInString {
  public static int first = -1;
  public static int last = -1;

  public static void findOcurance(String str, int idx, char elem) {
    if(idx == str.length()) {
      return;
    }
     
    if(elem == str.charAt(idx)) {
      if(first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }

    findOcurance(str, idx + 1, elem);
  }

  public static void main(String args[]) {
    String str = "abaacdaefaah";
    char elem = 'a';
    findOcurance(str, 0, elem);
    System.out.println(first);
    System.out.println(last);
  }
}
