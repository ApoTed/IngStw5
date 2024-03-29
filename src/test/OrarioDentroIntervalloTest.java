package test;

import it.unibs.IngSftw5.mainClasses.Orario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrarioDentroIntervalloTest {

    Orario orario1 = new Orario(10, 00);
    Orario orario2 = new Orario(23, 30);
    Orario orario3 = new Orario(24, 00);
    Orario orario4 = new Orario(8, 30);
    Orario orario5 = new Orario(8, 00);

    @Test
    void oreDieciDentroIntervallo() {
        assertTrue(orario1.isInsideIntervallo(orario4, orario2));
    }

    @Test
    void oreVentitreDentroIntervallo() {
        assertTrue(orario2.isInsideIntervallo(orario1, orario3));
    }

    @Test
    void oreVentiquattroFuoriIntervallo() {
        assertFalse(orario3.isInsideIntervallo(orario1, orario2));
    }

    @Test
    void oreOttoFuoriIntervallo() {
        assertFalse(orario5.isInsideIntervallo(orario4, orario1));
    }

    @Test
    void oreOttoTrentaDentroIntervallo() {
        assertTrue(orario4.isInsideIntervallo(orario5, orario1));
    }
}
