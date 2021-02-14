package Enum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter your number PESEL: ");
        long pesel = scanner.nextLong();
        // M i K
        // M F
        //Rozwiazanie 1
/*        System.out.println("What is your sex ( FEMALE - Woman, MALE - Man): ");
        Sex userSex = Sex.valueOf(scanner.next());
        Citizen cit1 = new Citizen(name, surname, pesel, userSex);*/
        System.out.println("What is your sex ( 1 - Woman, 2 - Man): ");
        String readSexValue = scanner.next();
        Sex userSex; //obiekt klasy Sex(Enum)
        //Rozwiazanie 2
        switch (readSexValue) {
            case "1":
                userSex = Sex.FEMALE;
                break;
            case "2":
                userSex = Sex.MALE;
                break;
            default:
                userSex = Sex.FEMALE;
        }
        Citizen cit1 = new Citizen(name, surname, pesel, userSex);
        System.out.println(cit1);
    }
}
