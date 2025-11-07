public class Magician extends Role {
    // 治癒力
    private int healPower;

    // 建構子：姓名、攻擊力、生命值、治癒力
    public Magician(String name, int attackPower, double health, int healPower) {
        super(name, attackPower, health);
        this.healPower = healPower;
    }

    // 取得治癒力
    public int getHealPower() {
        return healPower;
    }
    // 攻擊對手（使用父類別的 getter/setter）
    public void attack(Magician opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        System.out.println(this.getName() + " 攻擊 " + opponent.getName() + "，造成 " + this.getAttackPower() + " 點傷害！");
    }
    // 治癒隊友
    public void heal(SwordsMan ally) {
        ally.setHealth(ally.getHealth() + this.healPower);
        System.out.println(this.getName() + " 治癒 " + ally.getName() + "，恢復 " + healPower + " 點生命值！"+ally);
    }

    public String toString() {
        return super.toString() + ", 治癒力: " + healPower;
    }
}
