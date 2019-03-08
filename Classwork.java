import java.util.*;
public class Classwork{

  /*Choose a random pivot element between the start and end index inclusive,
 Then modify the array such that:
 *1. Only the indices from start to end inclusive are considered in range
 *2. A random index from start to end inclusive is chosen, the corresponding
 *   element is designated the pivot element.
 *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
 *4. all elements in range that are larger than the pivot element are placed after the pivot element.
 *@return the index of the final position of the pivot element.
 */
public static int partition ( int [] data, int start, int end){
  int index = (int)(Math.random() * (end - start + 1)) + start;
  int pivot = data[index];
  
  return index;
}

public static void main(String[] args) {
  System.out.println(partition(new int[] {4, 5, 6, 3, 5, 6}, 1, 5));
}

  /*public static List<String> makeAllWords(int k, int maxLetter){
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
    System.out.println(makeAllWords(2,6));
    System.out.println(makeAllWords(4,3));
  }*/
}
