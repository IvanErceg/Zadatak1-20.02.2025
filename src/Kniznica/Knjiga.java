package Kniznica;


import Studenti.Student;

public class Knjiga implements  Comparable<Knjiga> {
    private String naslov;
    public Knjiga(String naslov) {
        this.naslov = naslov;
    }

    public void posudiKnjigu(){
        System.out.println("Knjiga"+naslov+" je posuđena");

    };

    public void vratiKnjigu(){
        System.out.println("Knjiga  "+naslov+" je vraćena");

    }
    public String getTitle() {
        return naslov;
    }

    @Override
    public int compareTo(Knjiga druga) {
        // Compare by title
        return this.naslov.compareTo(druga.naslov);
    }

    @Override
    public String toString() {
        return "Knjiga: " + naslov + "";
    }

}
