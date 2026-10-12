package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InscriptionTest {

    @Test
    void calculerMontantAppliqueLaRemise() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        Inscription i = new Inscription(1, LocalDate.of(2024, 12, 12), 10, e, f);
        assertEquals(540, i.calculerMontant(), 0.001);
    }

    @Test
    void calculerMontantSansRemiseVautLePrix() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation f = new FormationEnLigne(1, "SQL", 4, 30);
        Inscription i = new Inscription(1, LocalDate.of(2024, 12, 12), 0, e, f);
        assertEquals(120, i.calculerMontant(), 0.001);
    }

    @Test
    void calculerMontantAvecRemiseTotaleVautZero() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        Inscription i = new Inscription(1, LocalDate.of(2024, 12, 12), 100, e, f);
        assertEquals(0, i.calculerMontant(), 0.001);
    }

    @Test
    void constructeurLieEtudiantEtFormation() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        Inscription i = new Inscription(1, LocalDate.of(2024, 12, 12), 10, e, f);
        assertTrue(e.getInscriptions().contains(i));
        assertTrue(f.getInscriptions().contains(i));
    }
}
