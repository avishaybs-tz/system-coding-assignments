//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    // בנאי ברירת מחדל
    public Item() {
        this.name = "Unknown";
        this.value = 0;
        this.isMagical = false;
    }

    // בנאי עם פרמטרים
    public Item(String name, int value, boolean isMagical) {
        this.name = name;
        setValue(value); // שימוש בסט כדי לוודא תקינות ערך שלילי
        this.isMagical = isMagical;
    }

    // מחזירה את שם החפץ
    public String getName() {
        return name;
    }

    // מחזירה את ערך החפץ
    public int getValue() {
        return value;
    }

    // מעדכנת את הערך, במידה ושלילי ומאתחלת לאפס
    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    // מחזירה האם החפץ קסום
    public boolean isMagical() {
        return isMagical;
    }
    //מחזירה תיאור של החפץ
    @Override
    public String toString() {
        String result = "Name: " + name + "\nValue: " + value;
        if (isMagical) {
            result += "\nMagical item";
        }
        return result;
    }
}
