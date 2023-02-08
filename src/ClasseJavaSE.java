import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClasseJavaSE {
    
    public static void main(String[] args) {
    
    System.out.println("Teste classe ok");
    
        float media;
        System.out.println("Qual é a média do aluno?");
        
        Scanner leitor = new Scanner(System.in);
        
        media = leitor.nextFloat();
        
        if(media >= 7) {
            System.out.println("O aluno está aprovado!");
            JOptionPane.showMessageDialog(null, "O aluno está aprovado!");
        } else {
            System.out.println("O aluno não está aprovado!");
        }JOptionPane.showMessageDialog(null, "O aluno não está aprovado!");
        
}
}
