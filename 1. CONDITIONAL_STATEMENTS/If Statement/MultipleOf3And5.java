//4. Write a Java program that checks if a number is a multiple of both 3 and 5.
import java.util.Scanner;
public class MultipleOf3And5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num = sc.nextInt();
        if(num % 3==0 && num %5==0){
            System.out.println("MULTIPLE OF '3'AND '5'.");
        }
        else if(num % 3==0){
            System.out.println("MULTIPLE OF '3'.");

        }else if(num % 5==0){
            System.out.println("MULTIPLE OF '5'.");

        }else{
            System.out.println("NOT THE MULTIPLE OF '3' AND '5'.");
        }
        sc.close();

    }
}
