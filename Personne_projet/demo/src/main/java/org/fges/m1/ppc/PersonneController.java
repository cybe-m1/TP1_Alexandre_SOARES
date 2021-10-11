package org.fges.m1.ppc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonneController {
    public PersonneService person_service;

    @Autowired
    public PersonneController(PersonneService person_service) {
        this.person_service = person_service;
    }

    @GetMapping
    public List<Personne> listOfAllPersons() {
        return person_service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personne> getPersonById(@PathVariable int id) {
        return person_service.get(id);
    }

    @PostMapping
    public void Ajouter(@RequestBody Personne personne) {
        person_service.ajouter(personne);
    }

    @PutMapping
    public void Modifier(@RequestBody Personne personne) {
        person_service.modifier(personne);
    }

    @DeleteMapping("/{id}")
    public void Supprimer(@PathVariable int id) {
        person_service.supprimer(id);
    }
}

