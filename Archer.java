public class Archer extends Character {
    public Archer(String name) {
        super(name, 80, 15);
    }
    @Override 
    public void attack(Character enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with a bow and arrow!");
        enemy.takeDamage(getAttackPower());
    }
}
