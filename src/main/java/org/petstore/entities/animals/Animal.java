package org.petstore.entities.animals;

import jakarta.persistence.*;
import org.petstore.entities.PetStore;

import java.util.Date;

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
    @JoinColumn(name = "id_du_petstore")
    private PetStore petstore_col;

    public Animal(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public PetStore getPetStore() {
        return petstore_col;
    }

    public void setPetStore(PetStore petStore_col) {
        this.petstore_col = petstore_col;
    }
}
