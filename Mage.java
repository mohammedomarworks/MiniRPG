public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override 
    public void attack(Character enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with a fireball!");
        enemy.takeDamage(getAttackPower());
    }
}
