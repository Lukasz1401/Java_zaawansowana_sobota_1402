package Generic;

public class Main {

    public static void main(String[] args) {
        Pair<String, Car> pudelko1 = new Pair<>("Marian", new Car("Audi"));
        Pair<Lekarz, Double> pudelko2 = new Pair<>(new Lekarz(), 14.0);
        Pair pudelko3 = new Pair("String1", "String2");
        Object fist = (String)pudelko3.getFirst();
        Object second = (String)pudelko3.getSecond();
        System.out.println("====");
        System.out.println(pudelko3.getFirst());
        System.out.println(pudelko3.getSecond());
        System.out.println(pudelko1.getFirst());
        System.out.println(pudelko1.getSecond());
        System.out.println(pudelko2.getFirst());
        System.out.println(pudelko2.getSecond());

    }
}
