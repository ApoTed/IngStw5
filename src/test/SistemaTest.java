package test;

import it.unibs.IngSftw5.mainClasses.Categoria;
import it.unibs.IngSftw5.mainClasses.Gerarchia;
import it.unibs.IngSftw5.mainClasses.Sistema;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaTest {

    ArrayList<Gerarchia> lista =new ArrayList<>();
    Sistema sistema=new Sistema(lista);

    @Test
    void controlloRadiceNuova(){
        Categoria radice1=new Categoria("radice1","",null);
        Gerarchia gerarchia1=new Gerarchia(null,radice1);
        Categoria radice2=new Categoria("radice2","",null);
        Gerarchia gerarchia2=new Gerarchia(null,radice2);
        sistema.addGerarchia(gerarchia1);
        sistema.addGerarchia(gerarchia2);
        assertTrue(sistema.checkNomeNuovoRadice("radice3"));
    }

    @Test
    void controlloRadiceGiaPresente(){
        Categoria radice1=new Categoria("radice1","",null);
        Gerarchia gerarchia1=new Gerarchia(null,radice1);
        Categoria radice2=new Categoria("radice2","",null);
        Gerarchia gerarchia2=new Gerarchia(null,radice2);
        sistema.addGerarchia(gerarchia1);
        sistema.addGerarchia(gerarchia2);
        assertFalse(sistema.checkNomeNuovoRadice("radice2"));
    }
}
