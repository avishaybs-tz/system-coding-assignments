//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Game {
    // מדמה קרב לפי השוואת רמות ומעלה רמה למנצח
    public static void simulateBattle(Player player, Enemy enemy) {
        if (player == null || enemy == null) {
            return;
        }
        System.out.println(player.getName() + " - level: " + player.getLevel() + " VS " + enemy.getName() + " - level: " + enemy.getLevel());
        if (player.getLevel() >= enemy.getLevel()) {
            player.levelUp();
            System.out.println(player.getName() + " wins!");
        } else {
            enemy.levelUp();
            System.out.println(enemy.getName() + " wins!");
        }
    }

    // נקודת הכניסה שמריצה את יצירת הישויות, העולם וסימולציית הקרב
    static void main(String[] args) {
        Item grimoire = new Item("Grimoire", 140, true);
        Item iceSword = new Item("Ice Sword", 120, true);
        Item shield = new Item("Guardian Shield", 90, false);

        Player p1 = new Player("Elara the Enchanter", 10, 2);
        p1.addItem(grimoire);
        p1.addItem(iceSword);

        Player p2 = new Player("Kai the Wind caller", 10, 1);
        p2.addItem(shield);

        Enemy goblin = new Enemy("Goblin", 10, 2, 3, false);

        GameWorld world = new GameWorld("Crystal path", new Player[]{p1, p2}, new Enemy[]{goblin}, 2);
        System.out.println(world);
        world.printAllPlayers();

        System.out.println(p1.getName() + " - Inventory Value: " + p1.calculateInventoryValue());
        System.out.println(p2.getName() + " - Inventory Value: " + p2.calculateInventoryValue());
        System.out.println("Total World Value: " + world.getTotalValueOfWorld());

        simulateBattle(p1, goblin);
    }
}