package test;

import it.unibs.IngSftw5.mainClasses.DatiUtenti;
import it.unibs.IngSftw5.mainClasses.Utente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ControlliCredenziali {

    ArrayList<Utente> lista=new ArrayList<>();
    DatiUtenti datiUtenti=new DatiUtenti(lista);

    @Test
    void controlloCredenzialiUtentePresente(){
        datiUtenti.addUtente("mariorossi","1234",false);
        assertTrue(datiUtenti.checkCredenziali("mariorossi","1234"));
    }

    @Test
    void controlloCredenzialiUtenteAssente(){
        datiUtenti.addUtente("mariorossi","1234",false);
        assertFalse(datiUtenti.checkCredenziali("paoloverdi","5678"));
    }

    @Test
    void controlloCredenzialiPredefinite(){
        Utente utente=new Utente("admin","ezjt9917");
        assertTrue(datiUtenti.checkConf(utente));
    }

    @Test
    void controlloNomePresente(){
        datiUtenti.addUtente("mariorossi","1234",false);
        assertTrue(datiUtenti.checkName("mariorossi"));
    }

    @Test
    void controlloNomeNonPresente(){
        datiUtenti.addUtente("mariorossi","1234",false);
        assertFalse(datiUtenti.checkName("paoloverdi"));
    }


}
