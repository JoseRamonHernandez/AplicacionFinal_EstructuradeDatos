/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfinal;

import java.util.LinkedList;

/**
 *
 * @author Jose Ramon Hernandez
 */
public class pilaCacahuates {
       LinkedList<String> lista = new LinkedList<>();
    
    
    public void tamaño()
    {
        System.out.println("\nLa gondola de Cacahuates contiene: "+lista.size()+" producto(s)");
    }
    
    public void abastecer(String x)
    {
        lista.addFirst(x);
        System.out.println("Producto añadido");
    }
    
     public void vender()
    {
        if(lista.size() == 0)
        {
            System.out.println("\nError, la gondola se encuentra vacia");
            return;
        }
        
        lista.remove(0);
        System.out.println("Producto Vendido");
       
    }
     
      public void mostrarProductos()
    {
        int x=1;
        System.out.println("\nLa gondola de Cacahuates contiene los siguientes Productos");
        for(String letra: lista)
            System.out.println( (x++)+" "+letra);
    }
}
