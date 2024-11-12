package org.petstore.entities;

import jakarta.persistence.*;
import org.petstore.entities.animals.Animal;
import org.petstore.entities.product.Product;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "petstore_col", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Animal> animals = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "petstore_products",
            joinColumns = @JoinColumn(name = "petstore_joined_id"),
            inverseJoinColumns = @JoinColumn(name = "products_joined_id")
    )
    private List<Product> products = new ArrayList<>();

    public PetStore() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
        for (Animal animal : animals) {
            animal.setPetStore(this);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        animal.setPetStore(this);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
        animal.setPetStore(null);
    }
}