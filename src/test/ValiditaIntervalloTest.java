package test;

import it.unibs.IngSftw5.mainClasses.Intervallo;
import it.unibs.IngSftw5.mainClasses.Orario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValiditaIntervalloTest {

    Orario orario1= new Orario(10,00);
    Orario orario2= new Orario(23,30);
    Orario orario3= new Orario(24,00);
    Orario orario4= new Orario(8,30);
    Orario orario5= new Orario(8,00);

    @Test
    void intervalloOttoDieciValido(){
        Intervallo intervallo=new Intervallo(new Orario[]{orario5, orario1});
        assertTrue(intervallo.intervalloValido());
    }

    @Test
    void intervalloOttoOttoMezzaValido(){
        Intervallo intervallo=new Intervallo(new Orario[]{orario5, orario4});
        assertTrue(intervallo.intervalloValido());
    }

    @Test
    void intervalloDieciOttoNonValido(){
        Intervallo intervallo=new Intervallo(new Orario[]{orario1, orario5});
        assertFalse(intervallo.intervalloValido());
    }

    @Test
    void intervalloDieciDieciValido(){
        Intervallo intervallo=new Intervallo(new Orario[]{orario1, orario1});
        assertFalse(intervallo.intervalloValido());
    }

}
