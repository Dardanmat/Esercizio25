package esercizi.esercizio25;
import java.util.ArrayList;


public class ClasseContenitore<T> {
    
    protected ArrayList<T> lista;
    private String nome;

    public ClasseContenitore(ArrayList<T> lista, String nome) {
        this.lista = lista;
        this.nome = nome;
    }
    
    public ClasseContenitore(String nome) {
        this.lista = new ArrayList<>();
        this.nome = nome;
    }
    
    public ClasseContenitore() {
        this.lista = new ArrayList<>();
        this.nome = "Nameless";
    }
    
    public ClasseContenitore(ClasseContenitore c) {
        this.lista = (ArrayList<T>)c.lista.clone();
        this.nome = c.nome;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean addElemento(T elem){
        return lista.add(elem);
    }
    
    public T removeElemento(T elem){
        int pos = searchElemento(elem);
        return (pos != -1)? lista.remove(pos): null;
    }
    
    public int searchElemento(T elem){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(elem)) return i;
        }
        return -1;
    }
    
    public ArrayList<? extends T> creaListaPerTipo(Class c){
        ArrayList<T> list = new ArrayList<>();
        for(T l: lista){
            if(c == l.getClass()) list.add((T)l);
        }
        return (ArrayList<T>)list.clone();
    }
    
    public int contaIstanze(Class c){
        int j = 0;
        for(T l: lista){
            if(c == l.getClass()) j++;
        }
        return j++;
    }

    @Override
    public String toString() {
        String s = this.nome + "\n";
        for(T l: lista){
            s += l.toString() + "\n";
        }
        return s;
    }
    
}
