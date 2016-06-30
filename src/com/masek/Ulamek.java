package com.masek;

/**
 * Created by Łukasz on 2016-06-27.
 */
public class Ulamek {

    public int licznik;

    public int mianownik;

    public Ulamek() {
    }

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }
}
