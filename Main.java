import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the RPG Game!");

        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();

        System.out.println("Choose your character: ");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        System.out.print("Enter the number of your choice: ");

        int characterChoice = scanner.nextInt();

        Character player;

        if (characterChoice == 1) {
            player = new Warrior(playerName, 100, 20);
        } else if (characterChoice == 2) {
            player = new Mage(playerName, 100, 15);
        } else if (characterChoice == 3) {
            player = new Archer(playerName);
        } else {
            System.out.println("Invalid choice. Defaulting to Warrior.");
            player = new Warrior(playerName, 100, 20);
        }

        System.out.println("Choose your enemy: ");
        System.out.println("1. Goblin");
        System.out.println("2. Dragon");
        System.out.println("3. Giant");
        System.out.print("Enter the number of your choice: ");

        int enemyChoice = scanner.nextInt();

        Enemy enemy;

        if (enemyChoice == 1) {
            enemy = new Enemy("Goblin", 50, 10);
        } else if (enemyChoice == 2) {
            enemy = new Enemy("Dragon", 150, 25);
        } else if (enemyChoice == 3) {
            enemy = new Enemy("Giant", 200, 30);
        } else {
            System.out.println("Invalid choice. Defaulting to Goblin.");
            enemy = new Enemy("Goblin", 50, 10);
        }
        
        System.out.println("Battle Start!");
        System.out.println(player.getName() + " vs " + enemy.getName());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("\n----------------------------");
            System.out.println(player.getName() + " HP: " + player.getHealth());
            System.out.println(enemy.getName() + " HP: " + enemy.getHealth());

            System.out.println("\nChoose your action: ");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.print("Enter the number of your choice: ");
            int actionChoice = scanner.nextInt();

            if (actionChoice == 1) {
                player.attack(enemy);
            } else if (actionChoice == 2) {
                player.heal(20);
                System.out.println(player.getName() + " heals for 20 HP!");
            } else {
                System.out.println("Invalid choice. You lose your turn!");
            }

            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("DEFEAT!");
            System.out.println(player.getName() + " was defeated by "
                    + enemy.getName() + ".");
        } else {
            System.out.println("VICTORY!");
            System.out.println(player.getName() + " defeated "
                    + enemy.getName() + "!");
        }
        System.out.println("Game Over!");
        scanner.close();
    }
}