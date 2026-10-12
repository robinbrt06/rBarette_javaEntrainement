package org.example;

import model.Competence;
import model.Etudiant;
import model.Formateur;
import model.Formation;
import model.FormationEnLigne;
import model.FormationPresentielle;
import model.Inscription;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Formateur formateur = new Formateur(1, "Dupont");
        Formation formation1 = new FormationPresentielle(1, "Java", 3, 200);
        Formation formation2 = new FormationEnLigne(2, "SQL", 4, 30);
        formateur.addFormation(formation1);
        formateur.addFormation(formation2);

        Competence competence1 = new Competence(1, "POO");
        formation1.addCompetence(competence1);

        Etudiant etudiant1 = new Etudiant(1, "Romain", "romain@test.fr");
        new Inscription(1, LocalDate.of(2024, 12, 12), 10, etudiant1, formation1);
        new Inscription(2, LocalDate.of(2025, 1, 15), 0, etudiant1, formation2);

        System.out.println(formation1.getTitre() + " : " + formation1.calculerPrix());
        System.out.println(formation2.getTitre() + " : " + formation2.calculerPrix());
        System.out.println(etudiant1.getNom() + " : " + etudiant1.calculerTotalDepense());
        System.out.println(formateur.getNom() + " : " + formateur.calculerChiffreAffaires());
    }
}
