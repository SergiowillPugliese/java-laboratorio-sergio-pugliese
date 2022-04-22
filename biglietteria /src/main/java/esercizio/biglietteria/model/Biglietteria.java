package esercizio.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biglietteria {
    private Long idBiglietteria;
    private String nomeBiglietteria;
    private String indirizzo;
}
