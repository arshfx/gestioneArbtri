package com.mycompany.info;

import com.mycompany.info.Arbitro;
import com.mycompany.info.Partita;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class PartitaTest {

    @Test
    public void testGetCodice() {
        Partita partita1 = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals(1, partita1.getCodice()); // Il codice della prima partita dovrebbe essere 1
    }


    @Test
    public void testSetSquadraOspitante() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        partita.setSquadraOspitante("Nuova Squadra");
        assertEquals("Nuova Squadra", partita.getSquadraOspitante());
    }

    @Test
    public void testSetSquadraOspite() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        partita.setSquadraOspite("Nuova Squadra");
        assertEquals("Nuova Squadra", partita.getSquadraOspite());
    }

    @Test
    public void testGetCategoria() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals("categoria", partita.getCategoria());
    }

    @Test
    public void testSetCategoria() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        partita.setCategoria("nuova categoria");
        assertEquals("nuova categoria", partita.getCategoria());
    }

    @Test
    public void testSetCitta() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        partita.setCitta("Nuova Città");
        assertEquals("Nuova Città", partita.getCitta());
    }

    @Test
    public void testSetDistanza() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        partita.setDistanza(100);
        assertEquals(100, partita.getDistanza());
    }

    @Test
    public void testSetGiorno() {
        LocalDate oggi = LocalDate.now();
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", oggi, 50, "categoria");
        LocalDate domani = oggi.plusDays(1);
        partita.setGiorno(domani);
        assertEquals(domani, partita.getGiorno());
    }

    @Test
    public void testGetSquadraOspitante() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals("Squadra A", partita.getSquadraOspitante());
    }

    @Test
    public void testGetSquadraOspite() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals("Squadra B", partita.getSquadraOspite());
    }

    @Test
    public void testGetCitta() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals("Città", partita.getCitta());
    }

    @Test
    public void testGetDistanza() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "categoria");
        assertEquals(50, partita.getDistanza());
    }

    @Test
    public void testGetGiorno() {
        LocalDate oggi = LocalDate.now();
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", oggi, 50, "categoria");
        assertEquals(oggi, partita.getGiorno());
    }

    @Test
    public void testGetRimborso() {
        // Assuming categoria is "giovanissimi"
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.now(), 50, "giovanissimi");
        assertEquals(36, partita.getRimborso());
    }
    
    @Test
    public void setPartita(){
        Arbitro arbitro=new Arbitro("nome", "cognome", "categoria", "password", 10);
        Partita par=new Partita("squadraOspitante", "squadraOspite", "citta", LocalDate.now(), 20, "eccellenza");
        arbitro.setPartita(par);
        assertEquals(par, arbitro.getPartita((int) par.getCodice()));
    }

    @Test
    public void testToString() {
        Partita partita = new Partita("Squadra A", "Squadra B", "Città", LocalDate.of(2024, 5, 10), 50, "categoria");
        String expectedToString=
            "\tcodice: " + partita.getCodice() +
            "\n\tcitta: " + partita.getCitta() +
            "\n\t" + partita.getSquadraOspitante() + "-" + partita.getSquadraOspite() +
            "\n\tcategoria: " + partita.getCategoria() +
            "\n\tdistanza: " + partita.getDistanza() +
            "\n\trimborso: " + partita.getRimborso()+ "€";
        assertEquals(expectedToString, partita.toString());
    }

}
