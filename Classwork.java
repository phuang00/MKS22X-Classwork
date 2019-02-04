import java.util.*;
public class Classwork{

  public static List<String> makeAllWords(int k){
    ArrayList<String> ans = new ArrayList<>();
    helper(k, ans, "");
    return ans;
  }

  private static void helper(int k, List<String> l, String word){
    if (k == 0) l.add(word);
    else{
      for (int i = 0; i < 3; i++){
        helper(k - 1, l, word + (char)('a' + i));
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(0));
    System.out.println(makeAllWords(1));
    System.out.println(makeAllWords(2));
    System.out.println(makeAllWords(3));

  }
}
