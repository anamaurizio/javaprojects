
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaurizio
 */
public class ClasseJavaEnquanto01 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        int contador;
        
        System.out.println("Informe até que número o contador irá contar: ");
        contador = leitor.nextInt();
        
        int i = 0;
        
        while (i <= contador ) {
            
            if(i > 0){
                System.out.print("Contador: " + i); 
                if (i % 2 ==0) {
                    System.out.print(" É par");
                } else {
                    System.out.print(" É ímpar");
                }
                System.out.println();
            }

            i = i + 1;
        }
        
    }
    
}
