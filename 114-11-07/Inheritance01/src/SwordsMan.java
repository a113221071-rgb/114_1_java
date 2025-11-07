public class SwordsMan extends Role{
    // 建構子：姓名、攻擊力、生命值
    public SwordsMan(String name, int attackPower, double health) {
        super(name, attackPower, health);
    }

    // 攻擊對手
    public void attack(SwordsMan opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        System.out.println(this.getName() + " 攻擊 " + opponent.getName() + "，造成 " +
                this.getAttackPower() + " 點傷害"+opponent.toString());

    }
}
