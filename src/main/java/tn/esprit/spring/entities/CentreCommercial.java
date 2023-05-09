package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)

public class CentreCommercial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nom;
    @Column
    private String adresse;
    @Column
    private String login;
    @Column
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="CentreCommercial")
    @JsonIgnore
    private List<Boutique> boutiques;
}
