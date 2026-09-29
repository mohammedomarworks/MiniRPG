public class Enemy extends Character {
    public Enemy(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override
    public void attack(Character enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + "with a magic spell! ");
        enemy.takeDamage(getAttackPower());
    }
}
