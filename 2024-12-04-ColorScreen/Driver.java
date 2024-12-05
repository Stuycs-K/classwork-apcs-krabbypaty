import java.util.Arrays;


public class Driver {

    public static void printBackground(int color2) {
        String backChar = "#"; 
        
        Text.color(color2);
        Text.go(1, 1);
        for (int i = 1; i < 81; i++) {
            System.out.print(backChar);
        }
        for (int i =1; i < 31; i++) {
            Text.go(i + 1, 1);
            System.out.println(backChar + " ".repeat(78) + backChar);
        }
        Text.go(31, 1);
        for (int i = 1; i < 81; i++) {
            System.out.print(backChar);
        }
    }

    public static void randomInteger() {
        int[] randomInt = new int[3];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * 99);
        }
        Text.go(2, 2);
        for (int i = 0; i < randomInt.length; i++) {
            if (randomInt[i] < 25) {
                Text.color(Text.RED);
            }
            else if (randomInt[i] >75) {
                Text.color(Text.GREEN);
            }
            else {
                Text.color(Text.WHITE);
            }
            System.out.print(" ".repeat(20) + randomInt[i]);
        }
        //System.out.print(" ".repeat(20) + randomInt[0] + " ".repeat(20) + randomInt[1] + " ".repeat(20) + randomInt[2]);
    }
    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        printBackground(Text.CYAN);
        randomInteger();
        System.out.println(Text.RESET);
    }
}

//+ " ".repeat(79) + backChar