package com.masek;

/**
 * Created by Łukasz on 2016-06-27.
 */
public class Telewizor {

    public String ekran;

    public void wlacz() {
        this.ekran = "ON";
    }

    public void wylacz() {
        this.ekran = "OFF";
    }

    @Override
    public String toString() {
        return "Telewizor{" +
                "ekran='" + ekran + '\'' +
                '}';
    }
}
