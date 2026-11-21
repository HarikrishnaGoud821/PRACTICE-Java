//8. Write a Java program that checks if a given number is a multiple of 4.
import java.util.Scanner;
public class MultipleOf4 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num = sc.nextInt();
        if(num%4==0){
            System.out.println("MULTIPLE OF '4'.");

        }else{
            System.out.println("NOT MULTIPLE OF '4'. ");

        }
        sc.close();

    }
}
