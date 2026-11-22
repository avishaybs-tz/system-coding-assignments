//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Player extends Character {
    private Item[] inventory;

    public Player(String name, int health, int level) {
        super(name, health, level);
        this.inventory = new Item[0];
    }

    public Player(String name, int health, int level, Item[] inventory) {
        super(name, health, level);
        this.inventory = inventory;
    }

    public void addItem(Item item) {
        this.inventory[0] = item;
    }
}
