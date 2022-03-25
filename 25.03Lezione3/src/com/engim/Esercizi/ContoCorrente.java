package com.engim.Esercizi;

/***
 * @Sergio Pugliese
 * questa classe andrà a rappresentare gli stati ed i comportamenti di un conto
 * corrente studiato ed analizzato
 */
public class ContoCorrente {
    private String titolare;
    private String ibaan;
    private double saldo;

    public ContoCorrente(){}

    //costruttore che rappresenta la creazione del mio conto corrente
    public ContoCorrente(String titolare, String ibaan, double saldo) {
        this.titolare = titolare;
        this.ibaan = ibaan;
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getIbaan() {
        return ibaan;
    }

    public void setIbaan(String ibaan) {
        this.ibaan = ibaan;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolare='" + titolare + '\'' +
                ", ibaan='" + ibaan + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //metodo che effettua il preleva la somma specificata in input
    public double prelievo (double sommaPrelevare){
        System.out.println("Vuoi Prelevare: " + sommaPrelevare);
        if (this.saldo >= sommaPrelevare ){
            //se vero posso prelevare
            this.saldo = this.saldo - sommaPrelevare;
            System.out.println("Operazione riuscita. Il tuo saldo attuale è: " + this.saldo);
            return sommaPrelevare;
        }
        System.out.println("sei povero come la merda. Il tuo saldo è: " + this.saldo + " non puoi prelevare " + sommaPrelevare);
        return Double.NEGATIVE_INFINITY;
    }

    public double deposito(double sommaDeposito){
        this.saldo = this.saldo + sommaDeposito;
        System.out.println("Hai depositato: " + sommaDeposito);
        System.out.println("Il tuo saldo ora è di: " + this.saldo);
        return this.saldo;
    }
}
