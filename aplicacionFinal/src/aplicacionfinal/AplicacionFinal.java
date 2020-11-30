/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfinal;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Jose Ramon Hernandez
 */
public class AplicacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int venta=1;
        int opcion;
      ListaLigadaDoble<String> lista = new ListaLigadaDoble<>();
      ListaLigadaDoble<Integer> lista2 = new ListaLigadaDoble<>();
       
       pilaFritura fritura = new pilaFritura();
       pilaGalleta galleta = new pilaGalleta();
       pilaCacahuates cacahuates = new pilaCacahuates();
    
       colaCerveza cerveza = new colaCerveza();
       colaLacteos lacteos = new colaLacteos();
       colaRefrescos refrescos = new colaRefrescos();
       colaAguas aguas = new colaAguas();
       
       aguas.abastecer("Bonafont");aguas.abastecer("E-pura");aguas.abastecer("Ciel");
       cerveza.abastecer("Indio");cerveza.abastecer("Tecate");cerveza.abastecer("Sol");
       lacteos.abastecer("Yakult");lacteos.abastecer("Yogurth-lala");lacteos.abastecer("Leche");
       refrescos.abastecer("Coca-cola");refrescos.abastecer("Pepsi");refrescos.abastecer("Fanta");
       
       cacahuates.abastecer("Hot-Nuts");cacahuates.abastecer("Kiyakis");cacahuates.abastecer("Mafer");
       fritura.abastecer("Doritos");fritura.abastecer("Fritos");fritura.abastecer("Chips");
       galleta.abastecer("Principe");galleta.abastecer("Plativolos");galleta.abastecer("Sponch");
       
        JOptionPane.showMessageDialog(null, "Aplicacion que simula las ventas de un OXXO \ncon ayuda de: \n*ListasDoblementeLigadas \n*Pilas \n*Colas");
    
        do{
            		
        
        String[] botones = {"Caja", "Tareas", "Inventario", "Salir"};			
         opcion = JOptionPane.showOptionDialog(null, 							
                 "Elige una opcion", 							
                "Opciones", 							
                JOptionPane.DEFAULT_OPTION, 							
                JOptionPane.QUESTION_MESSAGE, null, 							
                botones, botones[0]);
         switch(opcion)
             {
             case 0: entrada = JOptionPane.showInputDialog(null, "¿Qué deceas hacer? \n\n"
                     + "1. Registrar venta \n"
                     + "2. Ver todas las ventar realizadas hasta el momento \n"
                     + "3. Saber el numero de ventas realizadas hasta el momento \n"
                     + "4. Eliminar venta");
                     int x = Integer.parseInt(entrada);
                     if(x == 1)
                     {
                        
                         
                       String entrada1 = JOptionPane.showInputDialog(null, "Elige el numero de Puerta o de Gondola del cual deceas vender producto \n\n"
                                + "1. Puerta de Aguas\n"
                                 + "2. Puerta de Cerveza\n"
                                 + "3. Puerta de Lacteos\n"
                                 + "4. Puerta de Refrescos\n"
                                 + "5. Gondola de Cacahuates\n"
                                 + "6. Gondola de Frituras\n"
                                 + "7. Gondola de Galletas" );
                         int x1= Integer.parseInt(entrada1);
                         
                         if(x1 == 1)
                         {
                             aguas.vender();
                            
                             lista.insertarFinal("Venta de: Aguas");
                         }
                         else if(x1 == 2)
                         {
                             cerveza.vender();
                             lista.insertarFinal("Venta de: Cerveza");
                         }
                         else if(x1 == 3)
                         {
                             lacteos.vender();
                             lista.insertarFinal("Venta de: Lacteos");
                         }
                         else if(x1 == 4)
                         {
                              refrescos.vender();
                              lista.insertarFinal("Venta de: Refrescos");
                         }
                         else if(x1 == 5)
                         {
                              cacahuates.vender();
                              lista.insertarFinal("Venta de: cacahuates");
                         }
                         else if(x1 == 6)
                         {
                              fritura.vender();
                              lista.insertarFinal("Venta de: Fritura");
                         }
                         else if(x1 == 7)
                         {
                              galleta.vender();
                              lista.insertarFinal("Venta de: galletas");
                         }
                         else if(x1 <1 && x1 > 7)
                             System.out.println("Error, opcion no valida");
                         
                     }
                     else if(x == 2)
                     {
                         lista.imprimirLista();
                     }
                     else if(x == 3)
                     {
                         lista.getLength();
                     }
                     else if(x == 4)
                     {
                          lista.imprimirLista();
                         String entrada2 = JOptionPane.showInputDialog(null,"Teclea el numero que se encuentra del lado izquierdo de la venta para eliminarla");
                         int x2 = Integer.parseInt(entrada2);
                         lista2.eliminarPosicion(x2);
                     }
                     else if(x < 1 && x > 4)
                     {
                         System.out.println("Opcion No valida");
                     }
                     break;
             case 1: System.out.println("");
             aguas.tamaño();
             cerveza.tamaño();
             lacteos.tamaño();
             refrescos.tamaño();
                 System.out.println("");
             cacahuates.tamaño();
             fritura.tamaño();
             galleta.tamaño();
                 System.out.println("");
                 String[] botones2 = {"Abastecer Piso (Gondolas)", "Abastecer Cuarto Frio (Puertas)"};			
                        int opcion2 = JOptionPane.showOptionDialog(null, 							
                                "Elige una opcion:", 							
                         "Opciones", 							
                          JOptionPane.DEFAULT_OPTION, 							
                          JOptionPane.QUESTION_MESSAGE, null, 							
                           botones2, botones2[0]);
                        
                        if(opcion2 == 0)
                        {
                             String entrada3 = JOptionPane.showInputDialog(null, "Teclea el numero de gondola a abastecer \n\n"
                                     + "1. Cacahuate\n"
                                     + "2. Fritura\n"
                                     + "3. Galleta");
                             int x3 = Integer.parseInt(entrada3);
                             if(x3 == 1)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para gondola-cacahuate");
                                 cacahuates.abastecer(entrada4);
                             }
                             else if(x3 == 2)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para gondola-fritura");
                                 fritura.abastecer(entrada4);
                             }
                             else if(x3 == 3)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para gondola-galleta");
                                 galleta.abastecer(entrada4);
                             }
                             else if(x3 < 1 && x3 > 3 )
                                 System.out.println("Error, opcion no valida");
                        }
                        else if(opcion2 == 1)
                        {
                             String entrada3 = JOptionPane.showInputDialog(null, "Teclea el numero de puerta a abastecer \n\n"
                                     + "1. Aguas\n"
                                     + "2. Cerveza\n"
                                     + "3. Lacteos\n"
                                     + "4. Refrescos");
                             int x3 = Integer.parseInt(entrada3);
                             if(x3 == 1)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para puerta-aguas");
                                 aguas.abastecer(entrada4);
                             }
                             else if(x3 == 2)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para puerta-cerveza");
                                 cerveza.abastecer(entrada4);
                             }
                             else if(x3 == 3)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para puerta-lacteos");
                                 lacteos.abastecer(entrada4);
                             }
                             else if(x3 == 4)
                             {
                                 String entrada4 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto para puerta-refrescos");
                                 refrescos.abastecer(entrada4);
                             }
                             else if(x3 < 1 && x3 > 4)
                                 System.out.println("Error, opcion no valida");
                        }
                        else if(opcion2 > 1)
                            System.out.println("Error, opcion no valida");
                        break;
             case 2:  System.out.println("Cuarto frio");
                         aguas.mostrarProducto();
                         cerveza.mostrarProducto();
                         lacteos.mostrarProducto();
                         refrescos.mostrarProducto();
                         System.out.println("");
                         System.out.println("Gondolas");
                         cacahuates.mostrarProductos();
                         fritura.mostrarProductos();
                         galleta.mostrarProductos();
                         break;
                  case 3: JOptionPane.showMessageDialog(null, "¡ATENCIÓN, CERRANDO PROGRAMA! ");

                            System.exit(0);
                           break;
                         default :System.out.println ("\tOpcion no valida, intenta de nuevo\n");
                            }
         }while(opcion != 3);
       
        }
    
    }
    

