package test;

import model.Etudiant;
import model.FormationEnLigne;
import model.FormationPresentielle;
import model.Inscription;

import java.time.LocalDate;

public class TestInscription {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant(1, "Romain", "romain@test.fr");
        FormationPresentielle java = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne sql = new FormationEnLigne(2, "SQL", 4, 30);

        Inscription inscription1 = new Inscription(1, LocalDate.of(2024, 12, 12), 10, etudiant, java);
        Inscription inscription2 = new Inscription(2, LocalDate.of(2025, 1, 15), 0, etudiant, sql);

        System.out.println(inscription1.getDateInscription() + " " + inscription1.getFormation().getTitre() + " : " + inscription1.calculerMontant());
        System.out.println(inscription2.getDateInscription() + " " + inscription2.getFormation().getTitre() + " : " + inscription2.calculerMontant());
        System.out.println("--------------");
        System.out.println("inscriptions de " + etudiant.getNom() + " : " + etudiant.getInscriptions().size());
        System.out.println("inscriptions a " + java.getTitre() + " : " + java.getInscriptions().size());
    }
}
