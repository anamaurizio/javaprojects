
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaurizio
 */
public class HorasDoDia {
    
  public static void main(String[] args) {
      
      Scanner leitor = new Scanner(System.in);
      
      int hora;
      
      System.out.println("Informe que horas são: ");
      hora = leitor.nextInt();
      
      if(hora >= 18) {
          System.out.println("Está de noite!");
      } else if (hora >= 12) {
          System.out.println("Está de tarde!");
      } else if (hora >=6) {
          System.out.println("Está de manhã!");
      } else {
          System.out.println("Está de madrugada!");
      }
      
      
      
  }  
    
}
