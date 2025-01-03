public class makeWords {
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0) {
      System.out.println(result);
    }
    else {
      makeWords(remainingLetters - 1, result, alphabet)
    }
}
}
