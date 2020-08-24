import java.util.Scanner;
    public class Uri1008{
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
        	    
                int A = entrada.nextInt();
        	    int B = entrada.nextInt();
        
		        double C = entrada.nextDouble();
        	    double salario = (B*C);
        
        System.out.printf("NUMBER = %d\n",A);
        System.out.printf("SALARIO = U$ %.2f\n",salario);      
    }
}