package test;

import it.unibs.IngSftw5.mainClasses.Orario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValiditaOrarioTest {

    Orario orario1= new Orario(10,00);
    Orario orario2= new Orario(23,30);
    Orario orario3= new Orario(25,00);
    Orario orario4= new Orario(22,40);

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
        assertFalse(orario3.orarioValido());
    }

    @Test
    void oreVentidueQuarantaOrarioNonValido(){
        assertFalse(orario4.orarioValido());
    }

}
