package test;

import model.Etudiant;
import model.FormationEnLigne;
import model.FormationPresentielle;

public class TestEtudiant {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Romain", "romain@test.fr");
        Etudiant etudiant2 = new Etudiant(2, "Lea", "lea@test.fr");

        FormationPresentielle formation1 = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne formation2 = new FormationEnLigne(2, "SQL", 4, 30);

        etudiant1.sInscrire(1, formation1, 10);
        etudiant1.sInscrire(2, formation2, 0);

        System.out.println("etudiant 1 " + etudiant1.getId() + " " + etudiant1.getNom() + " " + etudiant1.getEmail());
        System.out.println("total : " + etudiant1.calculerTotalDepense());
        System.out.println("--------------");
        System.out.println("etudiant 2 " + etudiant2.getId() + " " + etudiant2.getNom() + " " + etudiant2.getEmail());
        System.out.println("total : " + etudiant2.calculerTotalDepense());
    }
}
