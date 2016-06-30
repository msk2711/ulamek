package com.masek;

/**
 * Created by Łukasz on 2016-06-27.
 */
public class Euklides {

    public static int nwd(int a, int b) {

        while (a != b) {
            if (a>b ) {
                a = a-b;

            }

            if (a<b) {
                b = b - a;
            }
        }

        return a;

    }

    public static int nww (int a, int b) {

        int i = (a * b) / Euklides.nwd(a, b);

        return i ;
    }

    public static Ulamek skrocUlamek(Ulamek u)  {

        Ulamek ulamekDoZwrocenia = new Ulamek();
        int xyz= nwd (u.licznik, u.mianownik);

        ulamekDoZwrocenia.licznik=u.licznik /xyz;
        ulamekDoZwrocenia.mianownik=u.mianownik/ xyz;

        return  ulamekDoZwrocenia;
    }

    public static Ulamek dodaj(Ulamek u1, Ulamek u2) {

        int nwwMianownikow = nww(u1.mianownik, u2.mianownik);
        int nowyLicznik1Ulamka = (nwwMianownikow / u1.mianownik) * u1.licznik;
        int nowyLicznik2Ulamka = (nwwMianownikow / u2.mianownik) * u2.licznik;
        int nowyLicznik = nowyLicznik1Ulamka + nowyLicznik2Ulamka;

        return new Ulamek(nowyLicznik, nwwMianownikow);
    }

    public static Ulamek odejmij (Ulamek u1, Ulamek u2) {

        int nwwMianownikow = nww(u1.mianownik, u2.mianownik);
        int nowyLicznik1Ulamka = (nwwMianownikow/ u1.mianownik) * u1.licznik;
        int nowyLicznik2Ulamka = (nwwMianownikow/ u2.mianownik) * u2.licznik;
        int nowyLicznik = nowyLicznik1Ulamka - nowyLicznik2Ulamka;

        return new Ulamek (nowyLicznik, nwwMianownikow);
    }

    public static Ulamek pomnoz (Ulamek u1, Ulamek u2) {
        int NowyLicznikUlamka =  (u1.licznik * u2.licznik);
        int NowyMianownikUlamka = (u1.mianownik * u2.mianownik);

        return skrocUlamek(new Ulamek(NowyLicznikUlamka, NowyMianownikUlamka));
    }
}
