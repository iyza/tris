import java.util.Comparator;

public class Comparateur implements Comparator<Livre> {

    @Override
    public int compare(Livre o1, Livre o2) {
        int maisonEdition = o1.getMaisonEdition().compareTo(o2.getMaisonEdition());

        if (maisonEdition == 0) {
            int auteur = o1.getAuteur().compareTo(o2.getAuteur());

            if (auteur == 0) {
                int titre = o1.getTitre().compareTo(o2.getTitre());

                if (titre == 0) {
                    int anneePub = o1.getAnneePub() - o2.getAnneePub();

                    return anneePub;
                }
                return titre;
            }
            return auteur;
        }
        return maisonEdition;
    }
}
