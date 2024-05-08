/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.info;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Questa classe rappresenta una sezione di arbitri e designatori
 */
public class Sezione {
    private ArrayList<Arbitro> arbitri; // Lista degli arbitri della sezione
    private ArrayList<Designatore> designatori; // Lista dei designatori della sezione

    /**
     * Costruttore della classe Sezione che inizializza le liste di arbitri e designatori.
     */
    public Sezione() {
        arbitri = new ArrayList<>();
        designatori = new ArrayList<>();
    }

    /**
     * Costruttore di copia per la classe Sezione.
     * @param sezione L'oggetto Sezione da copiare
     */
    public Sezione(Sezione sezione) {
        arbitri = new ArrayList<>();
        for (Arbitro arbitro : sezione.arbitri) {
            arbitri.add(new Arbitro(arbitro));
        }

        designatori = new ArrayList<>();
        for (Designatore designatore : sezione.designatori) {
            designatori.add(new Designatore(designatore));
        }
    }

    // Metodi per l'aggiunta e l'eliminazione degli arbitri e dei designatori

    /**
     * Aggiunge un arbitro alla sezione.
     * @param arbitro L'arbitro da aggiungere
     */
    public void aggiungiArbitro(Arbitro arbitro) {
        arbitri.add(arbitro);
    }

    /**
     * Elimina un arbitro dalla sezione dato il nome, il cognome e il codice.
     * @param nome Il nome dell'arbitro da eliminare
     * @param cognome Il cognome dell'arbitro da eliminare
     * @param codice Il codice dell'arbitro da eliminare
     */
    public void eliminaArbitro(String nome, String cognome, int codice) {
        for (int i = 0; i < arbitri.size(); i++) {
            if (arbitri.get(i).getNome().equals(nome)) {
                if (arbitri.get(i).getCognome().equals(cognome)) {
                    if (arbitri.get(i).getCodice() == codice) {
                        arbitri.remove(i);
                    }
                }
            }
        }
    }

    /**
     * Aggiunge un designatore alla sezione.
     * @param designatore Il designatore da aggiungere
     */
    public void aggiungiDesignatore(Designatore designatore) {
        designatori.add(designatore);
    }

    /**
     * Elimina un designatore dalla sezione dato il nome, il cognome e il codice.
     * @param nome Il nome del designatore da eliminare
     * @param cognome Il cognome del designatore da eliminare
     * @param codice Il codice del designatore da eliminare
     */
    public void eliminaDesignatore(String nome, String cognome, int codice) {
        for (int i = 0; i < designatori.size(); i++) {
            if (designatori.get(i).getNome().equals(nome)) {
                if (designatori.get(i).getCognome().equals(cognome)) {
                    if (designatori.get(i).getCodice() == codice) {
                        designatori.remove(i);
                    }
                }
            }
        }
    }

    // Metodi per la designazione e l'eliminazione delle partite

    /**
     * Designa una partita a un arbitro dato il suo codice.
     * @param codice Il codice dell'arbitro a cui designare la partita
     * @param partita La partita da designare
     */
    public void designaPartita(int codice, Partita partita) {
        for (int i = 0; i < arbitri.size(); i++) {
            if (arbitri.get(i).getCodice() == codice) {
                arbitri.get(i).setPartita(partita);
            }
        }
    }

    /**
     * Elimina una partita da un arbitro dato il codice dell'arbitro e il codice della partita.
     * @param codiceArbitro Il codice dell'arbitro da cui eliminare la partita
     * @param codicePartita Il codice della partita da eliminare
     */
    public void eliminaPartita(int codiceArbitro, int codicePartita) {
        for (int i = 0; i < arbitri.size(); i++) {
            if (arbitri.get(i).getCodice() == codiceArbitro) {
                ArrayList<Partita> elencoPartite = arbitri.get(i).visualizzaPartite();
                for (Partita partita : elencoPartite) {
                    if (partita.getCodice() == codicePartita) {
                        arbitri.get(i).eliminaPartita(codicePartita);
                        break;
                    }
                }
            }
        }
    }

    // Metodi per ottenere arbitri e designatori dalla sezione

    /**
     * Ottiene un arbitro dalla sezione dato il suo codice.
     * @param codice Il codice dell'arbitro da ottenere
     * @return L'arbitro corrispondente al codice, o null se non trovato
     */
    public Arbitro getArbitro(int codice) {
        for (int i = 0; i < arbitri.size(); i++) {
            if (arbitri.get(i).getCodice() == codice) {
                return arbitri.get(i);
            }
        }
        return null;
    }

    /**
     * Ottiene un designatore dalla sezione dato il suo codice.
     * @param codice Il codice del designatore da ottenere
     * @return Il designatore corrispondente al codice, o null se non trovato
     */
    public Designatore getDesignatore(int codice) {
        for (int i = 0; i < designatori.size(); i++) {
            if (designatori.get(i).getCodice() == codice) {
                return designatori.get(i);
            }
        }
        return null;
    }

    // Metodi per visualizzare gli arbitri e i designatori della sezione

    /**
     * Restituisce un elenco degli arbitri della sezione.
     * @return Un elenco degli arbitri della sezione
     */
    public ArrayList<Arbitro> visualizzaArbitri() {
        return arbitri;
    }

    /**
     * Restituisce un elenco dei designatori della sezione.
     * @return Un elenco dei designatori della sezione
     */
    public ArrayList<Designatore> visualizzaDesignatori() {
        return designatori;
    }
    
    
    public ArrayList<Partita> elencoPartiteOrdinato() {
        ArrayList<Partita> elencoPartiteOrdinato = new ArrayList<>();
        for (Arbitro arbitro : arbitri) {
            for (Partita partita : arbitro.getPartite()) {
                elencoPartiteOrdinato.add(partita);
            }
        }
        int lunghezza = elencoPartiteOrdinato.size();
        for (int i = 0; i < lunghezza - 1; i++) {
            for (int j = i + 1; j < lunghezza; j++) {
                if (elencoPartiteOrdinato.get(j).getGiorno().compareTo(elencoPartiteOrdinato.get(i).getGiorno()) < 0) {
                    Partita temp = elencoPartiteOrdinato.get(i);
                    elencoPartiteOrdinato.set(i, elencoPartiteOrdinato.get(j));
                    elencoPartiteOrdinato.set(j, temp);
                }
            }
        }
        return elencoPartiteOrdinato;
    }
    
    public void salvaDati(String nomeFile) throws FileNotFoundException, IOException
    {
        ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(nomeFile));
        writer.writeObject(this);
        writer.flush();
        writer.close();
    }
    
     public Sezione caricaDati(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Sezione s1;
        ObjectInputStream reader=new ObjectInputStream(new FileInputStream(nomeFile));
        s1=(Sezione)reader.readObject();
        reader.close();
        return s1;
    }
     
    public void serializzazione(){
        try 
        {
            String nomeFileBinario="sezione.bin";
            this.salvaDati(nomeFileBinario);
            System.out.println("Salvataggio avvenuto correttamente");
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File non trovato");
        } 
        catch (IOException ex) 
        {
             System.out.println("Impossibile accedere al file");
        }
    }
    
    public void deserializzazione(){
        try 
        {
            String nomeFileBinario="sezione.bin";
            this.caricaDati(nomeFileBinario);
            System.out.println("Caricamento effettuato correttamente");
        }
        catch (FileNotFoundException ex) 
        {
            System.out.println("File non trovato");
        } 
        catch (IOException ex) 
        {
             System.out.println("Impossibile accedere al file");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Impossibile leggere il dato memorizzato");
        }
    }
}
