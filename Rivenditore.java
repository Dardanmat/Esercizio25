package esercizi.esercizio25;
import java.util.ArrayList;

public class Rivenditore extends ClasseContenitore<Veicolo>{

    public Rivenditore(String nome) {
        super(nome);
    }
    
    public Rivenditore() {
        super();
    }
    
    public Rivenditore(ArrayList<Veicolo> lista, String nome) {
        super(lista, nome);
    }
    
    public Rivenditore(Rivenditore r) {
        super(r);
    }
    
    public boolean addVeicolo(Veicolo v){
        return super.addElemento(v);
    }
    
    public Veicolo removeVeicolo(Veicolo v){
        return super.removeElemento(v);
    }
    
    public Veicolo removeVeicolo(String matricola){
        int pos = cercaVeicolo(matricola);
        if(pos == -1){
            return null;
        }
        return removeVeicolo(lista.get(pos));
    }
    
    public int cercaVeicolo(String matricola){
        if(lista.isEmpty()) return -1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getMatricola().equals(matricola)) return i;
        }
        return -1;
    }
    
    public int contaMoto(){
        return super.contaIstanze(Moto.class);
    }
    
    public int contaAuto(){
        return super.contaIstanze(Auto.class);
    }

    @Override
    public String toString() {
        String s = "Rivenditore auto " + super.getNome() + "\n\n";
        
        for(Veicolo v: lista){
            if(v instanceof Auto) s += "AUTO ";
            else if(v instanceof Moto) s += "MOTO ";
            else s += "VEICOLO ";
            
            s += v.toString();
        }
        return s;
    }
    
    public void stampaToString(){
        System.out.println(toString());
    }
    
}
