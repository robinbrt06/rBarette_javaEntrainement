package model;

public class FormationPresentielle extends Formation {
    private int nbJours;
    private double prixJour;

    public FormationPresentielle() {
    }

    public FormationPresentielle(int id, String titre, int nbJours, double prixJour) {
        super(id, titre);
        this.nbJours = nbJours;
        this.prixJour = prixJour;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public double getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(double prixJour) {
        this.prixJour = prixJour;
    }

    @Override
    public double calculerPrix() {
        return nbJours * prixJour;
    }
}
