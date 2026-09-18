import java.util.Scanner;

public class Zadania02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ZADANIE 1
        System.out.println("Wprowadź liczbę, a program sprawdzi czy jest podzielna przez 3");
        int liczba3 = sc.nextInt();

        if (liczba3 % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }


        // ZADANIE 2
        System.out.println("Program sprawdza czy można zbudować trójkąt o podanych wymiarach. Wprowadź pierwszą długość boku: ");
        int bok1 = sc.nextInt();
        System.out.println("Wprowadź długość drugiego boku:");
        int bok2 = sc.nextInt();
        System.out.println("Wprowadź długość trzeciego boku: ");
        int bok3 = sc.nextInt();

        if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
            System.out.println("Da się zbudować trójkąt o podanych wymiarach");
        } else {
            System.out.println("Nie da się zbudować trójkąta");
        }


        // ZADANIE 3
        System.out.println("Program wypisuje wiekszą liczbę spośród dwóch. Wprowadź pierwszą liczbę: ");
        int liczbaa1 = sc.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int liczbaa2 = sc.nextInt();

        if (liczbaa1 > liczbaa2) {
            System.out.println(liczbaa1 + " jest większa");
        } else if (liczbaa2 > liczbaa1) {
            System.out.println(liczbaa2 + " jest większa");
        } else {
            System.out.println("Liczby są równe");
        }


        // ZADANIE 4
        System.out.println("Program wypisuje największą liczbę spośród trzech. Wprowadź pierwszą liczbę:");
        int number1 = sc.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int number2 = sc.nextInt();
        System.out.println("Wprowadź trzecią liczbę:");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " jest największe");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " jest największa");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " jest największa");
        } else {
            System.out.println("Wszystkie liczby są sobie równe");
        }


        // ZADANIE 5
        System.out.println("Wprowadź numer miesiąca (np. październik - 10):");
        int miesiac = sc.nextInt();
        switch (miesiac) {
            case 1: System.out.println("styczeń"); break;
            case 2: System.out.println("luty"); break;
            case 3: System.out.println("marzec"); break;
            case 4: System.out.println("kwiecień"); break;
            case 5: System.out.println("maj"); break;
            case 6: System.out.println("czerwiec"); break;
            case 7: System.out.println("lipiec"); break;
            case 8: System.out.println("sierpień"); break;
            case 9: System.out.println("wrzesień"); break;
            case 10: System.out.println("październik"); break;
            case 11: System.out.println("listopad"); break;
            case 12: System.out.println("grudzień"); break;
            default: System.out.println("Nieprawidłowy numer miesiąca");
        }


        // ZADANIE 6
        sc.nextLine(); // czyszczenie bufora po wczytaniu liczby
        System.out.println("Program sprawdza czy twoje imię jest takie samo jak autora programu. Wprowadź swoje imię bez polskich znaków:");
        String imie2 = sc.nextLine();
        String mojeImie = "Sandra";

        if (imie2.equals(mojeImie)) {
            System.out.println("Gratulacje użytkowniku! Masz takie samo imię jak twórca programu.");
        } else {
            System.out.println("Twoje imię nie jest takie samo");
        }


        // ZADANIE 7
        System.out.println("Program sprawdza pełnoletność. Wprowadź swój wiek:");
        int wiek = sc.nextInt();
        boolean pelnoletnosc = (wiek >= 18) ? true : false;
        System.out.println("Użytkownik jest pełnoletni. - " + pelnoletnosc);


        // ZADANIE 8
        System.out.println("Program sprawdza, czy rok jest przestępny, wprowadź rok:");
        int rok = sc.nextInt();
        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println("Wprowadzony rok jest przestępny");
        } else {
            System.out.println("Wprowadzony rok NIE jest przestępny");
        }


        // ZADANIE 9
        System.out.println("Program oblicza BMI. Wprowadź wzrost w metrach:");
        double wzrost = sc.nextDouble();
        System.out.println("Wprowadź wagę w kilogramach:");
        double waga = sc.nextDouble();

        double bmi = waga / (wzrost * wzrost);
        System.out.println("BMI wynosi: " + bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi > 24.9) {
            System.out.println("nadwaga");
        } else {
            System.out.println("waga prawidłowa");
        }


        // ZADANIE 10
        double cena = 0;
        int liczbaRat = 0;

        while (true) {
            System.out.println("Podaj cenę towaru (od 100 do 10000 zł): ");
            cena = sc.nextDouble();
            if (cena >= 100 && cena <= 10000) break;
            System.out.println("Błąd! Cena musi być z zakresu 100-10000 zł.");
        }

        while (true) {
            System.out.println("Podaj liczbę rat (od 6 do 48): ");
            liczbaRat = sc.nextInt();
            if (liczbaRat >= 6 && liczbaRat <= 48) break;
            System.out.println("Błąd! Liczba rat musi być z zakresu 6-48.");
        }

        double oprocentowanie = (liczbaRat <= 12) ? 0.025 : (liczbaRat <= 24 ? 0.05 : 0.10);
        double kwotaZOdsetkami = cena * (1 + oprocentowanie);
        double miesiecznaRata = kwotaZOdsetkami / liczbaRat;
        System.out.printf("Miesięczna rata wynosi: %.2f zł (łącznie z odsetkami: %.2f zł)\n", miesiecznaRata, kwotaZOdsetkami);


        // ZADANIE 11 KALKULATOR
        System.out.println("Witamy w kalkulatorze, możesz tu dodać, odjąć, mnożyć, dzielić dwie liczby");
        System.out.println("Wprowadź pierwszą liczbę:");
        double kalkA = sc.nextDouble();

        System.out.println("Wprowadź symbol operacji (+, -, *, /):");
        char symbol = sc.next().charAt(0);

        System.out.println("Wprowadź drugą liczbę:");
        double kalkB = sc.nextDouble();

        switch (symbol) {
            case '+':
                System.out.println("Wynik: " + (kalkA + kalkB));
                break;
            case '-':
                System.out.println("Wynik: " + (kalkA - kalkB));
                break;
            case '*':
                System.out.println("Wynik: " + (kalkA * kalkB));
                break;
            case '/':
                if (kalkB == 0) {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                } else {
                    System.out.println("Wynik: " + (kalkA / kalkB));
                }
                break;
            default:
                System.out.println("Błąd: Wprowadzono błędny symbol działania!");
        }
    }
}