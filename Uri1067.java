import java.util.Scanner;
    public class Uri1067{
    public static void main(String[] args){

        int X;
            Scanner input =new Scanner(System.in);
            X = input.nextInt();
        
        System.out.print(1+"\n");
            for (int i = 1; i < X-1; i+=2) {
            int oddNumber = i + 2;
            System.out.print(oddNumber+"\n");
        }
    }
 
}