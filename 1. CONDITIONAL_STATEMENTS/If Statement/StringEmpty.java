//2. Write a Java program that checks if a given String is empty
import java.util.Scanner;
public class StringEmpty{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name=sc.next();
        if(name.isEmpty()){
            System.out.println("EMPTY STRING");
        }else{
            System.out.println("NOT EMPTY STRING");
        }
        sc.close();


    }
}