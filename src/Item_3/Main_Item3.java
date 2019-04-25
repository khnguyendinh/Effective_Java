package Item_3;

import Item_17_Immutable.Complex;

public class Main_Item3 {
    public static void main(String[] args) {
        Elvis elvis1 = Elvis.getInstance();
        Elvis elvis2 = Elvis.getInstance();
        System.out.println("equal = "+elvis1.equals(elvis2));
        Complex complex1 = new Complex(0.4,0.5);
        Complex complex2 = new Complex(0.4,0.5);
        System.out.println("equal2 = "+complex1.equals(complex2));
    }
}
