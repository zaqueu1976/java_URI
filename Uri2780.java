//Basquete de Robôs
import java.util.Scanner;
    public class Uri2780{
        public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);
        int D = leitor.nextInt();
        
        if (D <= 800) 
        	System.out.println(1);
        else if (D <= 1400)
        	System.out.println(2);
        else
        	System.out.println(3);
    }
	
}