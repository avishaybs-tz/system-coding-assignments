//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Enemy extends Character {//מחלקת אוייב שיורשת את דמות
    private int damage;
    private boolean isBoss;

    // בנאי המאתחל אויב ושומר על טווח הנזק (1 עד 5)
    public Enemy(String name, int health, int level, int damage, boolean isBoss) {
        super(name, health, level);
        this.damage = Math.max(1, Math.min(5, damage));
        this.isBoss = isBoss;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isBoss() {
        return isBoss;
    }

    // מחזיר את פרטי הדמות ממחלקת העל דמות בתוספת ערך הנזק
    @Override
    public String toString() {
        return super.toString() + "\nDamage: " + damage;
    }
}
