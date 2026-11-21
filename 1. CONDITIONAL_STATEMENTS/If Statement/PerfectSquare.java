//5. Write a Java program that determines if a given number is a perfect square.
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :");
        int num = sc.nextInt();
        if(num>=0 && Math.sqrt(num)==(int)Math.sqrt(num)){
            System.out.println("PERFECT SQUARE");
        }
        else{
            System.out.println("NOT A PERFECT SQUARE");
        }
sc.close();
    }
    
}
