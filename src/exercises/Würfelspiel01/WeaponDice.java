package exercises.Würfelspiel01;

import java.util.Random;

public class WeaponDice {
    private Weapon weapon;

    public void rollTheDice(){
        Random random = new Random();
        int dievalue = 0;
        dievalue += random.nextInt(1,5);

        if (dievalue == 1) {
            weapon = Weapon.CLUB;
        } else if (dievalue == 2) {
            weapon = Weapon.SPEAR;
        } else if (dievalue == 3) {
            weapon = Weapon.AXE;
        } else if (dievalue == 4) {
            weapon = Weapon.SWORD;
        }

    }
    public String getRolledWeapon() {
        return weapon.getDescription();
    }
    public int getRolledWeaponPower(){
        return weapon.getPower();
    }
}
