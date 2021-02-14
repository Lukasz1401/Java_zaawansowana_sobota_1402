package Stack;

public interface Stack {


}

/*
Napisać w Javie klasę , która będzie działać jak stos, przechowujący obiekty typu String
W tym celu najpierw stworzyć interfejs Stack, który będzie zawierał metody:
- push  ----> metoda "wkłada" na szczyt stosu obiekt String, a jeśli stos się zapełnił to wyrzuca wyjącek z komunikatem "Full stack exception"
- pop -----> usuwa element z góry stosu i go zwraca, jeśli stos jest pusty to wyrzuca wyjątek z komunikatem "Empty stack exception"
- peek ------> działa tak jak pop ale tylko zwraca ostatni element na stosie NIE usuwając go
- isEmpty  ------> zwraca informację czy stos jest pusty czy nie.
Następnie stowrzyć klasę ArrayStack implementującą ten interfejs.
Zaimplementować to w ten sposób że dane w ArrayStack przechowywany są w talicy o stałym rozmiarze np. 100 a do testów zmniejszyć do 10
Podpowiedż klasa ArrayStack powinna posiadać pole "String[] stackData" i int buffor = 100;
 */
