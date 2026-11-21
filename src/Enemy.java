//Avishai Ben Shushan
// id:207993437
//Matan Avraham Elhayani
//id:322856501
public class Enemy extends Character {
    private int damage;
    private boolean isBoss;

    public Enemy(String name, int health, int level, int damage, boolean isBoss) {
        super(name, health, level);
        this.damage = damage;
        this.isBoss = isBoss;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isBoss() {
        return isBoss;
    }
}
