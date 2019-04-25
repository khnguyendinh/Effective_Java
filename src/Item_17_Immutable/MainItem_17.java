package Item_17_Immutable;

public class MainItem_17 {
    public static void main(String[] args) {
        Complex complex = new Complex(0.4,0.5);
        int hashCode = complex.hashCode();
        System.out.println("hashCode "+hashCode);
    }
}
