public class Stringexample {
  public static void main(String[] args) {
    String myString = "AB";
    char[] myChars = myString.toCharArray();
    for (int i = 0; i < myChars.length; i++) {
      if(myChars[i] > 'Z' || myChars[i] > 'z') {
        myChars[i] = (char) (myChars[i] - 26);
    } else {
        myChars[i] += 1;
    }
      System.out.println(myChars[i]);
    }
    String answer = new String(myChars);
    System.out.println(answer);
  }
}








