package esercizio.biglietteria.model.relations;

import esercizio.biglietteria.model.Biglietto;
import esercizio.biglietteria.model.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtenteCompraBiglietto {
    private Utente utente;
    private Biglietto biglietto;
    private Integer quantitaBigliettiAcquistati;
    private String dataDiAcquisto;

}
