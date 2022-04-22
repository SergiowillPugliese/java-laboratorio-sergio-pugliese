package esercizio.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biglietto {
    private Long idBiglietto;
    private String dataEvento;
    private double costo;
    private String categoria;
}
