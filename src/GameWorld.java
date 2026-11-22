//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class GameWorld {
    private String name;
    private Player[] players;
    private Enemy[] enemies;
    private int difficulty;

    public GameWorld() {
        this.name = "Crystal";
        this.players = new Player[0];
        this.enemies = new Enemy[0];
        this.difficulty = 1;
    }

    public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty) {
        this.name = name;
        this.players = players;
        this.enemies = enemies;
        this.difficulty = difficulty;
    }

    public void addPlayer(Player player) {
        Player[] updated = new Player[players.length + 1];
        for (int i = 0; i < players.length; i++) {
            updated[i] = players[i];
        }
        updated[players.length] = player;
        this.players = updated;
    }

    public void printAllPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("------- Player " + (i + 1));
            System.out.println(players[i]);
        }
    }

    public int getTotalValueOfWorld() {
        int total = 0;
        for (int i = 0; i < players.length; i++) {
            total += players[i].calculateInventoryValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "World Name: " + name + "\nDifficulty: " + difficulty + "\nNumber of players: " + players.length;
    }
}