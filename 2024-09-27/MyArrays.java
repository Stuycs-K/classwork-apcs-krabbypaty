public class MyArrays {
  public static void main(String[] args) {
    int[] ary = { 5, 4, 3, 2, 1 };
    int[] ary2 = { 51, 2, -4, 0, 0 };
    int[] ary3 = { 3, 5, 1, -1, 23 };
    int[] ary4 = { 5, 4, 3, 2, 1 };
    int[] ary5 = { 5, 4, 3, 2, 1 };
    //arrayToString tests
    System.out.println(arrayToString(ary));
    System.out.println(arrayToString(ary2));
    System.out.println(arrayToString(returnCopy(ary)));
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
}
