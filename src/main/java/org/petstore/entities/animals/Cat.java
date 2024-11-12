package org.petstore.entities.animals;

import jakarta.persistence.*;

/**
 * Représente un chat dans le système de gestion de la boutique d'animaux.
 * Cette classe hérite de la classe {@link Animal} et ajoute des propriétés spécifiques aux chats,
 * comme l'identifiant de la puce électronique.
 */
@Entity
@Table(name = "cat")
@PrimaryKeyJoinColumn(name = "id")
public class Cat extends Animal {
    @Column(name = "chip_Id")
    private String chipId;

    /**
     * Constructeur par défaut pour la classe Cat.
     */
    public Cat(){}

    /**
     * Obtient l'identifiant de la puce électronique du chat.
     *
     * @return l'identifiant de la puce électronique
     */
    public String getChipId() {
        return chipId;
    }

    /**
     * Définit l'identifiant de la puce électronique du chat.
     *
     * @param chipId l'identifiant de la puce électronique
     */
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
