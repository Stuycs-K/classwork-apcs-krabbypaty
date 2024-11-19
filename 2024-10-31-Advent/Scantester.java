
import java.util.Scanner;
public class Scantester {

public static void main(String args[]) {
  Scanner sc1 = new Scanner("This is a bunch of words");
  Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
  while (sc1.hasNext()) {
    System.out.println(sc1.next());
  }
  System.out.println(sum(sc2));
  System.out.println(TriangleTester.countTrianglesA("Test"));
  System.out.println(TriangleTester.countTrianglesB("test1"));
}
public static int sum(Scanner x) {
int sum = 0;
while(x.hasNextDouble()){
  sum += x.nextDouble();
}
return sum;
}
}
