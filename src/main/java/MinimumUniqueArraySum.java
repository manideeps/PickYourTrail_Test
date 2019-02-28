import java.util.Arrays;

public class MinimumUniqueArraySum {

  public static void main(String[] args) {

    int[] input_1 = new int[]{1, 2, 2, 3, 5, 6};
    int input_1_Output = 21; // Unique array is {1, 2, 4, 3, 5, 6}
    int input_1_Output_Actual = getMinimumUniqueSum(new int[]{1, 2, 2, 3, 5, 6});

    printOutput(input_1, input_1_Output, input_1_Output_Actual);

    int[] input_2 = new int[]{3, 2, 1, 2, 7};
    int input_2_Output = 17; // Unique array is {3, 2, 1, 4, 7}
    int input_2_Output_Actual = getMinimumUniqueSum(input_2);
    printOutput(input_2, input_2_Output, input_2_Output_Actual);


    int[] input_3 = new int[]{1, 2, 2};
    int input_3_Output = 6; // Unique array is {1, 2, 3}
    int input_3_Output_Actual = getMinimumUniqueSum(input_3);
    printOutput(input_3, input_3_Output, input_3_Output_Actual);


    int[] input_4 = new int[]{3, 3, 5, 5, 6};
    int input_4_Output = 17; // Unique array is {3, 1, 5, 2, 6}
    int input_4_Output_Actual = getMinimumUniqueSum(input_4);
    printOutput(input_4, input_4_Output, input_4_Output_Actual);


  }

  private static void printOutput(int[] input, int expected, int actual) {
    System.out.println("Input is " + Arrays.toString(input)+ " Expected Sum:" + expected + " Actual Sum :" + actual);
  }


  private static int getMinimumUniqueSum(int[] a) {

    Arrays.sort(a);

    int n = a.length;
    int min = (a[0] + 1) - a[0];
    int low = a[0];

    for (int i = 1; i < n; i++) {

      if (a[i] == a[i - 1]) {
        if (min > 0 && min < low) {
          a[i] = min;
          min++;
        } else {
          a[i] += 1;
        }
      }
    }

    return Arrays.stream(a).sum();

  }

}
