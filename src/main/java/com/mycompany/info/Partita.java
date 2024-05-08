/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.info;

import java.time.LocalDate;

/**
 * Questa classe rappresenta un oggetto Partita con attributi come codice, squadra ospitante, squadra ospite, città, giorno, distanza e categoria.
 */
public class Partita {
    private long codice; // Il codice univoco della partita
    private static long nextCodice = 1; // Il prossimo codice disponibile per la nuova partita
    private String squadraOspitante; // Il nome della squadra ospitante
    private String squadraOspite; // Il nome della squadra ospite
    private String citta; // Il nome della città in cui si svolge la partita
    private LocalDate giorno; // La data della partita
    private int distanza; // La distanza in chilometri tra le due squadre
    private String categoria; // La categoria della partita

    /**
     * Costruttore della classe Partita.
     * @param squadraOspitante Il nome della squadra ospitante
     * @param squadraOspite Il nome della squadra ospite
     * @param citta Il nome della città in cui si svolge la partita
     * @param giorno La data della partita
     * @param distanza La distanza in chilometri tra le due squadre
     * @param categoria La categoria della partita
     */
    public Partita(String squadraOspitante, String squadraOspite, String citta, LocalDate giorno, int distanza, String categoria) {
        codice = nextCodice;
        this.squadraOspitante = squadraOspitante;
        this.squadraOspite = squadraOspite;
        this.citta = citta;
        this.giorno = giorno;
        this.distanza = distanza;
        this.categoria = categoria;
        nextCodice++;
    }

    /**
     * Costruttore di copia per la classe Partita.
     * @param partita L'oggetto Partita da copiare
     */
    public Partita(Partita partita) {
        this.squadraOspitante = partita.getSquadraOspitante();
        this.squadraOspite = partita.getSquadraOspite();
        this.citta = partita.getCitta();
        this.giorno = partita.getGiorno();
        this.categoria = partita.getCategoria();
        this.distanza = partita.getDistanza();
    }

    /**
    * Restituisce il codice univoco della partita.
    * @return Il codice della partita
    */
    public long getCodice() {
       return codice;
    }

    /**
    * Imposta il nome della squadra ospitante della partita.
    * @param squadraOspitante Il nome della squadra ospitante
    */
    public void setSquadraOspitante(String squadraOspitante) {
       this.squadraOspitante = squadraOspitante;
    }

    /**
    * Imposta il nome della squadra ospite della partita.
    * @param squadraOspite Il nome della squadra ospite
    */
    public void setSquadraOspite(String squadraOspite) {
       this.squadraOspite = squadraOspite;
    }

    /**
    * Restituisce la categoria della partita.
    * @return La categoria della partita
    */
    public String getCategoria() {
       return categoria;
    }    

    /**
    * Imposta la categoria della partita.
    * @param categoria La categoria della partita
    */
    public void setCategoria(String categoria) {
       this.categoria = categoria;
    }

    /**
    * Imposta il nome della città in cui si svolge la partita.
    * @param citta Il nome della città
    */
    public void setCitta(String citta) {
       this.citta = citta;
    }

    /**
    * Imposta la distanza in chilometri tra le due squadre.
    * @param distanza La distanza in chilometri
    */
    public void setDistanza(int distanza) {
       this.distanza = distanza;
    }

    /**
    * Imposta la data della partita.
    * @param giorno La data della partita
    */
    public void setGiorno(LocalDate giorno) {
       this.giorno = giorno;
    }

    /**
     * Restituisce il nome della squadra ospitante della partita.
     * @return Il nome della squadra ospitante
     */
    public String getSquadraOspitante() {
        return squadraOspitante;
    }

    /**
     * Restituisce il nome della squadra ospite della partita.
     * @return Il nome della squadra ospite
     */
    public String getSquadraOspite() {
        return squadraOspite;
    }

    /**
     * Restituisce il nome della città in cui si svolge la partita.
     * @return Il nome della città
     */
    public String getCitta() {
        return citta;
    }

    /**
     * Restituisce la distanza in chilometri tra le due squadre.
     * @return La distanza in chilometri
     */
    public int getDistanza() {
        return distanza;
    }

    /**
     * Restituisce la data della partita.
     * @return La data della partita
     */
    public LocalDate getGiorno() {
        return giorno;
    }
    
    /**
     * Restituisce il rimborso della partita in base alla categoria.
     * @return Il rimborso della partita
     */
    public int getRimborso() {
        int rimborso = 0;
        switch (categoria) {
            case "giovanissimi", "allievi" -> rimborso = 36;
            case "juniores" -> rimborso = 46;
            case "terza categoria" -> rimborso = 56;
            case "seconda categoria" -> rimborso = 66;
            case "prima categoria" -> rimborso = 76;
            case "promozione" -> rimborso = 86;
            case "eccellenza" -> rimborso = 96;
            case "serie D" -> rimborso = 106;
            case "serie C" -> rimborso = 116;
            case "serie B" -> rimborso = 126;
            case "serie A" -> rimborso = 136;
        }
        return rimborso;
    }

    /**
     * Ridefinizione del metodo equals
     * @param obj
     * @return true se due oggetti hanno gli stessi attributi
     */
    @Override
    public boolean equals(Object obj) {
            Partita p = (Partita) obj;
            return this.codice == p.getCodice() &&
                   this.squadraOspitante.equals(p.getSquadraOspitante()) &&
                   this.squadraOspite.equals(p.getSquadraOspite()) &&
                   this.citta.equals(p.getCitta()) &&
                   this.giorno.equals(p.getGiorno()) &&
                   this.distanza == p.getDistanza() &&
                   this.categoria.equals(p.getCategoria());
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto Partita.
     * @return Una stringa che contiene i dettagli della partita
     */
    @Override
    public String toString() {
        String s;
        s = "\tcodice: " + codice +
            "\n\tcitta: " + citta +
            "\n\t" + squadraOspitante + "-" + squadraOspite +
            "\n\tcategoria: " + categoria +
            "\n\tgiorno: "  + getGiorno() +
            "\n\tdistanza: " + distanza +
            "\n\trimborso: " + getRimborso() + "€";
        return s;
    }
}
