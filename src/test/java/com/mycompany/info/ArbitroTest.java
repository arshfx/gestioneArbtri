/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.info;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArbitroTest {

    private Arbitro arbitro;
    private Partita partita;

    @BeforeEach
    public void setUp() {
        arbitro = new Arbitro("Nome", "Cognome", "Categoria", "Password", 30);
        partita = new Partita("milan", "inter", "milano", LocalDate.of(2020, 10, 10), 282, "eccellenza");
    }

    @Test
    public void testSetPartita() {
        arbitro.setPartita(partita);
        assertTrue(arbitro.getPartite().contains(partita));
    }

    @Test
    public void testEliminaPartita() {
        arbitro.setPartita(partita);
        arbitro.eliminaPartita((int) partita.getCodice());
        assertFalse(arbitro.getPartite().contains(partita));
    }

    @Test
    public void testGetPartite() {
        arbitro.setPartita(partita);
        assertEquals(1, arbitro.getPartite().size());
    }

    @Test
    public void testGetNumeroPartite() {
        arbitro.setPartita(partita);
        fail:assertEquals(1, arbitro.getNumeroPartite());
    }

    @Test
    public void testSetNome() {
        arbitro.setNome("Nuovo Nome");
        assertEquals("Nuovo Nome", arbitro.getNome());
    }

    @Test
    public void testGetNome() {
        assertEquals("Nome", arbitro.getNome());
    }

    @Test
    public void testSetCognome() {
        arbitro.setCognome("Nuovo Cognome");
        assertEquals("Nuovo Cognome", arbitro.getCognome());
    }

    @Test
    public void testGetCognome() {
        assertEquals("Cognome", arbitro.getCognome());
    }

    @Test
    public void testSetCategoria() {
        arbitro.setCategoria("Nuova Categoria");
        assertEquals("Nuova Categoria", arbitro.getCategoria());
    }

    @Test
    public void testGetCategoria() {
        assertEquals("Categoria", arbitro.getCategoria());
    }

    @Test
    public void testSetPassword() {
        arbitro.setPassword("Nuova Password");
        assertEquals("Nuova Password", arbitro.getPassword());
    }

    @Test
    public void testGetPassword() {
        assertEquals("Password", arbitro.getPassword());
    }

    @Test
    public void testSetEta() {
        arbitro.setEta(40);
        assertEquals(40, arbitro.getEta());
    }

    @Test
    public void testGetEta() {
        fail:assertEquals(30, arbitro.getEta());
    }

    @Test
    public void testGetCodice() {
        Arbitro a1 = new Arbitro("Nome", "Cognome", "Categoria", "Password", 30);
        Arbitro a2 = new Arbitro("Nome", "Cognome", "Categoria", "Password", 30);
        assertEquals(2, a1.getCodice()); // Assumendo che il codice di partenza sia 1
    }

    @Test
    public void testVisualizzaPartite() {
        arbitro.setPartita(partita);
        assertEquals(1, arbitro.visualizzaPartite().size());
    }

    @Test
    public void testToString() {
        String expectedToString = 
                "Arbitro{" +
                "nome='" + arbitro.getNome() + '\'' +
                ", cognome='" + arbitro.getCognome() + '\'' +
                ", categoria='" + arbitro.getCategoria() + '\'' +
                ", eta=" + arbitro.getEta() +
                ", codice=" + arbitro.getCodice() +
                ", numero di partite=" + arbitro.getNumeroPartite() +
                '}';
        
        assertEquals(expectedToString, arbitro.toString());
    }
}

