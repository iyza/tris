import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Livre> liste1 = new ArrayList<>();
        ArrayList<Livre> liste2 = new ArrayList<>();
        ArrayList<Livre> liste3 = new ArrayList<>();
        TreeSet<Livre> liste4 = new TreeSet<>();
        TreeSet<Livre> liste5 = new TreeSet<>(new Comparateur());

        listeDeLivres(liste1);
        listeDeLivres(liste2);
        listeDeLivres(liste3);
        listeDeLivres(liste4);
        listeDeLivres(liste5);

        tri(liste1);
        Collections.sort(liste2);
        Collections.sort(liste3, new Comparateur());

        System.out.println("-----------------------------------------------------------------");
        for (Livre livre : liste1) {
            livre.affichage();
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        for (Livre livre : liste2) {
            livre.affichage();
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        for (Livre livre : liste3) {
            livre.affichage();
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        for (Livre livre : liste4) {
            livre.affichage();
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        for (Livre livre : liste5) {
            livre.affichage();
        }



    }

    public static void listeDeLivres(Collection<Livre> liste) {
        liste.add(new Livre("Guys just do a doner", "NICE TET", "V", "Kaka :OMEGALUL:", 54826089, 2018));
        liste.add(new Livre("Guys just do a doner (2 months later)", "NICE TET", "V", "Kaka :OMEGALUL:", 24548798, 2018));
        liste.add(new Livre("Dab", "On", "Em", "LUL", 16463240, 2016));
        liste.add(new Livre("Dab", "On", "Em", "Haters", 16467852, 2016));
        liste.add(new Livre("Le bordel", "Wesh", "Moi", "EA GAMES", 763284513, 2011));
        liste.add(new Livre("Le bordel", "Wesh", "Toi", "EA GAMES", 36858585, 2013));
        liste.add(new Livre("Bible", "Thinking", "Almighty", "Riot balance team", 50504343, 637));
        liste.add(new Livre("Bible", "Thinking", "Almighty", "Riot balance team", 50504393, 1996));
        liste.add(new Livre("Rerer", "Wqwqw", "V", "RRrrrrrrrrrrrrRR", 76737435, 2020));
        liste.add(new Livre("Why do I act like I'm 12?", "btw", "V", "Kaka :OMEGALUL:", 74247328, 2015));
    }


    public static void tri(ArrayList<Livre> liste) {
        Livre livre;
        int index;

        for (int i = 0; i < liste.size(); i++) {
            livre = liste.get(i);
            index = i;

            for (int j = i; j < liste.size(); j++) {

                if (liste.get(j).compareTo(liste.get(index)) < 0) {
                    livre = liste.get(j);
                    index = j;
                }
            }

            liste.remove(index);
            liste.add(i, livre);
        }
    }
}
