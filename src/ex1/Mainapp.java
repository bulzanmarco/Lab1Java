package ex1;

import java.util.Random;
import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Latime=");
        int a= scanner.nextInt();
        System.out.print("Lungime=");
        int b= scanner.nextInt();
        System.out.println("Perimetru "+(a+b));
        System.out.println("Arie "+ (a*b));
        scanner.close();
    }

}
