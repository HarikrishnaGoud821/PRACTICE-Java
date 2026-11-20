//1. Write a Java program that checks if a number is positive.
import java.util.Scanner;
public class CheckPositive01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("POSITIVE NUMBER.");
        }
    }
    
}