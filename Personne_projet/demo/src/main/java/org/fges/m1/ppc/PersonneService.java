package org.fges.m1.ppc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class PersonneService implements IPersonneService {

    private List<Personne> liste_personne = new ArrayList<>(Arrays.asList(
            new Personne(1, "DURAND", "Jacques"),
            new Personne(2, "LAURENT", "Patrick"),
            new Personne(3, "CARDY", "Marine")
    ));


    @Override  
    public List<Personne> findAll()      
    {  
        return this.liste_personne;
    }

    @Override
    public Optional<Personne> get(int id) {
        Optional<Personne> personne = liste_personne
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        return personne;
    }

    @Override
    public Optional<Personne> get_by_name(String name) {
        Optional<Personne> person = liste_personne
                .stream()
                .filter(p -> p.getNom() == name)
                .findFirst();

        return person;
    }

    @Override
    public Optional<Personne> get_by_firstname(String firstname) {
        Optional<Personne> person = liste_personne
                .stream()
                .filter(p -> p.getPrenom() == firstname)
                .findFirst();

        return person;
    }

    @Override
    public void ajouter(Personne personne) {
        this.liste_personne.add(personne);
    }

    @Override
    public void supprimer(int id) {
        Optional<Personne> person_to_delete = liste_personne
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        person_to_delete.ifPresent(p -> {
            liste_personne.remove(p);
        });
    }

    @Override
    public void modifier(Personne personne) {
        Optional<Personne> person_to_upate = liste_personne
                .stream()
                .filter(p -> p.getId() == personne.getId())
                .findFirst();

        person_to_upate.ifPresent(p -> {
            p.setPrenom(personne.getPrenom());
            p.setNom(personne.getNom());
        });
    }



    
}    

