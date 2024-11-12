package org.petstore.entities.animals;

import jakarta.persistence.*;

@Entity
@Table(name = "cat")
@PrimaryKeyJoinColumn(name = "id")
public class Cat extends Animal {
    @Column(name = "chip_Id")
    private String chipId;

    public Cat(){}

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
