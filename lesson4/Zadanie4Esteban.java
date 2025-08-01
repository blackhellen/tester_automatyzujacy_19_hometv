package lesson4;



    public class Zadanie4Esteban {
        public static void main(String[] args) {

//ZADANIE 1
            int liczba = 85;  // tutaj wpisujesz dowolną liczbę od 0 do 100
            String ocena;

            if (liczba >= 90 && liczba <= 100) {
                ocena = "A";
            } else if (liczba >= 80 && liczba <= 89) {
                ocena = "B";
            } else if (liczba >= 70 && liczba <= 79) {
                ocena = "C";
            } else if (liczba >= 60 && liczba <= 69) {
                ocena = "D";
            } else if (liczba >= 0 && liczba < 60) {
                ocena = "F";
            } else {
                ocena = "Nieprawidłowa liczba!";
            }

            System.out.println("Ocena: " + ocena);
//ZADANIE 2
            double temperatura = 100;  // wpisz temperaturę
            char jednostka = 'F';      // 'F' lub 'C'
            double wynik;

            if (jednostka == 'F') {
                wynik = (temperatura - 32) * 5 / 9;
                System.out.println("Temperatura w stopniach Celsjusza: " + wynik);
            } else if (jednostka == 'C') {
                wynik = (temperatura * 9 / 5) + 32;
                System.out.println("Temperatura w stopniach Fahrenheita: " + wynik);
            } else {
                System.out.println("Nieprawidłowa jednostka. Użyj 'C' lub 'F'.");


            }
    //ZADANIE 3
            int liczbaa = 7; // tutaj wpisz dowolną liczbę całkowitą

            if (liczbaa % 2 == 0) {
                System.out.println("Liczba " + liczbaa + " jest parzysta.");
            } else {
                System.out.println("Liczba " + liczbaa + " jest nieparzysta.");
            }
        }

    }


