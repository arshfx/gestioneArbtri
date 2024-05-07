/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.info;

import java.util.ArrayList;

/**
 * Questa classe rappresenta un oggetto Presidente con attributi come nome, cognome e password.
 */
public class Presidente {
    private String nome; // Il nome del presidente
    private String cognome; // Il cognome del presidente
    private String password; // La password del presidente

    /**
     * Costruttore per la classe Presidente.
     * @param nome Il nome del presidente
     * @param cognome Il cognome del presidente
     * @param password La password del presidente
     */
    public Presidente(String nome, String cognome, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
    }
    
    /**
     * Costruttore di copia per la classe Presidente.
     * @param presidente L'oggetto Presidente da copiare
     */
    public Presidente(Presidente presidente) {
        this.nome = presidente.getNome();
        this.cognome = presidente.getCognome();
        this.password = presidente.getPassword();
    }

    /**
     * Restituisce il nome del presidente.
     * @return Il nome del presidente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del presidente.
     * @param nome Il nuovo nome del presidente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome del presidente.
     * @return Il cognome del presidente
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome del presidente.
     * @param cognome Il nuovo cognome del presidente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce la password del presidente.
     * @return La password del presidente
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta la password del presidente.
     * @param password La nuova password del presidente
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto Presidente.
     * @return Una stringa che contiene il nome, il cognome e la password del presidente
     */
    @Override
    public String toString() {
        return "Presidente{" + "nome=" + nome + ", cognome=" + cognome + ", password=" + password + '}';
    }    
    
}
