package esercizio.biglietteria.controller;

import esercizio.biglietteria.model.Biglietteria;
import esercizio.biglietteria.model.Repository.BiglietteriaRepository;
import esercizio.biglietteria.payload.BiglietteriaPayload;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "biglietteria")
public class BiglietteriaController {
    @GetMapping(value = "selectBiglietteria")
    public List<Biglietteria> getBiglietteria(){return BiglietteriaRepository.selectBiglietteria();
    }

    @PostMapping(value = "/insertBiglietteria")
    public Biglietteria insertBiglietteria(@RequestBody Biglietteria biglietteria){
        return BiglietteriaRepository.insertBiglietteria(biglietteria);
    }

    @DeleteMapping(value = "/deleteBiglietteria")
    public Biglietteria deleteBiglietteria(@RequestBody Biglietteria biglietteria){
        return BiglietteriaRepository.deleteBiglietteria(biglietteria.getIdBiglietteria());
    }

    @PostMapping(value = "/updateBiglietteria")
    public Biglietteria updateBiglietteria(@RequestBody Biglietteria biglietteria){
        return BiglietteriaRepository.updateBiglietteria(biglietteria);
    }


}
