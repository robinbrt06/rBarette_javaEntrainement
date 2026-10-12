package model;

import java.time.LocalDate;

public class Inscription {
    private int id;
    private LocalDate dateInscription;
    private double remise;
    private Etudiant etudiant;
    private Formation formation;

    public Inscription() {
    }

    public Inscription(int id, LocalDate dateInscription, double remise, Etudiant etudiant, Formation formation) {
        this.id = id;
        this.dateInscription = dateInscription;
        this.remise = remise;
        this.etudiant = etudiant;
        this.formation = formation;
        etudiant.addInscription(this);
        formation.addInscription(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public double calculerMontant() {
        return formation.calculerPrix() * (1 - remise / 100);
    }
}
