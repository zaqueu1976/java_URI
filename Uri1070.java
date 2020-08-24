import java.util.Scanner;
    public class Uri1070{
    public static void main(String[] args){

        int i, X, howManyOdd = 6;
            Scanner input = new Scanner(System.in);
                X = input.nextInt();
                for( i = X; i < (X+(howManyOdd*2)) ; i+=2){
            
            int odd;
                if(i % 2 == 0){
                    odd = i + 1;
            
            System.out.printf("%d\n", odd);
        }else{
            
            odd = i;
                System.out.printf("%d\n", odd);
        }
      }
    }
}