//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    public Item() {
        this.name = "Unknown";
        this.value = 0;
        this.isMagical = false;
    }

    public Item(String name, int value, boolean isMagical) {
        this.name = name;
        this.value = value;
        this.isMagical = isMagical;
    }

    public String getItemName() {
        return name;
    }

    public int getVal() {
        return value;
    }

    public boolean getIsMagical() {
        return isMagical;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public String toString() {
        return "Name: " + name + "\nValue: " + value + "\nMagical item";
    }
}
