/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, numero5, maior, menor;
            
        
            System.out.println("Informe o primeiro numero:");
            numero1 = leia.nextInt();
                   maior = numero1;
                   menor = numero1;
                   
            System.out.println("Informe o segundo numero:");
            numero2 = leia.nextInt();
                if (numero2 < menor){
                    menor = numero2;
                }
                
                if (numero2 > maior){
                    maior = numero2;
                }
            System.out.println("Informe o terceiro numero:");
            numero3 = leia.nextInt();
                if (numero3 < menor){
                    menor = numero3;
                }
                
                if (numero3 > maior){
                    maior = numero3;
                }
            System.out.println("Informe o quarto numero:");
            numero4 = leia.nextInt();
                if (numero4 < menor){
                    menor = numero4;
                }
                
                if (numero4 > maior){
                    maior = numero4;
                }
            System.out.println("Informe o quinto numero:");
            numero5 = leia.nextInt();
                if (numero5 < menor){
                    menor = numero5;
                }
                
                if (numero5 > maior){
                    maior = numero5;
                }
                
                System.out.println("O menor numero é "+ menor + " e o maior é " + maior);
    }
    
}
