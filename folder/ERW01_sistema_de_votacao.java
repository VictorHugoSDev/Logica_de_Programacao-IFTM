import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X;
		int cand1 = 0, cand2 = 0, cand3 = 0, nulos = 0, brancos = 0;
		
		while((X = s.nextInt()) > 0){
		    
		    if(X == 1){
		        cand1++;
		    }
		    else if(X == 2){
		        cand2++;
		    }
		    else if(X == 3){
		        cand3++;
		    }
		    else if(X == 4){
		        nulos++;
		    }
		    else{
		        brancos++;
		    }
		    
		}
		System.out.println("Candidato 1 : "+ cand1 + " voto(s)");
		System.out.println("Candidato 2 : "+ cand2 + " voto(s)");
		System.out.println("Candidato 3 : "+ cand3 + " voto(s)");
		System.out.println("Nulos : "+ nulos + " voto(s)");
		System.out.println("Brancos : "+ brancos + " voto(s)");
	}
}
