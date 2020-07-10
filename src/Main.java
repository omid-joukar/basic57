import java.util.Scanner;

/**
 * Created by KPS on 7/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number : ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1 ; i<= Math.sqrt(number);i++){
            if (number%i==0 && i*i !=number){
                count+=2;
            }
            else if(i*i==number){
                count++;
            }
        }
        System.out.println("the count is : " + count);
    }
}
