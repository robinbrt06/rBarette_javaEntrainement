package test;

import model.Etudiant;
import model.FormationEnLigne;
import model.FormationPresentielle;
import model.Inscription;

import java.time.LocalDate;

public class TestInscription {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Romain", "romain@test.fr");
        FormationPresentielle formation1 = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne formation2 = new FormationEnLigne(2, "SQL", 4, 30);

        Inscription inscription1 = new Inscription(1, LocalDate.of(2024, 12, 12), 10, etudiant1, formation1);
        Inscription inscription2 = new Inscription(2, LocalDate.of(2025, 1, 15), 0, etudiant1, formation2);

        System.out.println(inscription1.getDateInscription() + " " + inscription1.getFormation().getTitre() + " : " + inscription1.calculerMontant());
        System.out.println(inscription2.getDateInscription() + " " + inscription2.getFormation().getTitre() + " : " + inscription2.calculerMontant());
        System.out.println("--------------");
        System.out.println("inscriptions de " + etudiant1.getNom() + " : " + etudiant1.getInscriptions().size());
        System.out.println("inscriptions a " + formation1.getTitre() + " : " + formation1.getInscriptions().size());
    }
}
