package Stack;

public class Main {

    GinekologRezydent ginekologRezydent = new GinekologRezydent();
    Lekarz l = new GinekologRezydent();
    PracownikSzpitala ps = new GinekologRezydent();
    Object o1 = new GinekologRezydent();
    GinekologRezydent gr = (GinekologRezydent) o1;
    DefaultArrayStack aso = new DefaultArrayStack();
    aso.push("String");
    int newElement = 16;
    aso.push(newElement);
    aso.push(new PracownikSzpitala());
    Object ps2o = aso.pop();
    PracownikSzpitala ps2 = (PracownikSzpitala) ps2o;
    // tu jest błąd bo jest próba zrzutowania liczy Integer na pracownika szpitala
    Object ps3o = aso.pop();
    PracownikSzpitala ps3 = (PracownikSzpitala) ps3o;
    System.out.println("AAAAAAAAAAA");
}

}
