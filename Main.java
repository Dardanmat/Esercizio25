package esercizi.esercizio25;


public class Main {

    public static void main(String[] args) {
        
        Rivenditore rivenditore = new Rivenditore("Autosellere Guerri");
        
        rivenditore.addVeicolo(new Auto("FIAT", "Panda", 55, 1200));
        rivenditore.addVeicolo(new Auto("Honda", "Civic", 80, 32000));
        rivenditore.addVeicolo(new Auto("Scevrole", "Macchian", 220, 250));
        
        rivenditore.addVeicolo(new Moto("Yamaha", "R1", 15, 125));
        rivenditore.addVeicolo(new Moto("Honda", "CBR", 7, 75));
        rivenditore.addVeicolo(new Moto("Bugatti", "BugaMoto", 2, 25));
        rivenditore.addVeicolo(new Moto("Nasa", "Spaziomoto", 90, 1200));
        
        rivenditore.stampaToString();
        
        for(Veicolo v: rivenditore.getLista()){
            if(v instanceof Moto) System.out.println( v.getModello() + " - " + ((Moto)v).tipoPatenteMinima() );
        }
        
        System.out.println("\nCi sono " + rivenditore.contaMoto() + " moto");
        System.out.println("Ci sono " + rivenditore.contaAuto() + " auto");
        
        String matricola = "A2";
        System.out.println("---------------------------RIMOZIONE DELL'AUTO CON LA MATRICOLA " + matricola + "---------------------------\n");
        
        rivenditore.removeVeicolo(matricola);
        System.out.println("Ci sono " + rivenditore.contaMoto() + " moto");
        System.out.println("Ci sono " + rivenditore.contaAuto() + " auto\n");
        rivenditore.stampaToString();
        
        matricola = "M3";
        System.out.println("---------------------------RIMOZIONE DELLA MOTO CON LA MATRICOLA " + matricola + "---------------------------\n");
        
        rivenditore.removeVeicolo(matricola);
        System.out.println("Ci sono " + rivenditore.contaMoto() + " moto");
        System.out.println("Ci sono " + rivenditore.contaAuto() + " auto\n");
        rivenditore.stampaToString();
        
    }
    
}
