import java.util.Scanner;

public class Main
{  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        
        int tamanho = lerTamanho(s);
        int vetor [] = lerElementos(s, tamanho);
        
        exibirVetor(vetor);
        
        s.close();
    }
    
    private static int lerTamanho(Scanner s){
        return s.nextInt();
    }
    
    private static int[] lerElementos(Scanner s, int tamanho){
        int vetor [] = new int[tamanho];
        for(int i = 0; i < tamanho;i++){
            vetor[i] = s.nextInt();
        }
        return vetor;
    }
    
    private static void exibirVetor(int[] vetor){
        System.out.print("{");
        for(int i = 0; i < vetor.length - 1;i++){
            System.out.printf("%d,",vetor[i]);
        }
        System.out.printf("%d}\n",vetor[vetor.length - 1]);
    }
}
