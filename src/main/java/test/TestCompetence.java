package test;

import model.Competence;
import model.FormationEnLigne;
import model.FormationPresentielle;

public class TestCompetence {
    public static void main(String[] args) {
        FormationPresentielle java = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne cpp = new FormationEnLigne(2, "C++", 2, 40);

        Competence poo = new Competence(1, "POO");
        Competence algo = new Competence(2, "Algo");

        java.addCompetence(poo);
        java.addCompetence(algo);
        cpp.addCompetence(poo);

        System.out.println(java.getTitre() + " : " + java.getCompetences().size() + " competences");
        System.out.println(cpp.getTitre() + " : " + cpp.getCompetences().size() + " competences");
        System.out.println(poo.getLibelle() + " : " + poo.getFormations().size() + " formations");
        System.out.println(algo.getLibelle() + " : " + algo.getFormations().size() + " formations");
    }
}
