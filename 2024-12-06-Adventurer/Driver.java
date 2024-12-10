import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Adventurer player = new Alchemist("fireball", "Singed", 100);
        Adventurer enemy = new CodeWarrior("Bob", 100, "java");
        System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, "
                + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
        System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, "
                + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport\" / quit");
        // Read one line of user input
        String userName = userInput.nextLine();
        if (userName.equals("a") || userName.equals(attack)) {

        }
        System.out.println("Username is: " + userName);
        /*
         * Adventurer Alchemy = new Alchemist("fireball", "Singed", 100);
         * Adventurer Alchemy2 = new Alchemist("fireboom", "Malzahar", 100);
         * System.out.println(Alchemy.getHP());
         * System.out.println(Alchemy.getSpecialMax());
         * System.out.println(Alchemy.getSpecial());
         * System.out.println(Alchemy.attack(Alchemy2));
         * System.out.println(Alchemy2.getHP());
         */
    }
}