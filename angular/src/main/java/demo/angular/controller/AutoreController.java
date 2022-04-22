package demo.angular.controller;


import demo.angular.entities.Autore;
import demo.angular.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http//localhost:4200")
@RequestMapping("/autore")
public class AutoreController {
    private final AutoreService autoreService;

    @Autowired
    public AutoreController(AutoreService autoreService){
        this.autoreService = autoreService;
    }

    @GetMapping(value = "/selezionaAutori")
    public ResponseEntity<List<Autore>> selezionaAutori(){
        List<Autore> autoreList = this.autoreService.selezionaAutori();
        return new ResponseEntity<>(autoreList, HttpStatus.OK);
    }

}
