package WyjatkiZadanie1;

public class Main {

    public static void main(String[] args) {
        try {
            double divide = Zad1.divide(10, 0);
            System.out.println(divide);
        } catch (CannotDivideBy0Exception e) {
            e.printStackTrace();
        }
    }
}
