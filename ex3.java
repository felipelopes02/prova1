/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int tempo, horas, minutos, segundos;
        float Minicial, Mfinal;
        tempo = 0;
        
        System.out.println("Informe em gramas a massa inicial do material radioativo: ");
        Minicial = leia.nextFloat();
        
        Mfinal = Minicial;
        
            while (Mfinal >= 0.5){
                Mfinal = Mfinal / 2;
                tempo = tempo + 50;
            }
            
            horas = tempo / 3600;
            minutos = (tempo % 3600) / 60;
            segundos = (tempo % 3600) % 60;
            
        System.out.println("A massa inicial é igual a " + Minicial + "gramas");
        System.out.println("A massa final é igual a " + Mfinal + "gramas");
        System.out.println(horas + " horas/"+ minutos + " minutos/"+ segundos + "segundos" );
    }
}
