import java.util.Scanner;
    public class Uri1005{
     public static void main(String[] args){
            Scanner nota = new Scanner(System.in);
            double A, B, med;

            A = nota . nextDouble();
            B = nota . nextDouble();

        med = ((A * 3.5f) + (B * 7.5f)) / 11f; 
        System.out.printf ("MEDIA = %.5f\n", med);

        nota.close();
    }
}