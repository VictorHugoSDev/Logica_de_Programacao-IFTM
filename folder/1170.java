import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int x = s.nextInt();
    	double comida[] = new double[x];
    	
    	
    	for(int i=0; i<x; i++){
    	    comida[i] = s.nextDouble();
    	}
    	
    	for(int i=0; i<x;i++){
    	    double quantidades = comida[i];
    	    int dias = 0;
    	   
    	    while(quantidades > 1){
    	        quantidades/=2;
    	        dias++;
    	    }
	    System.out.println(dias + " dias");
	        
	    }
	}
}
