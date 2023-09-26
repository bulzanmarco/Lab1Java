package ex4;

import java.util.Random;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int a= random.nextInt(31);
        int b= random.nextInt(31);
        System.out.println(a + " " + b);
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("CMMDC "+ a);
    }
}
