package org.petstore.entities;

import jakarta.persistence.*;

/**
 * Représente une adresse pour une boutique d'animaux de compagnie (PetStore),
 * avec des informations telles que le numéro, la rue, le code postal et la ville.
 */
@Embeddable
public class Address {
    @Column(name = "number")
    private String number;

    @Column(name = "street")
    private String street;

    @Column(name = "zipCode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    /**
     * Constructeur par défaut pour la classe Address.
     */
    public Address(){}

    /**
     * Obtient le numéro de l'adresse.
     *
     * @return le numéro de l'adresse
     */
    public String getNumber() {
        return number;
    }

    /**
     * Définit le numéro de l'adresse.
     *
     * @param number le numéro de l'adresse
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Obtient le nom de la rue.
     *
     * @return le nom de la rue
     */
    public String getStreet() {
        return street;
    }

    /**
     * Définit le nom de la rue.
     *
     * @param street le nom de la rue
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Obtient le nom de la ville.
     *
     * @return le nom de la ville
     */
    public String getCity() {
        return city;
    }

    /**
     * Définit le nom de la ville.
     *
     * @param city le nom de la ville
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Obtient le code postal.
     *
     * @return le code postal
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Définit le code postal.
     *
     * @param zipcode le code postal
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}