package WyjatkiZadanie1;

import java.util.Scanner;

public class Zad1 {

    public static double divide(int a, int b) throws CannotDivideBy0Exception {
        if(b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return  a / (double)b;
    }
}



/*
Zaimplementuj metodę divide , która docelowo ma podzielić dwie liczby
będące argumntami metody. W przypadku, gdy drugi parametr metody jest równy
0, powinien zostać wyrzucony niedomyślny wyjątek:
CannotDivideBy0Exception
 */