import java.util.Arrays;

public class CountingPairs {


  public static void main(String[] args) {

    int[] input_1 = new int[]{1, 1, 2, 2, 3, 3};
    int k_1 = 1;
    //Expected two { (1,2) (2,3) }
    System.out.println("Count of Pairs  with difference is :" + countPairs(input_1, k_1));

    int[] input_2 = new int[]{3, 3, 5, 6, 9, 7};
    int k_2 = 2;
    //Expected one { (5,7) }
    System.out.println("Count of Pairs  with difference is :" + countPairs(input_2, k_2));

  }

  static int countPairs(int[] a, int k) {

    a = Arrays.stream(a).distinct().toArray();
    int n = a.length;
    int left = 0;
    int right = 0;
    int count = 0;
    while (right < n) {
      if (a[right] - a[left] == k) {
        count++;
        left++;
        right++;
      } else if (a[right] - a[left] > k) {
        left++;
      } else {
        right++;
      }
    }

    return count;
  }
}
