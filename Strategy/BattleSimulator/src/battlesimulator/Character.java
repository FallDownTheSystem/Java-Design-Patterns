package battlesimulator;

public abstract class Character {
    
    private String character;
    public WeaponBehaviour weapon;

    public Character() {
    }
    public void fight() {
        weapon.useWeapon();
    }
    public void setWeapon(WeaponBehaviour w) {
        this.weapon = w;
    }

}
