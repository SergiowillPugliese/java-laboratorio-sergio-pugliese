package demo.angular.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "AUTORE")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Autore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NOME_AUTORE", nullable = false)
    private String nomeAutore;

    @OneToMany(mappedBy = "AUTORE", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Libro> libroList;
}
