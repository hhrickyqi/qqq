public class Demo14 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("asan");
        Weapon weapon = new Weapon();
        weapon.setWeapon("asdas");



    }
}
class Hero{
    private String name;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
class Weapon{
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}