package main;

/**
 * Created with IntelliJ IDEA.
 * User: gfu
 * Date: 9/19/13
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Weapon {
    // Damage
    public float damage_max,
                 damage_min;
    public float damage_drop_start,
                 damage_drop_stop;

    // Spread
    public float spread_base;
    public float spread_increase,
                 spread_decrease;

    // Recoil
    public float recoil_up,
                 recoil_left,
                 recoil_right;
    public float recoil_decrease;
    public float recoil_first_shot_mult;

    // Misc.
    public int rounds_per_minute;

    // Tracking
    public float current_spread;
    public float current_recoil_vertical,
                 current_recoil_horizontal;
    public int current_bullet_count;


    public Bullet fire() {
        return null;
    }

    public void release() {
        current_bullet_count = 0;
    }
}
