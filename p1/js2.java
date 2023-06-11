import java.util.ArrayList;

public class js2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println("Array a: " + a);

        b.add(7);
        b.add(8);
        b.add(9);
        System.out.println("Array b: " + b);

        System.out.println("\nHasil Perkalian ArrayList: ");

        result.add(a.get(0) * b.get(0));
        result.add(a.get(0) * b.get(1));
        result.add(a.get(0) * b.get(2));

        result.add(a.get(1) * b.get(0));
        result.add(a.get(1) * b.get(1));
        result.add(a.get(1) * b.get(2));

        result.add(a.get(2) * b.get(0));
        result.add(a.get(2) * b.get(1));
        result.add(a.get(2) * b.get(2));

        System.out.println(a.get(0) + " x " + b.get(0) + " = " + result.get(0));
        System.out.println(a.get(0) + " x " + b.get(1) + " = " + result.get(1));
        System.out.println(a.get(0) + " x " + b.get(2) + " = " + result.get(2));
        System.out.println(a.get(1) + " x " + b.get(0) + " = " + result.get(3));
        System.out.println(a.get(1) + " x " + b.get(1) + " = " + result.get(4));
        System.out.println(a.get(1) + " x " + b.get(2) + " = " + result.get(5));
        System.out.println(a.get(2) + " x " + b.get(0) + " = " + result.get(6));
        System.out.println(a.get(2) + " x " + b.get(1) + " = " + result.get(7));
        System.out.println(a.get(2) + " x " + b.get(2) + " = " + result.get(8));
    }
}
