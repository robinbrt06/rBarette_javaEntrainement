package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormationEnLigneTest {

    @Test
    void calculerPrixMultiplieMoisParPrixMensuel() {
        Formation f = new FormationEnLigne(1, "SQL", 4, 30);
        assertEquals(120, f.calculerPrix(), 0.001);
    }

    @Test
    void calculerPrixAvecZeroMoisVautZero() {
        Formation f = new FormationEnLigne(1, "SQL", 0, 30);
        assertEquals(0, f.calculerPrix(), 0.001);
    }
}
