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
public class colaLacteos {
     LinkedList<String> lista = new LinkedList<>();
    
     public void tamaño()
    {
        System.out.println("\nLa puerta Lacteos contiene: "+lista.size()+" productos");
    }
    
    public void abastecer(String x)
    {
        lista.addFirst(x);
    }
    
    public void vender()
    {
          if(lista.size() == 0)
        {
            System.out.println("\nError, la puerta se encuentra vacia");
            return;
        }
        
        
        lista.removeLast();
        System.out.println("Producto vendido");
    }
    
   public void mostrarProducto()
    {
        System.out.println("\nLa puerta Lacteos contiene los siguientes productos");
        for(int x=0; x < lista.size(); x++)
        {
            System.out.println((x+1)+" "+lista.get(x));
        }
        }
}
