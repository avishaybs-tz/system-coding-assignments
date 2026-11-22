//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class GameWorld {
    private String name;
    private Player[] players;
    private Enemy[] enemies;
    private int difficulty;

    // בנאי ברירת מחדל
    public GameWorld() {
        this.name = "Crystal";
        this.players = new Player[0];
        this.enemies = new Enemy[0];
        this.difficulty = 1;
    }

    // בנאי עם פרמטרים הכולל אימות רמת קושי (1 עד 3) ומניעת null במערכים
    public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty) {
        this.name = (name == null || name.isEmpty()) ? "Crystal" : name;
        this.players = (players != null) ? players.clone() : new Player[0];
        this.enemies = (enemies != null) ? enemies.clone() : new Enemy[0];
        this.difficulty = Math.max(1, Math.min(3, difficulty));
    }

    // מוסיף שחקן חדש למערך השחקנים בעולם
    public void addPlayer(Player player) {
        if (player == null) {
            return;
        }
        Player[] updated = new Player[players.length + 1];
        for (int i = 0; i < players.length; i++) {
            updated[i] = players[i];
        }
        updated[players.length] = player;
        this.players = updated;
    }

    // מדפיס את כל השחקנים שקיימים בעולם
    public void printAllPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("------- Player " + (i + 1));
            System.out.println(players[i]);
        }
    }

    // מחשב את סך ערך החפצים של כלל השחקנים בעולם
    public int getTotalValueOfWorld() {
        int total = 0;
        for (Player player : players) {
            if (player != null) {
                total += player.calculateInventoryValue();
            }
        }
        return total;
    }

    // מחזיר תיאור של עולם המשחק
    @Override
    public String toString() {
        return "World Name: " + name + "\nDifficulty: " + difficulty + "\nNumber of players: " + players.length;
    }
}