package com.workintech.s18g2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SecondaryRow;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegetable" , schema = "projects")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;

}
