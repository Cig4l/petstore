package org.petstore.entities.animals.fish;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import org.petstore.entities.animals.Animal;

/**
 * Représente un poisson dans le système de gestion de la boutique d'animaux.
 * Cette classe hérite de la classe {@link Animal} et ajoute des propriétés spécifiques aux poissons,
 * telles que leur environnement de vie.
 */
@Entity
@Table(name = "fish")
@PrimaryKeyJoinColumn(name = "id")
public class Fish extends Animal {
    @Column(name = "living_env")
    private FishLivEnv livingEnv;

    /**
     * Constructeur par défaut pour la classe Fish.
     */
    public Fish(){}

    /**
     * Obtient l'environnement de vie du poisson.
     *
     * @return l'environnement de vie du poisson
     */
    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    /**
     * Définit l'environnement de vie du poisson.
     *
     * @param livingEnv l'environnement de vie du poisson
     */
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
