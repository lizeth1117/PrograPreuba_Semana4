/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba_semana4;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class ConsumoDeAgua {
    
    public static void main(String[] args) {
        
        float consumo_mensual, promedio_mensual, totalanual=0;
        Scanner entrada= new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese el consumo del mes "+(i+1));
            consumo_mensual= entrada.nextFloat();
            totalanual=totalanual+consumo_mensual ;
        }
        promedio_mensual= totalanual/12 ;
        System.out.println("El promedio mensual de consumo de agua es de en este año es fue de "+promedio_mensual);
    }
}
