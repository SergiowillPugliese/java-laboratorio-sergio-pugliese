package demo.angular.service.impl;

import demo.angular.entities.Autore;
import demo.angular.repository.AutoreRepository;
import demo.angular.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreServiceImpl implements AutoreService {
    private final AutoreRepository autoreRepository;

    @Override
    public List<Autore> selezionaAutori() {
        return null;
    }

    @Override
    public Autore inserisciAutore(Autore autore) {
        return null;
    }

    @Autowired
    public AutoreServiceImpl(AutoreRepository autoreRepository){
        this.autoreRepository = autoreRepository;


    }
}
