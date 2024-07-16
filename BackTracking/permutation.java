package BackTracking;

public class permutation {

  public static void permute(String str, String prefix, int[] count) {
    if (str.length() == 0) {
      System.out.println(prefix);
      count[0] += 1;
      return;
    }
    // Choose element
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String remaining = str.substring(0, i) + str.substring(i + 1);
      permute(remaining, prefix + ch, count);
    }
  }

  public static void main(String[] args) {
    String str = "Mah";
    int[] count = { 0 };
    permute(str, "", count);
    System.out.println("Total permutations: " + count[0]);
  }
}
