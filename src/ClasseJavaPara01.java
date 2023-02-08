
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author amaurizio
 */
public class ClasseJavaPara01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int contador;

        System.out.println("Contador com FOR: ");
        contador = leitor.nextInt();

        for (int x = 0; x <= contador; x++) {

            if (x > 0) {

                System.out.print("Contador com FOR: " + x);

                if (x % 2 == 0) {
                    System.out.print(" É par");
                } else {
                    System.out.print(" É ímpar");
                }
                JOptionPane.showMessageDialog(null, x);

                System.out.println();
            }
        }
    }
}
