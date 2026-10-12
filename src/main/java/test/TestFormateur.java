package test;

import model.Etudiant;
import model.Formateur;
import model.FormationEnLigne;
import model.FormationPresentielle;
import model.Inscription;

import java.time.LocalDate;

public class TestFormateur {
    public static void main(String[] args) {
        Formateur formateur = new Formateur(1, "Dupont");
        FormationPresentielle formation1 = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne formation2 = new FormationEnLigne(2, "SQL", 4, 30);

        formateur.addFormation(formation1);
        formateur.addFormation(formation2);

        Etudiant etudiant1 = new Etudiant(1, "Romain", "romain@test.fr");
        Etudiant etudiant2 = new Etudiant(2, "Lea", "lea@test.fr");

        new Inscription(1, LocalDate.of(2024, 12, 12), 10, etudiant1, formation1);
        new Inscription(2, LocalDate.of(2024, 12, 13), 0, etudiant2, formation1);
        new Inscription(3, LocalDate.of(2025, 1, 15), 50, etudiant2, formation2);

        System.out.println("formateur " + formateur.getId() + " " + formateur.getNom());
        System.out.println("formations : " + formateur.getFormations().size());
        System.out.println("formateur de " + formation1.getTitre() + " : " + formation1.getFormateur().getNom());
        System.out.println("chiffre d'affaires : " + formateur.calculerChiffreAffaires());
    }
}
