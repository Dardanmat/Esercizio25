package esercizi.esercizio25;


public class Moto extends Veicolo{
    
    private static int contaMoto = 1;

    public Moto(String marca, String modello, float potenza, float cilindrata) {
        super(marca, modello, potenza, cilindrata);
    }
    
    public Moto() {
        super();
    }
    
    public Moto(Moto m) {
        super(m);
    }
    
    @Override
    public String generaMatricola() {
        String s = "M" + contaMoto; 
        contaMoto ++;
        return s;
    }
    
    public String tipoPatenteMinima(){
        if(getPotenza() > 35) return "A";
        else if(getCilindrata() > 125 || getPotenza() > 11) return "A2";
        else if(getCilindrata() > 50 || getPotenza() > 4) return "A1";
        else return "AM";
    }
    
}