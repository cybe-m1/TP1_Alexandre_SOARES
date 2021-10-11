package org.fges.m1.ppc;

import java.util.List;
import java.util.Optional;

public interface IPersonneService   {  
    
    List<Personne> findAll();  

    void ajouter(Personne personne);

    void supprimer(int id);

    void modifier(Personne personne);

    Optional<Personne> get(int id);

    Optional<Personne> get_by_name(String name);

    Optional<Personne> get_by_firstname(String firstname);

}  
