package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormationPresentielleTest {

    @Test
    void calculerPrixMultiplieJoursParPrixJour() {
        Formation f = new FormationPresentielle(1, "Java", 3, 200);
        assertEquals(600, f.calculerPrix(), 0.001);
    }

    @Test
    void calculerPrixAvecZeroJourVautZero() {
        Formation f = new FormationPresentielle(1, "Java", 0, 200);
        assertEquals(0, f.calculerPrix(), 0.001);
    }
}
