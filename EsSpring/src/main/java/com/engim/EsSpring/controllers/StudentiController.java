package com.engim.EsSpring.controllers;


import com.engim.EsSpring.model.Studente;
import com.engim.EsSpring.model.repository.StudenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studente")
public class StudentiController {
    @GetMapping("/selezionaStudenti")
    public List<Studente> getStudenti(){
        return StudenteRepository.selectStudenti();

    }

    @PostMapping(value = "/inserisciStudente")
    public Studente inserisciStudente(@RequestBody Studente studente){
        return StudenteRepository.insertStudente(studente);
    }

    @DeleteMapping(value = "/deleteStudente")
    public Studente deleteStudente(@RequestBody Studente studente){
        return StudenteRepository.deleteStudente(studente);
    }
}
