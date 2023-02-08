/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author amaurizio
 */
public class ProcessaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Carro carroAna = new Carro();
        carroAna.setMarca ("VW");
        carroAna.setModelo("Golf");
        carroAna.setProprietario("Ana");
        carroAna.setAno(2015);
        
        System.out.println(carroAna.toString());
        pagaIPVA(carroAna);
    }
   
    
    private static void pagaIPVA(Carro carroIPVA) {
        if ((2023 - carroIPVA.getAno()) <= 20) {
            System.out.println("O carro do(a) " + carroIPVA.getProprietario()+ " ainda paga IPVA");
        } else {
            System.out.println("O carro do(a) " + carroIPVA.getProprietario()+ " não paga IPVA");

                    }
        }
    }

