package test;

import model.Competence;
import model.FormationEnLigne;
import model.FormationPresentielle;

public class TestCompetence {
    public static void main(String[] args) {
        FormationPresentielle formation1 = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne formation2 = new FormationEnLigne(2, "C++", 2, 40);

        Competence competence1 = new Competence(1, "POO");
        Competence competence2 = new Competence(2, "Algo");

        formation1.addCompetence(competence1);
        formation1.addCompetence(competence2);
        formation2.addCompetence(competence1);

        System.out.println(formation1.getTitre() + " : " + formation1.getCompetences().size() + " competences");
        System.out.println(formation2.getTitre() + " : " + formation2.getCompetences().size() + " competences");
        System.out.println(competence1.getLibelle() + " : " + competence1.getFormations().size() + " formations");
        System.out.println(competence2.getLibelle() + " : " + competence2.getFormations().size() + " formations");
    }
}
