package esercizio.biglietteria.controller;

import esercizio.biglietteria.model.Repository.UtenteRepository;
import esercizio.biglietteria.model.Utente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/utente")
public class UtenteController {
    @GetMapping(value = "/selezionaTuttiUtenti")
    public List<Utente>getUtenti(){
        return UtenteRepository.selezionaUtenti();
    }
}
