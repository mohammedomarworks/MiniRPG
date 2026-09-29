public abstract class Character {
    private String name;
    private int health;
    private int attackPower;

    // constructor
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    //reduce health method
    public void takeDamage(int damage) {
        health = health - damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    //heal method
    public void heal(int amount) {
        health = health + amount;
        
        if (health > 100) {
            health = 100;
        }
    }
    public abstract void attack(Character enemy);
 
}
