package esercizio.biglietteria.controller;

import esercizio.biglietteria.model.Biglietteria;
import esercizio.biglietteria.model.Repository.BiglietteriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "biglietteria")
public class BiglietteriaController {
    @GetMapping(value = "selezionaBiglietteria")
    public List<Biglietteria> getBiglietteria(){return BiglietteriaRepository.selectBiglietteria();
    }


}
