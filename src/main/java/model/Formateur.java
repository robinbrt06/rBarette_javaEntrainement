package model;

import java.util.ArrayList;

public class Formateur {
    private int id;
    private String nom;
    private ArrayList<Formation> formations = new ArrayList<>();

    public Formateur() {
    }

    public Formateur(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }

    public void addFormation(Formation f) {
        if (!formations.contains(f)) {
            formations.add(f);
            f.setFormateur(this);
        }
    }

    public double calculerChiffreAffaires() {
        double total = 0;
        for (Formation f : formations) {
            for (Inscription i : f.getInscriptions()) {
                total += i.calculerMontant();
            }
        }
        return total;
    }
}
