public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, 100 , 20);
    }
    @Override 
    public void attack(Character enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with a sword!");
        enemy.takeDamage(getAttackPower());
    }
}
