import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    // write your tests here!
    // You can now use Arrays.toString(yourArray) instead of writing arrayToString
    // again.
    // Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make
    // sure yours is correct
    // do not use any other Arrays.return "";method()
    int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
    int[][] TwoDarr1 = new int[][] { { 2, 3, 0 }, { -5, -2, 9 } };
    int[][] TwoDarr2 = new int[][] { {}, {} };
    int[][] TwoDarr3 = new int[][] { { 3, 5, 1, 4 }, { 0, 0, 0 }, { 5, 6 } };
    //compare
    System.out.println("Built in:" + Arrays.toString(arr1) + " Mine:" + arrToString(arr1));
    System.out.println("Built in:" + Arrays.deepToString(TwoDarr1) + " Mine:" + arrToString(TwoDarr1));

    //countZeroes2d tests
    System.out.println("Expected 1" + " Mine:" + countZeros2D(TwoDarr1));
    System.out.println("Expected 0" + " Mine:" + countZeros2D(TwoDarr2));
    System.out.println("Expected 3" + " Mine:" + countZeros2D(TwoDarr3));

    // arr2dsum tests
    System.out.println("Expected 7" + " Mine:" + arr2DSum(TwoDarr1));
    System.out.println("Expected 0" + " Mine:" + arr2DSum(TwoDarr2));
    System.out.println("Expected 24" + " Mine:" + arr2DSum(TwoDarr3));

  }

  // 0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] ary) {
    String newstr = "[";
    for (int i = 0; i < ary.length; i++) {
      if (i == ary.length - 1) {
        newstr += ary[i];
      } else {
        newstr = newstr + (ary[i] + ", ");
      }
    }
    return newstr + "]";
  }

  // The name of different methods can be the same,
  // as long as the parameters are different! (type and/or quantity must be
  // different)
  // Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary) {
    String newStr = "[";
    for (int i = 0; i < ary.length; i++) {
      newStr += arrToString(ary[i]);
      if (i == ary.length - 1) {
        newStr += "";
      } else {
        newStr += ", ";
      }
    }
    return newStr + "]";
  }

  // 1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int idx = 0; idx < nums[i].length; idx++) {
        if (nums[i][idx] == 0)
        {
          sum +=1;
        }
      }
    }
    return sum;
  }

  // 2. Calculate the sum of a 2d array
  /*
   * Return the sum of all of the values in the 2D array
   * Use a nested loop instead of a helper method
   */
  public static int arr2DSum(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int idx = 0; idx < nums[i].length; idx++) {
        sum += nums[i][idx];
      }
    }
    return sum;
  }

  // 3. Modify a given 2D array of integer as follows:
  // Replace all the negative values:
  // -When the row number is the same as the column number replace
  // that negative with the value 1
  // -All other negatives replace with 0
  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int idx = 0; idx < vals[i].length; idx++) {
          if (vals[i][idx] < 0) {
              vals[i][idx] = 0;
          }
          if (i == idx) {
              vals[i][idx] = 1;
          }
      }
  }
  System.out.println(arrToString(vals));
  }

  // 4. Make a copy of the given 2d array.
  // When testing : make sure that changing the original does NOT change the copy.
  // DO NOT use any built in methods that "copy" an array.
  // You SHOULD write a helper method for this.
  // If you don't see a good way to do that, you should stop and look at prior
  // methods.
  public static int[][] copy(int[][] nums) {
    int[] newAry = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
          newAry[i] = ary[i];
        }
          return newAry;
      }

    public static int[][] copy(int[][] nums) {
        int[][] newArr = new int[nums.length][];
        for (int i = 0; i < nums.length; i++) {
      newArr[i] = returnCopy(nums[i]);
    }
    return newArr;
  }

  // 5. Rotate an array by returning a new array with the rows and columns
  // swapped.
  // You may assume the array is rectangular and neither rows nor cols is 0.
  // e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums) {
    return new int[1][1];
  }

  // 6. Make an HTML table by putting a table tag around the entire 2d array,
  // tr tags around each row, and td tags around each value.
  // You may use a helper method
  // Note there is no whitespace in the string, it all one line with no
  // spaces/tabs.
  // e.g. htmlTable(new int[][]{{1,2},{3}}) returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][] nums) {
    return "";
  }
}
