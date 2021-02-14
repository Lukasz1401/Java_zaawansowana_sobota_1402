package Wyjatki;
//obsługa wyjątków
public class ObslugaWyjatkow {

    public static void main(String[] args) {
/*        int[] tablica = new int[10];
        for(int i = 0; i < 11; i++) {
            tablica[i] = 10;
        }*/
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = sc.nextInt();
        try {
            int[] tablica = new int[10];
            for(int i = 0; i < k; i++) {
                tablica[i] = 10;
            }
            int i = 10;
            System.out.println(i/j);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println("Wyslapil wyjatek dzielenie przez 0 podaj inna liczbe");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Przekroczyles tablice");
        } catch (Exception e) {
            System.out.println("Wystalip nieznany blad skontaktuj sie z administratorem");
        } finally {
            // finaly wykonuje sie zawsze
            // niezaleznie od tego czy wyjatek wystapi czy nie
        }
        System.out.println("Dalej sobie dziala");
    }
