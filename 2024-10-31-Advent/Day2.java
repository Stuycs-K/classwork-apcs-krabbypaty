import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
  public static String parse(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String line = "";
      while (input.hasNextLine()) {
        line += input.nextLine() + "\n";
      }
      String[] values = line.split(", ");
      System.out.println("file found");
      return line;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "shit";
    }
  }

  public static void main(String[] args) {
    String lines = parse("Tester1.txt");
    System.out.println(lines);
  }
}