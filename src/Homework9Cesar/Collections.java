package Homework9Cesar;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

// НЕ МОГУ ПОНЯТЬ ГДЕ У МЕНЯ ОШИБКА

/**
 * Created by amikhalnyuk on 01.04.2016.
 */
public class Collections {

    private static HashSet<String> Piano = new HashSet<> ();
    private static HashSet<String> Gitar = new HashSet<> ();
    private static HashSet<String> Tromba = new HashSet<> ();

    public static HashSet<String> getPiano () {
        return Piano;
    }

    public static HashSet<String> getGitar () {
        return Gitar;
    }

    public static HashSet<String> getTromba () {
        return Tromba;
    }

    @Override
    public String toString () {
        return "Collections{" +
                "Piano=" + Piano +
                ", Gitar=" + Gitar +
                ", Tromba=" + Tromba +
                '}';
    }

    public static void main (String[] args) {
        //final List<Instrument> myInstrument = new ArrayList<>();

        //sorted
        SortedSet<Instrument> myInstruments = new TreeSet<> ();

        myInstruments.add (new Piano ("black", 2));
        myInstruments.add (new Gitar ("acustic", 5));
        myInstruments.add (new Tromba ("gold", 7));

        int i = 0;
        PrintStream printf = System.out.printf ("%6s %30s %10S\n", "number", "name", "price");
        for (Instrument instrument : myInstruments) {
            System.out.printf ("%6d %30s %10d\n", i, instrument.getName ().toString (), instrument.getPrice ());
        }
    }

}
