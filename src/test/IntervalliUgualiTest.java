package test;

import it.unibs.IngSftw5.mainClasses.Intervallo;
import it.unibs.IngSftw5.mainClasses.Orario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntervalliUgualiTest {

    Orario orario1= new Orario(10,00);
    Orario orario2 = new Orario(8,30);
    Orario orario3 = new Orario(8,00);

    @Test
    void intervalloOttoDieciUguale(){
        Intervallo intervallo1=new Intervallo(new Orario[]{orario3, orario1});
        Intervallo intervallo2=new Intervallo(new Orario[]{orario3, orario1});
        assertTrue(intervallo1.compareIntervallo(intervallo2));
    }

    @Test
    void intervalloOttoDieciSingoloUguale(){
        Intervallo intervallo1=new Intervallo(new Orario[]{orario3, orario1});
        assertTrue(intervallo1.compareIntervallo(intervallo1));
    }

    @Test
    void intervalloOttoDieciOttoTrentaDieciDiverso(){
        Intervallo intervallo1=new Intervallo(new Orario[]{orario3, orario1});
        Intervallo intervallo2=new Intervallo(new Orario[]{orario2, orario1});
        assertFalse(intervallo1.compareIntervallo(intervallo2));
    }





}
