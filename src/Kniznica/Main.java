package Kniznica;

import Studenti.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Knjiga> popisknjiga=new ArrayList<>();
        Knjiga knjiga1=new Knjiga(" Lovac u žitu");
        Knjiga knjiga2=new Knjiga(" Škrtac");
        Knjiga knjiga3=new Knjiga(" Odgovor Jobu");
        Knjiga knjiga4=new Knjiga(" Norveška šuma");
        knjiga1.posudiKnjigu();
        knjiga2.vratiKnjigu();
        knjiga3.posudiKnjigu();
        knjiga4.vratiKnjigu();

        popisknjiga.add(knjiga1);
        popisknjiga.add(knjiga2);
        popisknjiga.add(knjiga3);
        popisknjiga.add(knjiga4);

        Collections.sort(popisknjiga);
        for(Knjiga k:popisknjiga){
            System.out.println(k);
        }

    }
}
