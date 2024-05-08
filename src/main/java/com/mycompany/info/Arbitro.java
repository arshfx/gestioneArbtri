/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.info;

import java.util.ArrayList;

/**
 * Questa classe rappresenta un arbitro con attributi come nome, cognome, categoria, password, età e lista di partite.
 */
public class Arbitro {
    private ArrayList<Partita> partite; // Lista delle partite arbitrate dall'arbitro
    private String nome; // Il nome dell'arbitro
    private String cognome; // Il cognome dell'arbitro
    private String categoria; // La categoria dell'arbitro
    private String password; // La password dell'arbitro
    private int eta; // L'età dell'arbitro
    private long codice; // Il codice univoco dell'arbitro
    private static long nextCodice = 1; // Il prossimo codice disponibile per il nuovo arbitro

    /**
     * Costruttore della classe Arbitro.
     * @param nome Il nome dell'arbitro
     * @param cognome Il cognome dell'arbitro
     * @param categoria La categoria dell'arbitro
     * @param password La password dell'arbitro
     * @param eta L'età dell'arbitro
     */
    public Arbitro(String nome, String cognome, String categoria, String password, int eta) {
        codice = nextCodice;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.categoria = categoria;
        this.eta = eta;
        nextCodice++;
        partite = new ArrayList<>();
    }

    /**
     * Costruttore di copia per la classe Arbitro.
     * @param arbitro L'oggetto Arbitro da copiare
     */
    public Arbitro(Arbitro arbitro) {
        this.nome = arbitro.getNome();
        this.cognome = arbitro.getCognome();
        this.categoria = arbitro.getCategoria();
        this.password = arbitro.getPassword();
        this.eta = arbitro.getEta();
        this.partite = new ArrayList<>();
        for (Partita partita : arbitro.partite) {
            partite.add(new Partita(partita));
        }
    }

    /**
     * Aggiunge una partita all'elenco delle partite arbitrate dall'arbitro.
     * @param partita La partita da aggiungere
     */
    public void setPartita(Partita partita) {
        partite.add(partita);
    }

    /**
     * Elimina una partita dall'elenco delle partite arbitrate dall'arbitro utilizzando il codice della partita.
     * @param codice Il codice della partita da eliminare
     */
    public void eliminaPartita(int codice) {
        for (int i = 0; i < partite.size(); i++) {
            if (partite.get(i).getCodice() == codice) {
                partite.remove(i);
                break; // Esce dal ciclo dopo aver rimosso la partita
            }
        }
    }

    /**
     * Restituisce tutte le partite arbitrate dall'arbitro.
     * @return La lista delle partite
     */
    public ArrayList<Partita> getPartite() {
        return partite;
    }

    /**
     * Restituisce il numero di partite arbitrate dall'arbitro.
     * @return Il numero di partite
     */
    public int getNumeroPartite() {
        return partite.size();
    }

    /**
     * Imposta il nome dell'arbitro.
     * @param nome Il nome da impostare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il nome dell'arbitro.
     * @return Il nome dell'arbitro
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il cognome dell'arbitro.
     * @param cognome Il cognome da impostare
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce il cognome dell'arbitro.
     * @return Il cognome dell'arbitro
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta la categoria dell'arbitro.
     * @param categoria La categoria da impostare
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Restituisce la categoria dell'arbitro.
     * @return La categoria dell'arbitro
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta la password dell'arbitro.
     * @param password La password da impostare
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce la password dell'arbitro.
     * @return La password dell'arbitro
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta l'età dell'arbitro.
     * @param eta L'età da impostare
     */
    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * Restituisce l'età dell'arbitro.
     * @return L'età dell'arbitro
     */
    public int getEta() {
        return eta;
    }

    /**
     * Restituisce il codice univoco dell'arbitro.
     * @return Il codice dell'arbitro
     */
    public long getCodice() {
        return codice;
    }

    /**
    * Restituisce un elenco delle partite arbitrate dall'arbitro.
    * @return Un elenco delle partite arbitrate
    */
    public ArrayList<Partita> visualizzaPartite() {
       return partite;
    }

    
    /**
     * Restituisce una stringa che rappresenta l'arbitro con i suoi dati.
     * @return Una stringa che contiene i dati dell'arbitro
     */
    @Override
    public String toString() {
        return "Arbitro{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", eta=" + eta +
                ", codice=" + codice +
                ", numero di partite=" + getNumeroPartite() +
                '}';
    }
}
