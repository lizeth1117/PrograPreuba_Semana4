/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prograprueba_semana4;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class PrograPrueba_Semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantproductos ;
        float subtotal, total=0;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Favor ingrese la cantidad de productos de su compra: ");
        cantproductos=entrada.nextInt();
        String[] productos=new String[cantproductos];
        float [] precios =new float[cantproductos];
        int [] unidades=new int[cantproductos];
        
        
        for (int i = 0; i < cantproductos; i++) {
            System.out.println("Ingrese el producto "+(i+1));
            productos[i]=entrada.next();
        }
            for (int j = 0; j < cantproductos; j++) {
            System.out.println("Ingrese cuantas unidades de "+productos[j]+" esta coprando: ");
            unidades[j]=entrada.nextInt();
            }
                for (int k = 0; k < cantproductos; k++) {
                 System.out.println("Ingrese el precio de "+productos[k]+" : ");
                    precios[k]=entrada.nextFloat();     
                   }
            
     
        
           for (int i = 0; i < cantproductos; i++) {
            subtotal=unidades[i]*precios[i];
               System.out.println(unidades[i]+"..."+productos[i]+" * "+precios[i]+" = "+subtotal);
               total=total+subtotal;
        }
            System.out.println("el total de la compra es "+total);
            
            
        }
    }
    
