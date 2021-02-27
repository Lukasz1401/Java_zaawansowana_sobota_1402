package Generic;

public class Pair<T, V> {

    T first;
    V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}

/*
Zadanie: Napisać klase generyczną Pair (Para),
klasa powinna przechowywać dwie wartości dowolnych (nie koniecznie takich samych typów).
Klasa powinna mieć dwie metody typu get: getFirst i getSecond która zwraca kolejno pierwszy i drugi element pary.
Klasa powinna mieć 1 konsktuktor który przyjmuje dwa argumenty,
pierwszy takiego typu jak zmienna first i drugi jak second.
Konstruktor powinien ustawiać wartości first oraz second.
 */
