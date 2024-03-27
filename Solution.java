public class Solution {
  public static void main(String[] args) {
      String s = "try hello world";
      String answer = "";
      String[] s2 = s.split("");
      int num = 1;

      for(int i = 0; i<s2.length; i++) {
        num = s2[i].equals(" ") ? 1 : num + 1;
        // System.out.println(s2[i]);
        answer += num % 2 == 0 ? s2[i].toUpperCase() : s2[i].toLowerCase();
      }
      System.out.println(answer);
  }
}
