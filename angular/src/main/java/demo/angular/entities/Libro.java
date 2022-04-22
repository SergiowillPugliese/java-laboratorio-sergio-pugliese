package demo.angular.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LIBRO")
@NoArgsConstructor
@AllArgsConstructor
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autoincrement
    private Long ID;

    @Column(name = "ISBN", unique = true, updatable = false)//unique = chiave univoca, updatable = non modificabile
    private String isbn;

    @Column(name = "NOME_LIBRO", nullable = false)
    private String nomeLibro;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Autore autori;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public Autore getAutori() {
        return autori;
    }

    public void setAutori(Autore autori) {
        this.autori = autori;
    }
}
