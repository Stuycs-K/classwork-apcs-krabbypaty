import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Day1 {
  public static String[] parse(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String line = "";
      while (input.hasNextLine()) {
        line += input.nextLine();
      }
      String[] values = line.split(", ");
      System.out.println("file found");
      return values; 
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return new String[1];
    }
  }

  public static int distance(String[] values) {
    // n = 0, e = 1, s = 2, w = 3
    int[] direction = { 0, 1, 2, 3 };
    int xAxis = 0;
    int yAxis = 0;
    int dirCounter = 0;
    for (int i = 0; i < values.length; i++) {
    int magnitude = Integer.parseInt(values[i].substring(1));
    char dir = values[i].charAt(0);
    if (dir == 'R') {
      dirCounter += 1;
    } else {
      dirCounter -= 1;
    }
    if (dirCounter == -1) {
      dirCounter = 3;
    }
    if (dirCounter == 4) {
      dirCounter = 0;
    }
    if (dirCounter == 0) {
      yAxis += magnitude;
    }
    if (dirCounter == 1) {
      xAxis += magnitude;
    }
    if (dirCounter == 2) {
      yAxis -= magnitude;
    }
    if (dirCounter == 3) {
      xAxis -= magnitude;
    }
  }
    System.out.println(Integer.parseInt(values[36].substring(1)));
    return Math.abs(yAxis) + Math.abs(xAxis);
  }

  public static void main(String[] args) {
    String[] lines = parse("Tester1.txt");
    System.out.println(Arrays.toString(lines));
    System.out.println(distance(lines));
  }
}
