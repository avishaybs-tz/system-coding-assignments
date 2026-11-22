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
        Item[] updated = new Item[inventory.length + 1];
        for (int i = 0; i < inventory.length; i++) {
            updated[i] = inventory[i];
        }
        updated[inventory.length] = item;
        this.inventory = updated;
    }

    public int calculateInventoryValue() {
        int sum = 0;
        for (int i = 0; i < inventory.length; i++) {
            sum += inventory[i].getValue();
        }
        return sum;
    }

    public boolean hasMagicalItem() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isMagical()) {
                return true;
            }
        }
        return false;
    }
}
