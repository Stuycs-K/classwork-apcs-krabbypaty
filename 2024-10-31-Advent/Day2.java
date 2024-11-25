import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
  public static String code(String filename) {
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
      int xcor = 1;
      int ycor = 1;
      int number = nums[ycor][xcor];
      String code = "";
      for (int i = 0; i < directions.size(); i++) {
        for (int idx = 0; idx < directions.get(i).length(); idx++) {
          if (directions.get(i).charAt(idx) == 'U') {
            ycor -= 1;
          }
          if (directions.get(i).charAt(idx) == 'D') {
            ycor += 1;
          }
          if (directions.get(i).charAt(idx) == 'R') {
            xcor += 1;
          }
          if (directions.get(i).charAt(idx) == 'L') {
            xcor -= 1;
          }
          if (xcor < 0) {
            xcor = 0;
          }
          if (xcor > 2) {
            xcor = 2;
          }
          if (ycor < 0) {
            ycor = 0;
          }
          if (ycor > 2) {
            ycor = 2;
          }
          number = nums[ycor][xcor];
        }
        code += number;
      }
      return code;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "doesnt work";
    }
  }

  public static String code2(String filename) {
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
      String[][] nums = {{"0", "0", "1", "0", "0"}, {"0", "2", "3", "4", "0"}, {"5", "6", "7", "8", "9"}, {"0", "A", "B", "C", "0"}, {"0", "0", "D", "0", "0"}};
      System.out.println("file found");
      int xcor = 0;
      int ycor = 2;
      int newX = xcor;
      int newY = ycor;
      String number = nums[ycor][xcor];
      String code = "";
      for (int i = 0; i < directions.size(); i++) {
        for (int idx = 0; idx < directions.get(i).length(); idx++) {
          if (directions.get(i).charAt(idx) == 'U') {
            newY -= 1;
          }
          if (directions.get(i).charAt(idx) == 'D') {
            newY += 1;
          }
          if (directions.get(i).charAt(idx) == 'R') {
            newX += 1;
          }
          if (directions.get(i).charAt(idx) == 'L') {
            newX -= 1;
          }
          if (newX < 0) {
            newX = 0;
          }
          if (newX > 4) {
            newX = 4;
          }
          if (newY < 0) {
            newY = 0;
          }
          if (newY > 4) {
            newY = 4;
          }
          if (!nums[newY][newX].equals("0")) {
          xcor = newX;
          ycor = newY;
          }
          newY = ycor;
          newX = xcor;
          number = nums[ycor][xcor];
          System.out.println("" + ycor + "," + xcor);
        }
        code += number;
      }
      System.out.println(directions);
      return code;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "doesnt work";
    }
  }


  public static void main(String[] args) {
    System.out.println(code2("Tester1.txt"));
  }
}