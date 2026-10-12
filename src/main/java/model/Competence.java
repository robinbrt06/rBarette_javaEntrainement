package model;

import java.util.ArrayList;

public class Competence {
    private int id;
    private String libelle;
    private ArrayList<Formation> formations = new ArrayList<>();

    public Competence() {
    }

    public Competence(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
            f.addCompetence(this);
        }
    }
}
