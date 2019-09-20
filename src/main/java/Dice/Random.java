package Dice;

public class Random {
    public static void main(String[] args) {
        /*
         * Przykład losowania liczb
         */

        // Stworzenie obiektu klasy Random, który posłuży do loswania liczb
        java.util.Random r = new java.util.Random();

        /*
         * Losowanie liczb odbywa się po wywołaniu którejś z metod obiektu r
         * (klasy Random).
         * W zależności od typu liczby, którą należy wylosować, trzeba wybrać
         * odpowiednią metodę np.
         *     r.nextInt() - wylosuje liczbę całkowitą z zakresu int,
         *     r.nextFloat() - wylosuje liczbę rzeczywistą z zakresu float,
         *     itd. lista dostępnych metod klasy Random wyświetli się po
         *     wpisaniu nazwy obiektu i kropki w tym przypadku: r.
         *
         * W przypadku zapisu r.nextInt(n); wylosowana zostanie liczba z
         * zakresu od 0 do n-1, czyli chcąc wylosować liczbę z zakresu
         * od 1 do 10 (domkniętego) należy zapisać:
         * r.nextInt(10)+1;
         */

        // Losowanie liczby z zakresu [0,10] do zmiennej a.
        int a = r.nextInt(11); // deklaracja i definicja zmiennej
        System.out.println(a);

        // Losowanie liczby z zakresu [-5,15] i wyświetlenie jej na konsolę.
        System.out.println(r.nextInt(21) - 5);
        // 21, bo w przedziale [-5,15] jest 21 liczb i -5,
        // bo to najmniejsza liczba w zakresie.

        // Losowanie liczby z zakresu [-20,-10] do zmiennej a.
        a = r.nextInt(11) - 20;
        System.out.println(a);
        // 11, bo w przedziale [-20,10] jest 11 liczb i -20,
        // bo to najmniejsza liczba w zakresie.

        // Losowanie liczb z zakresu [x,y], gdzie x i y, to zmienne
        // całkowitoliczbowe o dowolnej wartości.
        int x = 1; // To wartość przykładowa
        int y = 6; // To wartość przykładowa

        a = r.nextInt(y - x + 1) + x; // Od większej (y) odejmujemy mniejszą (x) i
        // dodajemy 1 - to daje liczność zbioru
        // (w losowaniu), a następnie dodajemy
        // mniejszą (x), bo to najmniejsza liczba
        // w zakresie.
        System.out.println(a);

        // Sprawdzenie powyższego przykładu dla liczb ujemnych:
        x = -27; // To wartość przykładowa
        y = -15; // To wartość przykładowa
        a = r.nextInt(y - x + 1) + x;
        System.out.println(a);

        // Sprawdzenie powyższego przykładu w sytuacji, kiedy jedna liczba
        // jest ujemna, a druga dodatnia
        x = -7; // To wartość przykładowa
        y = 15; // To wartość przykładowa
        a = r.nextInt(y - x + 1) + x;
        System.out.println(a);

    }

}