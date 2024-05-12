public class fighter {
    private String name;
    private int health;
    private int attackPower;

    public fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(fighter opponent) {
        opponent.health -= this.attackPower;
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage!");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int getHealth() {
        return this.health;
    }

    public static void main(String[] args) {
        fighter fighter1 = new fighter("Irfan", 100, 10);
        fighter fighter2 = new fighter("Zeeshan", 100, 20);
        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
            System.out.println(fighter1.name + " remaining HP: " + fighter1.getHealth());
            System.out.println(fighter2.name + " remaining HP: " + fighter2.getHealth());
        }
        if (fighter1.isAlive()) {
            System.out.println(fighter1.name + " wins the fight!");
        } else {
            System.out.println(fighter2.name + " wins the fight!");
        }
    }
}
