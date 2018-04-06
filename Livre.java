public class Livre implements Comparable<Livre>{

    private int ISBN;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEdition;
    private int anneePub;

    public Livre(String titre, String sousTitre, String auteur, String maisonEdition, int ISBN, int anneePub) {
        this.titre = titre;
        this.sousTitre = sousTitre;
        this.auteur = auteur;
        this.maisonEdition = maisonEdition;
        this.ISBN = ISBN;
        this.anneePub = anneePub;
    }

    public int compareTo(Livre o) {
        return anneePub - o.anneePub;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public int getAnneePub() {
        return anneePub;
    }

    public void setAnneePub(int anneePub) {
        this.anneePub = anneePub;
    }

    public void affichage() {
        System.out.println("Titre : " + this.titre);
        System.out.println("Sous-Titre : " + this.sousTitre);
        System.out.println("Auteur : " + this.auteur);
        System.out.println("Maison d'edition : " + this.maisonEdition);
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("Annee de publication : " + this.anneePub);
        System.out.println("");
    }
}
