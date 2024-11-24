import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
  public static int code(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String line = "";
      ArrayList<String> directions = new ArrayList<>();
      while (input.hasNextLine()) {
        line = input.nextLine();
        directions.add(line);
      }
      //now time to get the number
      int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      System.out.println("file found");
      for (int i = 0; i < directions.size(); i++) {
        for (int idx = 0; idx < directions.get(i).length(); idx++) {
          return 5;
        }
      }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 79;
    }
  }

  public static void main(String[] args) {
    System.out.println(code("Tester1.txt"));
  }
}