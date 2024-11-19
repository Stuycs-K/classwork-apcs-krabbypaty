import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1 {
  public static String[] parse(String filename) {
    try{
      Scanner input = new Scanner(filename);
      while (input.hasNextLine()) {
          String[] ary = input.nextLine().split(",");
      }
      return ary;
  }catch(FileNotFoundException ex){
    System.out.println("File not found");
    return "wrong";
  }
  }

  public static void main (String[] args) {
    System.out.println(parse("Day1Test"));
  }
}
