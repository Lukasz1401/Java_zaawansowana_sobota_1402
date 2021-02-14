package Wyjatki;

public class WyrzucanieWyjatkow {

    // Jedyna sytuacja w której wyjatek obsługiwany nie musi zostac obsłużony
    public static void main(String[] args) throws Exception {
        metoda3();
    }
    public static void metoda(String s) throws Exception {
        if(s.equals("Marian")) {
            System.out.println("Spoko");
        } else {
            throw new Exception("Nie jestes Marianem");
        }
    }
    public static  void metoda2() throws Exception {
        System.out.println("Dziala sobie metoda 2");
        metoda("sgfhgdf");
    }
    public static  void metoda3() throws Exception {
        System.out.println("Dziala sobie metoda 2");
        metoda2();
    }
}
