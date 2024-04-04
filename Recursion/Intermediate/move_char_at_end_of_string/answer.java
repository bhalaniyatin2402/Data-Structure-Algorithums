public class MoveCharAtTheEndOfString {
  public static void moveAllXAtEnd(String str, int idx, int count, String newString) {
    if(idx == str.length()){
      for(int i=0; i<count; i++) {
        newString += "x";
      }
      System.out.print(newString);
      return;
    }

    char currChar = str.charAt(idx);
    if(currChar == 'x') {
      count++;
      moveAllXAtEnd(str, ++idx, count, newString);
    } else {
      newString += currChar;
      moveAllXAtEnd(str, ++idx, count, newString);
    }
  }

  public static void main(String args[]) {
    String str = "axbcxxd";
    moveAllXAtEnd(str, 0, 0, ""); 
  }
}
