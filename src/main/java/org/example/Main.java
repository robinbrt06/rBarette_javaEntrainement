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
        Formation java = new FormationPresentielle(1, "Java", 3, 200);
        Formation sql = new FormationEnLigne(2, "SQL", 4, 30);
        formateur.addFormation(java);
        formateur.addFormation(sql);

        Competence poo = new Competence(1, "POO");
        java.addCompetence(poo);

        Etudiant romain = new Etudiant(1, "Romain", "romain@test.fr");
        new Inscription(1, LocalDate.of(2024, 12, 12), 10, romain, java);
        new Inscription(2, LocalDate.of(2025, 1, 15), 0, romain, sql);

        System.out.println(java.getTitre() + " : " + java.calculerPrix());
        System.out.println(sql.getTitre() + " : " + sql.calculerPrix());
        System.out.println(romain.getNom() + " : " + romain.calculerTotalDepense());
        System.out.println(formateur.getNom() + " : " + formateur.calculerChiffreAffaires());
    }
}
