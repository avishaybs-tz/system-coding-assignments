//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Game {
    public static void simulateBattle(Player player, Enemy enemy) {
        System.out.println(player.getName() + " - level: " + player.getLevel() + " VS " + enemy.getName() + " - level: " + enemy.getLevel());
        if (player.getLevel() > enemy.getLevel()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        Item sword = new Item("Ice Sword", 120, true);
        Item shield = new Item("Guardian Shield", 90, false);

        Player p1 = new Player("Elara the Enchanter", 10, 2);
        p1.addItem(sword);

        Player p2 = new Player("Kai the Wind caller", 10, 1);
        p2.addItem(shield);

        Enemy goblin = new Enemy("Goblin", 10, 2, 3, false);
        GameWorld world = new GameWorld("Crystal path", new Player[]{p1, p2}, new Enemy[]{goblin}, 2);
        world.printAllPlayers();
        simulateBattle(p1, goblin);
    }

}
