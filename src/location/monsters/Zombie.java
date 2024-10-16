package location.monsters;

public class Zombie extends Monsters{

    private static final int zombieDamageValue = 3;
    private static final int zombieHealthValue = 10;
    private static final int zombiePrizeMoneyValue = 4;
    private static final String zombieName = "ZOMBIE";

    public Zombie() {
        super();
    }

    @Override
    protected void selectMonster() {
        this.damageValue = zombieDamageValue;
        this.healthValue = zombieHealthValue;
        this.prizeMoney = zombiePrizeMoneyValue;
        this.monsterName = zombieName;
    }
}
