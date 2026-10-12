package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private int id;
    private String nom;
    private String email;
    private ArrayList<Inscription> inscriptions = new ArrayList<>();

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(ArrayList<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public void addInscription(Inscription i) {
        if (!inscriptions.contains(i)) {
            inscriptions.add(i);
        }
    }

    public Inscription sInscrire(int idInscription, Formation formation, double remise) {
        return new Inscription(idInscription, LocalDate.now(), remise, this, formation);
    }

    public double calculerTotalDepense() {
        double total = 0;
        for (Inscription i : inscriptions) {
            total += i.calculerMontant();
        }
        return total;
    }
}
