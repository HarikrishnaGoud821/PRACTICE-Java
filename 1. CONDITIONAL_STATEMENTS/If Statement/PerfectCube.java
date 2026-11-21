//7. Write a Java program that determines if a number is a perfect cube.

import java.util.Scanner;

public class PerfectCube {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num>=0 && Math.cbrt(num)==(int)Math.cbrt(num)){
            System.out.println("PERFECT CUBE");
        }else{
            System.out.println("NOT PERFECT CUBE.");
        }
sc.close();
    }
    
}
