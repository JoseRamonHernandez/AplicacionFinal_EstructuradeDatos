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
public class ListaLigadaDoble<T> {
    
    private Nodo<T> head;
    private Nodo<T> tail;
    private int length;
    
    public ListaLigadaDoble(){
        this.length=0;
        head=null;
    }
    
    public int getLength(){
        
        System.out.println("El numero de ventas realizadas son: "+this.length);
    return length;
    }
    
    public boolean isEmpety(){
        return this.length == 0;
    }
    
   /*  public void ListaVacia(){
        
        if(this.length == 0)
        {
            System.out.println("La lista se encuentra vacia");
            
        }
        else
            System.out.println("La lista contiene datos");
        
    
    }
    */
  /*  public void insertarInicio(T objeto){
        Nodo<T> aux=new Nodo<T>(objeto, null, head);
        if(isEmpety()){
            
            tail=aux;
            System.out.println("\n*Adición correcta*");
        }
        else{
            head.setAnterior(aux);
            System.out.println("\n*Adición correcta*");
        }
        head=aux;
        length++;
    }*/
    
    public void insertarFinal(T objeto){
        Nodo<T> aux=new Nodo<T>(objeto, tail, null);
        if(isEmpety()){
            head=aux;
                System.out.println("\n*Adición correcta*");
        }
        else{
            tail.setSiguiente(aux);
            System.out.println("\n*Adición correcta*");
        }
        tail=aux;
    length++;    
    }/*
    
    public void insertarPosicion(T objeto, int posicion){
        if(isEmpety() || (posicion>length || posicion<1)){
            System.out.println("Error, la posicion no existe");
            System.exit(0);
        }
        else if(posicion == 1){
            insertarInicio(objeto);
        }
        else if(posicion == length){
            insertarFinal(objeto);
        }
        else{
            Nodo<T> actual=head;
            Nodo<T> anterior=head;
            int x=0;
            while(actual != null && (x !=posicion-1)){
                anterior=actual;
                actual=actual.getSiguiente();
                x++;
            }
            Nodo<T> aux=new Nodo<T>(objeto,anterior,actual);
            actual.setAnterior(aux);
            anterior.setSiguiente(aux);
            this.length++;
            System.out.println("\n*Adición correcta*");
        }
    }
    */
    
    public T eliminarPrincipio(){
        if(isEmpety()){
            System.out.println("\n *La lista se encuentra VACIA!!!*");
            return null;
        }
        T dato=head.getObjeto();
        head=head.getSiguiente();
        head.setAnterior(null);
        this.length--;
        System.out.println("\n *Nodo eliminado*");
        return dato;
    }
    
    public T eliminarUltimo(){
        if(isEmpety()){
            System.out.println("\n *La lista se encuentra VACIA!!!*");
            return null;
        }
        T dato=tail.getObjeto();
        tail=tail.getAnterior();
        tail.setSiguiente(null);
        this.length--;
         System.out.println("\n *Nodo eliminado*");
        return dato;
        
    }
    
    public T eliminarPosicion(int posicion){
        T dato=null;
        if(isEmpety() || (posicion>length || posicion<1)){
            System.out.println("Error, la posicion no existe");
            System.exit(0);
        }
        else if(posicion == 1){
            return eliminarPrincipio();
        }
        else if(posicion == length){
           return eliminarUltimo();
        }
        else{
            Nodo<T> actual=head;
            
            int x=0;
            while(actual != null && (x !=posicion-1)){
                
                actual=actual.getSiguiente();
                x++;
            }
           dato=actual.getObjeto();
           Nodo<T>siguiente=actual.getSiguiente();
           Nodo<T>anterior=actual.getAnterior();
           anterior.setSiguiente(siguiente);
           siguiente.setAnterior(anterior);
            this.length--;
        }
         System.out.println("\n *Nodo eliminado*");
        return dato;
    }
   
  
   
    
    void imprimirLista()
    {   int a=1;
        Nodo<T> actual = head;
        while(actual != null)
        {
           // T elemento = actual.getObjeto();
            System.out.println("Venta "+a+": " +actual.getObjeto()+((actual.getSiguiente()!=null)?", ":" "));
            actual = actual.getSiguiente();
            a++;
        }
    }
   
       
      
    
}
