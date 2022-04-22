package esercizio.biglietteria.model.relations;

import esercizio.biglietteria.model.Biglietteria;
import esercizio.biglietteria.model.Biglietto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BiglietteriaVendeBiglietti {
    private Biglietteria biglietteria;
    private Biglietto biglietto;
    private Integer quantita;
}
