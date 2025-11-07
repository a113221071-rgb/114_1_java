public class Role {
    private String name;
    private int attackPower;
    private double health;

    // 建構子：姓名、攻擊力、生命值
    public Role(String name, int attackPower, double health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }
    // 取得姓名
    public String getName() {
        return name;
    }
    // 取得攻擊力
    public int getAttackPower() {
        return attackPower;
    }
    // 取得生命值
    public double getHealth() {
        return health;
    }
    // 設定生命值
    public void setHealth(double health) {
        this.health = health;
    }

    //檢查角色是否存活
    public boolean isAlive() {
        return health > 0;
    }
    @Override
    public String toString() {
        return "角色名稱: " + name + ", 攻擊力: " + attackPower + ", 生命值: " + health;
    }
}
