package org.fges.m1.ppc;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Personne {
    public int id;
    public String nom;
    public String prenom;

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return this.id;
      }

      public String getNom() {
        return this.nom;
      }

      public String getPrenom() {
        return this.prenom;
      }

      public void setId(int id) {
        this.id = id;
      }

      public void setNom(String nom) {
        this.nom = nom;
      }

      public void setPrenom(String prenom) {
        this.prenom = prenom;
      }

      @Override
  public String toString() {
    return "Personne{" + "id=" + this.id + ", nom='" + this.nom + '\'' + ", prenom='" + this.prenom + '\'' + '}';
  }
}

