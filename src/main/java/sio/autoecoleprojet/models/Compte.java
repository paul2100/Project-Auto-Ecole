package sio.autoecoleprojet.models;

public class Compte {
    private int numCompte;
    private String login;
    private String motDePasse;
    private int statut;

    public Compte(int statut, String motDePasse, String login, int numCompte) {
        this.statut = statut;
        this.motDePasse = motDePasse;
        this.login = login;
        this.numCompte = numCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }
}
