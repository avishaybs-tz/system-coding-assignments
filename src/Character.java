//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Character {//תוכנית היוצרת דמות עם 3 תכונות שם בריאות ורמה
    private String name;
    private int health;
    private int level;

    // בנאי ברירת מחדל המאפס את שדות הדמות
    public Character() {
        this.name = "Unknown";
        this.health = 0;
        this.level = 0;
    }

    // בנאי עם פרמטרים הכולל בדיקת גבולות לבריאות ולרמה
    public Character(String name, int health, int level) {
        this.name = (name == null || name.isEmpty()) ? "Unknown" : name;
        this.health = Math.max(0, Math.min(10, health));
        this.level = Math.max(0, Math.min(5, level));
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    // מעלה את הרמה באחד כל עוד לא חורגים מהמקסימום (5)
    public void levelUp() {
        if (this.level < 5) {
            this.level++;
        }
    }

    // מוסיף בריאות ומוודא שלא חורגים מהטווח 0 עד 10
    public void heal(int amount) {
        if (amount > 0) {
            this.health = Math.min(10, this.health + amount);
        }
    }

    // מחזיר תיאור במילים של פרטי הדמות
    @Override
    public String toString() {
        return "Name: " + name + "\nHealth: " + health + "\nLevel: " + level;
    }
}
