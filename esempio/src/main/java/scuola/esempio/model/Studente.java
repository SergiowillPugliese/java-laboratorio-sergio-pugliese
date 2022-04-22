package scuola.esempio.model;

public class Studente {
    private long id;
    private String nome;
    private String cognome;
    private String indirizzoStudio;

    public Studente() {}

    public Studente(long id, String nome, String cognome, String indirizzoScolastico) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoStudio = indirizzoScolastico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzoScolastico() {
        return indirizzoStudio;
    }

    public void setIndirizzoScolastico(String indirizzoScolastico) {
        this.indirizzoStudio = indirizzoScolastico;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzoScolastico='" + indirizzoStudio + '\'' +
                '}';
    }
}
