package model;

public class FormationEnLigne extends Formation {
    private int nbMois;
    private double prixMensuel;

    public FormationEnLigne() {
    }

    public FormationEnLigne(int id, String titre, int nbMois, double prixMensuel) {
        super(id, titre);
        this.nbMois = nbMois;
        this.prixMensuel = prixMensuel;
    }

    public int getNbMois() {
        return nbMois;
    }

    public void setNbMois(int nbMois) {
        this.nbMois = nbMois;
    }

    public double getPrixMensuel() {
        return prixMensuel;
    }

    public void setPrixMensuel(double prixMensuel) {
        this.prixMensuel = prixMensuel;
    }

    @Override
    public double calculerPrix() {
        return nbMois * prixMensuel;
    }
}
