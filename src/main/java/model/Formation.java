package model;

import java.util.ArrayList;

public abstract class Formation {
    private int id;
    private String titre;
    private Formateur formateur;
    private ArrayList<Competence> competences = new ArrayList<>();
    private ArrayList<Inscription> inscriptions = new ArrayList<>();

    public Formation() {
    }

    public Formation(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(ArrayList<Competence> competences) {
        this.competences = competences;
    }

    public void addCompetence(Competence c) {
        if (!competences.contains(c)) {
            competences.add(c);
            c.addFormation(this);
        }
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

    public abstract double calculerPrix();
}
