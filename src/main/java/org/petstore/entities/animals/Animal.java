package org.petstore.entities.animals;

import jakarta.persistence.*;
import org.petstore.entities.PetStore;

import java.util.Date;

/**
 * Représente un animal dans le système de gestion de la boutique d'animaux.
 * Cette classe est conçue pour être héritée par des classes spécifiques d'animaux
 * (par exemple, Chat, Poisson, etc.), afin de gérer différents types d'animaux.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "couleur")
    private String couleur;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_du_petstore", referencedColumnName = "id")
    private PetStore petstore_col;

    /**
     * Constructeur par défaut pour la classe Animal.
     */
    public Animal(){}

    /**
     * Obtient l'identifiant unique de l'animal.
     *
     * @return l'identifiant de l'animal
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique de l'animal.
     *
     * @param id l'identifiant de l'animal
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtient la date de naissance de l'animal.
     *
     * @return la date de naissance de l'animal
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * Définit la date de naissance de l'animal.
     *
     * @param birth la date de naissance de l'animal
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * Obtient la couleur de l'animal.
     *
     * @return la couleur de l'animal
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Définit la couleur de l'animal.
     *
     * @param couleur la couleur de l'animal
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Obtient la boutique d'animaux à laquelle cet animal est associé.
     *
     * @return la boutique d'animaux associée
     */
    public PetStore getPetStore() {
        return petstore_col;
    }

    /**
     * Associe cet animal à une boutique d'animaux spécifique.
     *
     * @param petStore_col la boutique d'animaux à associer
     */
    public void setPetStore(PetStore petStore_col) {
        this.petstore_col = petStore_col;
    }
}
