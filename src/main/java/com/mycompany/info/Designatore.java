/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.info;

/**
 * Questa classe rappresenta un designatore con attributi come nome, cognome e password.
 */
public class Designatore {
    private long codice; // Il codice univoco del designatore
    private static long nextCodice = 1; // Il prossimo codice disponibile per il nuovo designatore
    private String nome; // Il nome del designatore
    private String cognome; // Il cognome del designatore
    private String password; // La password del designatore
    
    /**
     * Costruttore della classe Designatore.
     * @param nome Il nome del designatore
     * @param cognome Il cognome del designatore
     * @param password La password del designatore
     */
    public Designatore(String nome, String cognome, String password) {
        codice = nextCodice;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        nextCodice++; 
    }
    
    /**
     * Costruttore di copia per la classe Designatore.
     * @param designatore L'oggetto Designatore da copiare
     */
    public Designatore(Designatore designatore) {
        this.nome = designatore.getNome();
        this.cognome = designatore.getCognome();
        this.password = designatore.getPassword();
    }

    // Metodi di accesso e impostazione per gli attributi della classe Designatore

    /**
     * Restituisce la password del designatore.
     * @return La password del designatore
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta la password del designatore.
     * @param password La password da impostare
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Restituisce il nome del designatore.
     * @return Il nome del designatore
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del designatore.
     * @param nome Il nome da impostare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome del designatore.
     * @return Il cognome del designatore
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome del designatore.
     * @param cognome Il cognome da impostare
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce il codice univoco del designatore.
     * @return Il codice del designatore
     */
    public long getCodice() {
        return codice;
    }

    /**
     * Restituisce una stringa che rappresenta il designatore con i suoi dati.
     * @return Una stringa che contiene i dati del designatore
     */
    @Override
    public String toString() {
        return "Designatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
