package tn.esprit.spring.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.enums.Genre;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private Genre genre;

}
