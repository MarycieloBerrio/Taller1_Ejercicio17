/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1.ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        double radio, area, circunferencia;
        Scanner N = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio: ");
        radio = N.nextInt();
        
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El radio es " + radio);
        System.out.println("El area del circulo es " + area);
        System.out.println("La longitud de la circunferencia es " + circunferencia);
        
    }
}
