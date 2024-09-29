public class MyArrays {
  public static void main(String[] args) {
    int[] ary1 = { 5, 4, 3, 2, 1 };
    int[] ary2 = { 51, 2, -4, 0, 0 };
    int[] ary3 = { 3, 5, 1, -1, 23 };
    int[] ary4 = { -1 };
    int[] ary5 = { 0, 0 };
    // arrayToString tests
    System.out.println(arrayToString(ary1));
    System.out.println(arrayToString(ary2));
    // returnCopy tests
    System.out.println("Diff addresses? " + (returnCopy(ary1) != ary1) + " The array is " + arrayToString(returnCopy(ary1)));
    System.out.println("Diff addresses? " + (returnCopy(ary3) != ary3) + " The array is " + arrayToString(returnCopy(ary3)));
    // concatArray tests
    System.out.println(arrayToString(concatArray(ary1, ary2)));
    System.out.println(arrayToString(concatArray(ary5, ary4)));
  }

  public static String arrayToString(int[] ary) {
    String newAry = "[";
    for (int i = 0; i < ary.length; i++) {
      newAry += ary[i];
      if (i != ary.length - 1) {
        newAry += ", ";
      }
    }
    return newAry + "]";
  }

  public static int[] returnCopy(int[] ary) {
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      newAry[i] = ary[i];
    }
      return newAry;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] newAry = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      newAry[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      newAry[i + ary1.length] = ary2[i];
    }
    return newAry;
  }

}
