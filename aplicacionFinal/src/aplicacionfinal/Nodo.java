/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfinal;

/**
 *
 * @author Jose Ramon Hernandez
 */
public class Nodo<T> {
     
    T objeto;
    Nodo<T>anterior;
    Nodo<T>siguiente;
    
    public Nodo(T objeto, Nodo<T> anterior, Nodo<T> siguiente){
        this.objeto = objeto;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    public T getObjeto(){
        return objeto;
    }
    
    public void setObjeto(T objeto){
        this.objeto = objeto;
    }
    
    public Nodo<T> getAnterior(){
        return anterior;
    }
    
    public void setAnterior(Nodo<T> anterior){
        this.anterior = anterior;
    }
    
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}
