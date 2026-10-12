package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FormateurTest {

    @Test
    void addFormationLieLesDeuxCotes() {
        Formateur formateur = new Formateur(1, "Dupont");
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        formateur.addFormation(f);
        assertEquals(1, formateur.getFormations().size());
        assertSame(formateur, f.getFormateur());
    }

    @Test
    void calculerChiffreAffairesSansFormationVautZero() {
        Formateur formateur = new Formateur(1, "Dupont");
        assertEquals(0, formateur.calculerChiffreAffaires(), 0.001);
    }

    @Test
    void calculerChiffreAffairesAdditionneToutesLesInscriptions() {
        Formateur formateur = new Formateur(1, "Dupont");
        Formation java = new FormationPresentielle(1, "Java", 3, 200);
        Formation sql = new FormationEnLigne(2, "SQL", 4, 30);
        formateur.addFormation(java);
        formateur.addFormation(sql);
        Etudiant romain = new Etudiant(1, "Romain", "romain@test.fr");
        Etudiant lea = new Etudiant(2, "Lea", "lea@test.fr");
        new Inscription(1, LocalDate.of(2024, 12, 12), 10, romain, java);
        new Inscription(2, LocalDate.of(2024, 12, 13), 0, lea, java);
        new Inscription(3, LocalDate.of(2025, 1, 15), 50, lea, sql);
        assertEquals(1200, formateur.calculerChiffreAffaires(), 0.001);
    }
}
