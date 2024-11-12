package org.petstore.entities.product;

import jakarta.persistence.*;
import org.petstore.entities.PetStore;

import java.util.List;

/**
 * Représente un produit dans le système de gestion de la boutique d'animaux.
 * Un produit peut être associé à plusieurs boutiques.
 */
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Column(name = "prod_type")
    private ProdType type;

    @Column(name = "price")
    private Double price;

    @ManyToMany(mappedBy = "products")
    @Column(name = "petstores_having_product")
    private List<PetStore> petstores;

    /**
     * Constructeur par défaut pour la classe Product.
     */
    public Product(){}

    /**
     * Obtient l'identifiant unique du produit.
     *
     * @return l'identifiant du produit
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique du produit.
     *
     * @param id l'identifiant du produit
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtient le code unique du produit.
     *
     * @return le code du produit
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit le code unique du produit.
     *
     * @param code le code du produit
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Obtient le label (nom) du produit.
     *
     * @return le label du produit
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit le label (nom) du produit.
     *
     * @param label le label du produit
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Obtient le type du produit.
     *
     * @return le type du produit
     */
    public ProdType getType() {
        return type;
    }

    /**
     * Définit le type du produit.
     *
     * @param type le type du produit
     */
    public void setType(ProdType type) {
        this.type = type;
    }

    /**
     * Obtient le prix du produit.
     *
     * @return le prix du produit
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Définit le prix du produit.
     *
     * @param price le prix du produit
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Obtient la liste des boutiques ayant ce produit en stock.
     *
     * @return la liste des boutiques associées à ce produit
     */
    public List<PetStore> getPetstores() {
        return petstores;
    }

    /**
     * Définit la liste des boutiques ayant ce produit en stock.
     *
     * @param petstores la liste des boutiques à associer au produit
     */
    public void setPetstores(List<PetStore> petstores) {
        this.petstores = petstores;
    }
}
