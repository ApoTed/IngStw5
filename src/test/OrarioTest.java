package test;

import it.unibs.IngSftw5.mainClasses.Orario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrarioTest {

    Orario orario1= new Orario(10,00);
    Orario orario2= new Orario(23,30);
    Orario orario3= new Orario(24,00);
    Orario orario4= new Orario(8,30);
    Orario orario5= new Orario(8,00);
    Orario orario6= new Orario(22,40);
    Orario orario7 = new Orario(25,00);

    @Test
    void oreDieciDentroIntervallo(){
        assertTrue(orario1.isInsideIntervallo(orario4,orario2));
    }

    @Test
    void oreVentitreDentroIntervallo(){
        assertTrue(orario2.isInsideIntervallo(orario1,orario3));
    }

    @Test
    void oreVentiquattroFuoriIntervallo(){
        assertFalse(orario3.isInsideIntervallo(orario1,orario2));
    }

    @Test
    void oreOttoFuoriIntervallo(){
        assertFalse(orario5.isInsideIntervallo(orario4,orario1));
    }

    @Test
    void oreOttoTrentaDentroIntervallo(){
        assertTrue(orario4.isInsideIntervallo(orario5,orario1));
    }

    @Test
    void oreDieciOrarioValido(){
        assertTrue(orario1.orarioValido());
    }

    @Test
    void oreVentitreTrentaOrarioValido(){
        assertTrue(orario2.orarioValido());
    }

    @Test
    void oreVenticinqueOrarioNonValido(){
        assertFalse(orario7.orarioValido());
    }

    @Test
    void oreVentidueQuarantaOrarioNonValido(){
        assertFalse(orario6.orarioValido());
    }

}
