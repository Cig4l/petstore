package org.petstore.entities.animals.fish;

import jakarta.persistence.Entity;

/**
 * Représente les différents environnements de vie possibles pour les poissons
 * dans le système de gestion de la boutique d'animaux.
 */
public enum FishLivEnv {
    /**
     * Eau douce, convient aux poissons d'eau douce.
     */
    FRESH_WATER,

    /**
     * Eau de mer, convient aux poissons d'eau salée.
     */
    SEA_WATER
}
