import java.util.*;
public class Classwork{

  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> ans = new ArrayList<>();
    helper(k, ans, "", maxLetter);
    return ans;
  }

  private static void helper(int k, List<String> l, String word, int maxLetter){
    if (k == 0) l.add(word);
    else{
      for (int i = 0; i < maxLetter; i++){
        helper(k - 1, l, word + (char)('a' + i), maxLetter);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(0,3));
    System.out.println(makeAllWords(1,3));
    System.out.println(makeAllWords(2,3));
    System.out.println(makeAllWords(3,3));
    System.out.println(makeAllWords(1,26));
    System.out.println(makeAllWords(2,26));
    System.out.println(makeAllWords(4,2));
  }
}
