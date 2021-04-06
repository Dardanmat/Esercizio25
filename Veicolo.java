package esercizi.esercizio25;


public abstract class Veicolo {
    
    private String marca;
    private String modello;
    private float potenza;
    private float cilindrata;
    
    private String matricola; //si auto genera

    public Veicolo(String marca, String modello, float potenza, float cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.potenza = potenza;
        this.cilindrata = cilindrata;
        this.matricola = generaMatricola();
    }
    
    public Veicolo() {
        this.marca = "";
        this.modello = "";
        this.potenza = 0;
        this.cilindrata = 0;
        this.matricola = generaMatricola();
    }
    
    public Veicolo(Veicolo v) {
        this.marca = v.marca;
        this.modello = v.modello;
        this.potenza = v.potenza;
        this.cilindrata = v.cilindrata;
        this.matricola = v.matricola;
    }
    
    public abstract String generaMatricola();

    public float getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(float cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getPotenza() {
        return potenza;
    }

    public void setPotenza(float potenza) {
        this.potenza = potenza;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        String s = "Matr. " + matricola
                    + "; Marca: " + marca 
                    + "; Mod: " + modello 
                    + "; Cilindrata " + potenza
                    + "\n";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof String){
            return obj.equals(matricola);
        }
        if(obj instanceof Veicolo){
            return ((Veicolo)obj).matricola.equals(matricola);
        }
        return false;
    }
    
    
    
}
