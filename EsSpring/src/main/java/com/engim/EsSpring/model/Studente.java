package com.engim.EsSpring.model;

import java.io.Serializable;


public class Studente implements Serializable {
    private String nome;
    private String cognome;
    private String genere;

    public Studente() {
    }

    public Studente(String nome, String cognome, String genere) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
