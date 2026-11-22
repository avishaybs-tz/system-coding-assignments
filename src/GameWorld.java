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
}
