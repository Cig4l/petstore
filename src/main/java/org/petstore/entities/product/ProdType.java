package org.petstore.entities.product;

import jakarta.persistence.Entity;

/**
 * Représente les différents types de produits disponibles dans le système de gestion de la boutique d'animaux.
 */
public enum ProdType {
    /**
     * Type de produit pour la nourriture des animaux.
     */
    TYPE_FOOD,

    /**
     * Type de produit pour les produits de nettoyage.
     */
    TYPE_CLEANING,

    /**
     * Type de produit pour les accessoires d'animaux.
     */
    TYPE_ACCESSORY
}
