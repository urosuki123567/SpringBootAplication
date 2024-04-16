package org.etsntesla.it.controllers;

import org.etsntesla.it.models.Emocije;
import org.etsntesla.it.repositories.EmocijeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmocijeController {

    @Autowired
    EmocijeRepository emocijeRepository;

    @RequestMapping(path="/emocije", method = RequestMethod.GET)
    public List<Emocije> getAll(){
    return  emocijeRepository.findAll();
    }

    @RequestMapping(path="/emocije/{id}", method = RequestMethod.GET)
    public Emocije get(@PathVariable int id){
        return  emocijeRepository.findById(id).orElse(null);
    }
}
