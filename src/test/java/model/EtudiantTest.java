package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class EtudiantTest {

    @Test
    void calculerTotalDepenseSansInscriptionVautZero() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        assertEquals(0, e.calculerTotalDepense(), 0.001);
    }

    @Test
    void calculerTotalDepenseAdditionneLesInscriptions() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation java = new FormationPresentielle(1, "Java", 3, 200);
        Formation sql = new FormationEnLigne(2, "SQL", 4, 30);
        new Inscription(1, LocalDate.of(2024, 12, 12), 10, e, java);
        new Inscription(2, LocalDate.of(2025, 1, 15), 0, e, sql);
        assertEquals(660, e.calculerTotalDepense(), 0.001);
    }

    @Test
    void sInscrireCreeUneInscriptionLiee() {
        Etudiant e = new Etudiant(1, "Romain", "romain@test.fr");
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        Inscription i = e.sInscrire(1, f, 10);
        assertSame(e, i.getEtudiant());
        assertSame(f, i.getFormation());
        assertEquals(1, e.getInscriptions().size());
        assertEquals(1, f.getInscriptions().size());
    }
}
