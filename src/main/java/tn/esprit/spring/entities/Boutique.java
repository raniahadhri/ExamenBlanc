package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.enums.Categorie;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
//tous les attributs seront privates
public class Boutique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nom;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    @ManyToMany
    @JsonIgnore
    List<Client> Clients;
    @ManyToOne
    @JsonIgnore
    CentreCommercial CentreCommercial;
}
