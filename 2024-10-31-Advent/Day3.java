import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
    public static String[] parse(String filename) {
        try {
          File file = new File(filename);
          Scanner input = new Scanner(file);    
          String line = "";
          while (input.hasNextLine()) {
            line = line + input.nextLine() + ", ";
          }
          String[] values = line.split(", ");
          System.out.println("file found");
          return values; 
        } catch (FileNotFoundException ex) {
          System.out.println("File not found");
          return new String[1];
        }
      }

      public static String message(String[] input) {
        int[] values = new int[26];
        for (int i = 0; i < input[0].length(); i++) {
            for (int idx = 0; idx < input.length; idx++) {
                char character = input[idx].charAt(i);
                int ascii = character - 97;
                values[ascii]++;
            }
        }
        System.out.println(Arrays.toString(values));
        return "pog";
      }

    public static void main(String[] args) {
    String[] lines = parse("Tester1.txt");
    System.out.println(Arrays.toString(lines));
    System.out.println(message(lines));
  }
}