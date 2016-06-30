package com.masek;

public class Main {

    public static void main(String[] args) {

        Ulamek u1 = new Ulamek(2, 3);
        Ulamek u2 = Euklides.skrocUlamek(u1);

        System.out.println(u1);
        System.out.println(u2);


        int nww = Euklides.nww(12, 18);
        System.out.println(nww);

        Ulamek u3 = new Ulamek(1, 2);
        Ulamek u4 = new Ulamek(1, 3);
        Ulamek u5 = Euklides.dodaj(u3, u4);

        // u5 = 5/6
        System.out.println(u3 + " + " + u4 + " = " + u5);


        //odejmowanie ulamkow
        Ulamek u6 = new Ulamek(5, 4);
        Ulamek u7 = new Ulamek(4, 8);
        Ulamek u8 = Euklides.odejmij(u6, u7);

        System.out.println(u6 + "-" + u7 + "=" + u8);

        //mnozenie ulamkow


        Ulamek u9 = new Ulamek(2,4);
        Ulamek u10 = new Ulamek(2,3);
        Ulamek u11 = Euklides.pomnoz(u9,u10);

        System.out.println(u9 + "*" + u10 + "=" + u11);

    }
}
