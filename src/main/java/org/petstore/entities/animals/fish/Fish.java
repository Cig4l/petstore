package org.petstore.entities.animals.fish;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import org.petstore.entities.animals.Animal;

@Entity
@Table(name = "fish")
@PrimaryKeyJoinColumn(name = "id")
public class Fish extends Animal {
    @Column(name = "living_env")
    private FishLivEnv livingEnv;

    public Fish(){}

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
