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
        FormationPresentielle java = new FormationPresentielle(1, "Java", 3, 200);
        FormationEnLigne sql = new FormationEnLigne(2, "SQL", 4, 30);

        formateur.addFormation(java);
        formateur.addFormation(sql);

        Etudiant romain = new Etudiant(1, "Romain", "romain@test.fr");
        Etudiant lea = new Etudiant(2, "Lea", "lea@test.fr");

        new Inscription(1, LocalDate.of(2024, 12, 12), 10, romain, java);
        new Inscription(2, LocalDate.of(2024, 12, 13), 0, lea, java);
        new Inscription(3, LocalDate.of(2025, 1, 15), 50, lea, sql);

        System.out.println("formateur " + formateur.getId() + " " + formateur.getNom());
        System.out.println("formations : " + formateur.getFormations().size());
        System.out.println("formateur de " + java.getTitre() + " : " + java.getFormateur().getNom());
        System.out.println("chiffre d'affaires : " + formateur.calculerChiffreAffaires());
    }
}
