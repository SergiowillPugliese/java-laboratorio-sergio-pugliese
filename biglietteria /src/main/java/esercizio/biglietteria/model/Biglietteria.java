package esercizio.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biglietteria {
    private int idBiglietteria;
    private String nomeBiglietteria;
    private String indirizzo;

    public int getIdBiglietteria() {
        return idBiglietteria;
    }

    public void setIdBiglietteria(int idBiglietteria) {
        this.idBiglietteria = idBiglietteria;
    }
}
