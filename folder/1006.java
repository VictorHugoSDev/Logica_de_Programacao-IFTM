import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    float A = s.nextFloat();
	    float B = s.nextFloat();
	    float C = s.nextFloat();
	    
	    float MEDIA = ((A * 2) + (B * 3) + (C * 5))/10;
	    
	    System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}
