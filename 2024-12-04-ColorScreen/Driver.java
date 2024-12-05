import java.util.Arrays;


public class Driver {

    public static void printBackground(int color2) {
        String backChar = "#"; 
        
        Text.color(color2);
        for (int i = 0; i < 80; i++) {
            System.out.print(backChar);
        }
        System.out.println();
        for (int i =0; i < 30; i++) {
            System.out.println(backChar + " ".repeat(78) + backChar);
        }
        for (int i = 0; i < 80; i++) {
            System.out.print(backChar);
        }
    }

    public static void randomInteger() {
        int[] randomInt = new int[3];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * 99);
        }
        System.out.println(Arrays.toString(randomInt));
    }
    public static void main(String[] args) {
        printBackground(Text.CYAN);
        randomInteger();
    }
}

//+ " ".repeat(79) + backChar