package tn.esprit.spring.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.enums.Categorie;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Boutique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private Categorie categorie;
}
