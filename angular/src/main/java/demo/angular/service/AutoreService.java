package demo.angular.service;

import demo.angular.entities.Autore;

import java.util.List;

public interface AutoreService {
    List<Autore> selezionaAutori();
    Autore inserisciAutore(Autore autore);
}
