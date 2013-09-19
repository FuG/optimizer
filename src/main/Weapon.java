package main;

/**
 * Created with IntelliJ IDEA.
 * User: gfu
 * Date: 9/19/13
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Weapon {
    public static enum FiringMode {
        SINGLE,
        BURST,
        AUTO;
    }

    public class Recoil {
        public float up,
                down,
                left,
                right;
    }
}
