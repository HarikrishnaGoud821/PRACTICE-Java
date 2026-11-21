//6. Write a Java program that checks if a number is divisible by both 2 and 3.
import java.util.Scanner;
public class DivisibleBy2And3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("DIVISIBAL OF BOTH '2' AND '3'.");
        }
        else{
            System.out.println("NOT DIVISABLE BOTH '2' AND '3'.");
        }
        sc.close();

    }
    
}
