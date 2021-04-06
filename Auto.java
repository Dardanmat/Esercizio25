package esercizi.esercizio25;


public class Auto extends Veicolo{
    
    private static int contaAuto = 1;

    public Auto(String marca, String modello, float potenza, float cilindrata) {
        super(marca, modello, potenza, cilindrata);
    }
    
    public Auto() {
        super();
    }
    
    public Auto(Auto a) {
        super(a);
    }
    
    @Override
    public String generaMatricola() {
        String s = "A" + contaAuto; 
        contaAuto ++;
        return s;
    }
    
}
