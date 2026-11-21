//3. Write a Java program that determines if a number is positive, negative, or zero using only if statements and no else-if or else.
import java.util.Scanner;
public class CheckPositiveNegativeZero {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num= sc.nextInt();
    if(num > 0){
        System.out.println("POSITIVE NUMBER");

    }else if(num<0){
        System.out.println("NEGATIVE NUMBER");

    }else {
        System.out.println("ZERO");

    }
    sc.close();
  }  
}
