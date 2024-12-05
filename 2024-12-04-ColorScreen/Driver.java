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
    public static void main(String[] args) {
        printBackground(Text.CYAN);
    }
}

//+ " ".repeat(79) + backChar