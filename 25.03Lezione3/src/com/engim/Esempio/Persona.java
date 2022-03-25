package com.engim.Esempio;

/***
 * Esempio che andrà a scrivere come creare una classe
 * andando in seguito ad istanziare l'oggetto della stessa
 */

public class Persona {
    //atributi di un potenziale oggetto di tipo persona
    public String nome;
    public String cognome;
    public String dataNascita;
    public Integer eta;

    //dichiarazione dei costruttore (mediante overload)
    //il costruttore deve eavere lo stesso nome della classe
    public Persona(){}
    public Persona(String nome, String cognome, String dataNascita){
        //la keyword this si riferisce alle variabili di istanza dichiarati all'inizio
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    public Persona(Integer eta){
        this.eta = eta;
    }

    @Override
    public String toString() {
        return " Persona {" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", eta=" + eta +
                '}';
    }
}
