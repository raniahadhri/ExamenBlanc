package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.enums.Genre;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToMany(mappedBy ="Clients", cascade = CascadeType.REMOVE)
    @JsonIgnore
    List<Boutique> Boutiques;
}
