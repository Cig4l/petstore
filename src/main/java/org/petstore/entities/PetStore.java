package org.petstore.entities;

import jakarta.persistence.*;
import org.petstore.entities.animals.Animal;
import org.petstore.entities.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une boutique d'animaux avec un nom, un gestionnaire, une adresse,
 * une liste d'animaux et une liste de produits associés.
 */
@Entity
@Table(name = "petstore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "managerName")
    private String managerName;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "petstore_col", cascade = CascadeType.ALL)
    private List<Animal> animals = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "petstore_products",
            joinColumns = @JoinColumn(name = "petstore_joined_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "products_joined_id", referencedColumnName = "id")
    )
    private List<Product> products = new ArrayList<>();

    /**
     * Constructeur par défaut pour la classe PetStore.
     */
    public PetStore() {}

    /**
     * Obtient l'identifiant unique de la boutique.
     *
     * @return l'identifiant de la boutique
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique de la boutique.
     *
     * @param id l'identifiant de la boutique
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtient le nom de la boutique.
     *
     * @return le nom de la boutique
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom de la boutique.
     *
     * @param name le nom de la boutique
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtient le nom du gestionnaire de la boutique.
     *
     * @return le nom du gestionnaire
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Définit le nom du gestionnaire de la boutique.
     *
     * @param managerName le nom du gestionnaire
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * Obtient l'adresse de la boutique.
     *
     * @return l'adresse de la boutique
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Définit l'adresse de la boutique.
     *
     * @param address l'adresse de la boutique
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Obtient la liste des animaux associés à la boutique.
     *
     * @return la liste des animaux
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Définit la liste des animaux associés à la boutique et met à jour la relation bidirectionnelle.
     *
     * @param animals la liste des animaux
     */
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
        for (Animal animal : animals) {
            animal.setPetStore(this);
        }
    }

    /**
     * Obtient la liste des produits disponibles dans la boutique.
     *
     * @return la liste des produits
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Définit la liste des produits disponibles dans la boutique.
     *
     * @param products la liste des produits
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Ajoute un animal à la liste des animaux de la boutique et met à jour la relation bidirectionnelle.
     *
     * @param animal l'animal à ajouter
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        animal.setPetStore(this);
    }

    /**
     * Retire un animal de la liste des animaux de la boutique et met à jour la relation bidirectionnelle.
     *
     * @param animal l'animal à retirer
     */
    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
        animal.setPetStore(null);
    }
}
