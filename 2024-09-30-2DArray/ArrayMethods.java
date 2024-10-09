//Vanna Lei; vlei60@stuy.edu and Harrison Lee; hlee60@stuy.edu

public class ArrayMethods {
    // 1. Write both your names + emails at the top of the document as a comment.

    // 2. Copy your arrToString method from before.
    /**
     * Return a String that represets the array in the format: "[2, 3, 4, 9]"
     * Note the comma+space between values, and between values
     */
    public static void main(String[] args) {
        int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = new int[][] { { 7, 8, 9 }, { 0, 1 }, { 8 } };
        int[][] arr3 = new int[][] { {} };
        int[][] arr4 = new int[][] { { -4, 3 }, { -4, 3 }, { 0, 2, -2 } };
        int[][] arr5 = new int[][] { { 0, -1 }, {}, { 0, 2, -2 } };
        int[][] arr6 = new int[][] { {0}, {2}};
        // arrtostring 2d array test
        System.out.println(arrToString(arr1));
        System.out.println(arrToString(arr2));
        System.out.println(arrToString(arr3));
        // arr2dSum tests
        System.out.println("Expected 21 and got " + (arr2DSum(arr1)));
        System.out.println("Expected 33 and got " + (arr2DSum(arr2)));
        System.out.println("Expected 0 and got " + (arr2DSum(arr3)));
        //swapRC tests
        System.out.println("expected {{1,4},{2,5},{3,6}} actual:" + arrToString(swapRC(arr1)));
        System.out.println("expected {{0}, {2}} actual:" + arrToString(swapRC(arr6)));
        // replaceNegative tests
        System.out.println("expected {{1, 3}, {0, 3}, {0, 2, 1}} actual:");
        replaceNegative(arr4);
        System.out.println("expected {{1, 0}, {}, {0, 2, 1}} actual:");
        replaceNegative(arr5);
        // copy tests
        System.out.println("Expected { { 1, 2, 3 }, { 4, 5, 6 } }" + "Got:" + arrToString(copy(arr1)));
        arr1 = new int[][] {{5, 6}, {6, 4}};
        System.out.println("Expected {{5, 6}, {6, 4}}" + "Got:" + arrToString(copy(arr1)));
    }

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

    // 3. Write arrToString, with a 2D array parameter.
    // Note: Different parameters are allowed with the same function name.
    /**
     * Return a String that represets the 2D array in the format: "[[2, 3, 4],
     * [5, 6, 7], [2, 4, 9]]" Note the comma+space between values, and between
     * arrays You are encouraged to notice that you may want to re-use previous
     * code, but you should NOT duplicate that code. (Don't copy/paste or retype
     * it)
     */
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
    // this should use arrToString(int[])

    /* Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int idx = 0; idx < nums[i].length; idx++) {
                sum += nums[i][idx];
            }
        }
        return sum;
    }

    /**
     * Rotate an array by returning a new array with the rows and columns
     * swapped. You may assume the array is rectangular and neither rows nor
     * cols is 0. e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
     */
    public static int[][] swapRC(int[][] nums) {
        int[][] newArr = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int idx = 0; idx < nums[i].length; idx++) {
                newArr[idx][i] = nums[i][idx];
            }
        }
        return newArr;
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

    public static int[] returnCopy(int[] ary) {
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
}

