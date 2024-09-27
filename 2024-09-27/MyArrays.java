public class MyArrays {
  public static void main(String[] args) {
  int[] ary = {5, 4, 3, 2, 1};
  System.out.println(arrayToString(ary));
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
}
