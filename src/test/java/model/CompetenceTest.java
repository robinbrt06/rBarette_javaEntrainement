package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompetenceTest {

    @Test
    void addCompetenceLieLesDeuxCotes() {
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        Competence poo = new Competence(1, "POO");
        f.addCompetence(poo);
        assertTrue(f.getCompetences().contains(poo));
        assertTrue(poo.getFormations().contains(f));
    }

    @Test
    void uneCompetencePeutEtreDansPlusieursFormations() {
        Formation java = new FormationPresentielle(1, "Java", 3, 200);
        Formation cpp = new FormationEnLigne(2, "C++", 2, 40);
        Competence poo = new Competence(1, "POO");
        poo.addFormation(java);
        poo.addFormation(cpp);
        assertEquals(2, poo.getFormations().size());
        assertEquals(1, java.getCompetences().size());
        assertEquals(1, cpp.getCompetences().size());
    }
}
