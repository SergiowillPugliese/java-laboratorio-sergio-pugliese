package esercizio.biglietteria.controller;

import esercizio.biglietteria.model.Biglietto;
import esercizio.biglietteria.model.Repository.BigliettoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "biglietto")
public class BigliettoController {
    @GetMapping(value = "selectBiglietto")
    public List<Biglietto>getBiglietto(){
        return BigliettoRepository.selectBiglietto();
    }

    @PostMapping(value = "insertBiglietto")
    public Biglietto insertBiglietto(@RequestBody Biglietto biglietto){
        return BigliettoRepository.insertBiglietto(biglietto);
    }

    @DeleteMapping(value = "deleteBiglietto")
    public Biglietto deleteBiglietto(@RequestBody Biglietto biglietto){
        return BigliettoRepository.deleteBiglietto(biglietto.getIdBiglietto());
    }

    @PostMapping
    public  Biglietto updateBiglietto(@RequestBody Biglietto biglietto){
        return BigliettoRepository.updateBiglietto(biglietto);
    }
}
