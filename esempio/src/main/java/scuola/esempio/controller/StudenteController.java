package scuola.esempio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scuola.esempio.model.Studente;
import scuola.esempio.model.repository.StudenteRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/studente")
public class StudenteController {
    @GetMapping(value = "/selezionaStudenti")
    public List<Studente> selezionaStudenti(){
        return StudenteRepository.selezionaStudenti();
    }

}
