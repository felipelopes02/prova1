/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;



/**
 *
 * @author felip
 */
public class ex2 {
    public static void main(String[] args) {
        double aumento = 150 , salarioantigo = 1000, data = 1996;
        aumento = aumento / 100;
        
                do {
                    salarioantigo = salarioantigo + (salarioantigo * aumento/100);
                    aumento = aumento * 2;
                    data++;
                
            }   while (data <= 2022);
                
                System.out.println("O salario atual é de: " + salarioantigo);
    }
    
}
